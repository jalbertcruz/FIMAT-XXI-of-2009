
grammar Robot;

@header {
package compiler;
}
@lexer::header{import compiler;}


program	 returns [String valor]
@init {
  java.util.ArrayList<String> vals = new java.util.ArrayList<String>();
  $valor = "";
}: 
  statement[vals]* {
  
    String res = "";
    for(String str : vals)
      res += str + "\n";
       
    $valor = res;
    
  }
 ;

controlStructure returns [String valor]
@init {
  $valor = "";
}: forControl 
    {
     $valor = $forControl.valor;
    }  
  | ifControl
    {
     $valor = $ifControl.valor;
    }  
    | repetirControl
    {
      $valor = $repetirControl.valor;
    }
 ;	

repetirControl returns [String valor]
@init {
  $valor = "";
}
 : 'repetir' expr 'veces' block 
 {
   $valor = $expr.valor + ".times { \n" + $block.valor + "\n } \n";
 }
;

ifControl returns [String valor]
@init {
  $valor = "";
}
 : 'si'	expr 'entonces' block elseControl
	 {
	   String res = "if "+ $expr.valor + "\n";
	   res += $block.valor + "\n" ;
	   if ($elseControl.valor.equals(""))
	     $valor = res + " end \n" ;
	   else
	     $valor =  res + "else \n" + $elseControl.valor +" \n end \n" ;
	 }
 ;

elseControl returns [String valor]
@init {
  $valor = "";
} 
	: 'sino' block
	{
	  $valor = $block.valor ;
	}
	|
	;

forControl returns [String valor]
@init {
  $valor = "";
}: 
'desde' ID  '<-' PInit=expr 'hasta' PFinal=expr paso 'hacer' block 
 { 
   $valor = $ID.text + " = " + $PInit.valor + "\n" +
   "__sig = true \n" + 
   "if " + $paso.valor + " > 0 \n" + 
   "  __sig = " + $ID.text + " <= " + $PFinal.valor + "\n" +
   "else \n" +
   "  __sig = " + $ID.text + " >= " + $PFinal.valor + "\n" +
   "end \n" +
   "while __sig \n" +
   $block.valor + "\n" +
   $ID.text + " += " + $paso.valor + " \n" +
   "if " + $paso.valor + " > 0 \n" + 
   "  __sig = " + $ID.text + " <= " + $PFinal.valor + "\n" +
   "else \n" +
   "  __sig = " + $ID.text + " >= " + $PFinal.valor + "\n" +
   "end \n end \n";
 }
;

paso returns [String valor] 
@init {
  $valor = "";
}
    : 'con' 'paso' expr { $valor = $expr.valor; }
      |                  { $valor = "1";         }
;        
        
block returns [String valor]
@init {
  $valor = "";
  java.util.ArrayList<String> vals = new java.util.ArrayList<String>();
}
: 'inicio'
    statement[vals]*
  'fin'
  {  
   String res = "";
   for(String str : vals)
      res += "\n " + str;
   $valor = res;  
  }  
  ;


expr returns [String valor]
@init {
  java.util.Stack<String> valsMasExpr = new java.util.Stack<String>();
  $valor = "";
}
: termino masExpresion[valsMasExpr] 
	  {
	    String res = "";
	    while(! valsMasExpr.isEmpty())
  	       res += valsMasExpr.pop();
  	       
	    $valor = $termino.valor + res;	
	  }
	  ;

	
statement[java.util.ArrayList<String> vals] 
        : ID '<-' expr ';'    { $vals.add( $ID.text + " = " + $expr.valor ); }
        | 'retornar' expr ';' { $vals.add( " return " + $expr.valor );       }
        | block	              { $vals.add( $block.valor );	             }
        | controlStructure    { $vals.add( $controlStructure.valor );        }
	| methodCall   ';'    { $vals.add( $methodCall.valor );              }
        ;

methodCall returns [String valor]
@init{
 $valor = "";
 java.util.Stack<String> methCallValues = new java.util.Stack<String>();
}
	:  ID paramsMethodCall methodCallExtra[methCallValues]
	{
	    String res = "" ;
	    
	    // para la entrada de datos por GUI
	    if ( $ID.text.equals( "leer" ) ){
	      res += "_IOWindow = InputOutput.new 'Entrada de datos' \n" ;
	      for(int i = 0; i < $paramsMethodCall.valores.size(); i += 2) 
	      	res += "_IOWindow.adicionarMensaje " + $paramsMethodCall.valores.get(i) + "\n";  
	      	
	      res += "_IOWindow.visible = true \n" ;
	      int j = 0;
	      for ( int i = 1; i < $paramsMethodCall.valores.size(); i += 2 ){
	      	res += $paramsMethodCall.valores.get(i) + " = ___convertirTipo( _IOWindow.valores["+ j + "] ) \n" ;
	      	j++;
	      }
      	      res +=  "_IOWindow.dispose \n" ;
      	      
	    }
	    // para la salida de datos por GUI
	    else if( $ID.text.equals("mostrar")){
	      res += "_IOWindow = InputOutput.new 'Salida de datos' \n" ;
	      for(int i = 0; i < $paramsMethodCall.valores.size(); i += 2) 
	        res += "_IOWindow.adicionarFila( " + $paramsMethodCall.valores.get(i) + ", " + $paramsMethodCall.valores.get(i + 1) + " ) \n";
	        
              res += "_IOWindow.visible = true \n" ;
	      res +=  "_IOWindow.dispose \n" ;           
	    }
	    else{
	           res = $ID.text ;
	  	   if ( $paramsMethodCall.valores.size() > 0 )
	  	      res += "( " + $paramsMethodCall.valores.get(0);
	  	      
	  	   for(int i = 1; i < $paramsMethodCall.valores.size(); i++)
	  	      res += ", " + $paramsMethodCall.valores.get(i);

	  	      
	  	   if ( $paramsMethodCall.valores.size() > 0 )
  	  	      res += ")";
	  	   
		   while(! methCallValues.isEmpty())
	  	      res += methCallValues.pop() ;
	  	      
	 	}
	 	
	   $valor = res;
	}
	; 
 
methodCallExtra [ java.util.Stack<String> methodCallExtraValues ] 
	: '.' ID paramsMethodCall methodCallExtra [ methodCallExtraValues ]
	{
            String res = ""; 

  	    if ( $paramsMethodCall.valores.size() > 0 )
  	       res = "." + $ID.text + "(" + $paramsMethodCall.valores.get(0);
  	      
  	    for(int i = 1; i < $paramsMethodCall.valores.size(); i++)
  	       res += ", " + $paramsMethodCall.valores.get(i);

            if ( $paramsMethodCall.valores.size() > 0 )
               res += ")";
            else
               res = "." + $ID.text;
               
	    $methodCallExtraValues.push ( res ) ;
	    
	}
	
	|
	
	;

paramsMethodCall returns [java.util.Stack<String> valores]

@init{
 $valores = new java.util.Stack<String>();
 java.util.Stack<String> paramsMethCallValues = new java.util.Stack<String>();
}
	:	'(' expr paramsMethodCallExtra[paramsMethCallValues] ')'
	{
	
	   $valores.push( $expr.valor );
	   
 	   while(! paramsMethCallValues.isEmpty())
  	       $valores.push( paramsMethCallValues.pop() );
	   
	}
	| 
	;

paramsMethodCallExtra[java.util.Stack<String> paramsMethCall]
	: ', ' expr paramsMethodCallExtra[paramsMethCall]
	{
	     paramsMethCall.push ($expr.valor);
	}
	|	
	;

masExpresion[java.util.Stack<String> valsMasExpr]
	: opLevel2 termino masExpresion[valsMasExpr]
	{ 
	    valsMasExpr.push( $opLevel2.valor + $termino.valor ); 
	}
	|	
	;

opLevel2 returns [String valor]
@init {
  valor = "";
}	:	'+' {$valor = "+";}
	|	'-' {$valor = "-";}
	;

termino	returns [String valor]
@init {
  $valor = "";
  java.util.Stack<String> valsMasTerm = new java.util.Stack<String>();
}	:  factor masTermino[valsMasTerm] 
		{ 
		   String res = "";
		   while(! valsMasTerm.isEmpty())
		    res += valsMasTerm.pop();

  		   $valor = $factor.valor + res;
		}
	;

masTermino [java.util.Stack<String> valsMasTerm]
	:  opLevel1 factor masTermino[valsMasTerm]
		{ valsMasTerm.push ( $opLevel1.valor + $factor.valor); }
	|  
	;

	
opLevel1 returns [String valor]
@init {
  valor = "";
}	: '*'   {$valor = "*";}
	| 'div' {$valor = "/";}
	| 'mod' {$valor = "\%";}
	| '>'   {$valor = ">";}
	| '<'   {$valor = "<";}
	;

factor	returns [String valor]
@init {
  $valor = "" ;
}	: '(' expr ')'  { $valor = "(" + $expr.valor + ")"; }
	| ID 	        { $valor = $ID.text;                } 
	| INT           { $valor = $INT.text;               }
	| StrLiteral    { $valor = $StrLiteral.text;        }
	| exprUnaria    { $valor = $exprUnaria.valor;       }
	//| methodCall    { $valor = $methodCall.valor;       }
	;
	
exprUnaria returns [String valor]
@init {
  $valor = "";
}	:	'no'      expr    {$valor = "! " + $expr.valor;}
	|       'opuesto' expr    {$valor = "- " + $expr.valor;}
	|       '-'       expr    {$valor = "- " + $expr.valor;}
	;

EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    ;

ID      : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
INT     : ('0'..'9')+ ;
StrLiteral
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;
WS      : (' '|'\t'|'\n')+ {$channel=HIDDEN;} ;
