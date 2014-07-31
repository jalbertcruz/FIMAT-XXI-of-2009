include Java 
 
require './../../Game/dist/Game' 

# Dir["/some/path/*.jar"].each { |jar| require jar }

include_class "gui.MainGUI"
include_class "game.Direccion"

include_class("java.lang.Thread") {|pkg,name| 'J' + name}

  
include_class("game.Robot") {|pkg,name| 'J' + name}
  
include_class("game.Puerta") {|pkg,name| 'J' + name}


class ClickAction 
  include java.awt.event.ActionListener

  def initialize &block
    @block = block; 
  end 

  def actionPerformed evt
    @block.call evt
  end
end

  

class Robot < JRobot 

    def initialize context, p0, p1, p2
       super p0, p1, p2
       @context   = context
       @oldValues = {}
       @oldValues['fila']    = fila
       @oldValues['columna'] = columna
    end

    def locationChange?
        return ((@oldValues['fila'] != fila) || (@oldValues['columna'] != columna))
    end

  # Conjunto de metodos
  def girarDerecha 
    @oldValues['fila'] = fila
    @oldValues['columna'] = columna
    if (true)
        super 
        if locationChange?
            @context['gui'].sincronizarLogica_GUI( [@oldValues['fila'], @oldValues['columna'], fila, columna] )
        else
            @context['gui'].sincronizarLogica_GUI( [fila, columna] )
        end
        JThread.sleep @context['gui'].getFrameInterval
    else
        puts 'Error in ' + fila.to_s + ' : ' + columna.to_s + ' => ' + @context['tablero'].msg
    end
  end 

  def girarIzquierda 
    @oldValues['fila'] = fila
    @oldValues['columna'] = columna
    if (true)
        super 
        if locationChange?
            @context['gui'].sincronizarLogica_GUI( [@oldValues['fila'], @oldValues['columna'], fila, columna] )
        else
            @context['gui'].sincronizarLogica_GUI( [fila, columna] )
        end
        JThread.sleep @context['gui'].getFrameInterval
    else
        puts 'Error in ' + fila.to_s + ' : ' + columna.to_s + ' => ' + @context['tablero'].msg
    end
  end 

  def darPaso 
    @oldValues['fila'] = fila
    @oldValues['columna'] = columna
    if (@context['tablero'].canAccess(self, direccion))
        super 
        if locationChange?
            @context['gui'].sincronizarLogica_GUI( [@oldValues['fila'], @oldValues['columna'], fila, columna] )
        else
            @context['gui'].sincronizarLogica_GUI( [fila, columna] )
        end
        JThread.sleep @context['gui'].getFrameInterval
    else
        puts 'Error in ' + fila.to_s + ' : ' + columna.to_s + ' => ' + @context['tablero'].msg
    end
  end 

  def abrirPuerta p0
    @oldValues['fila'] = fila
    @oldValues['columna'] = columna
    if (@context['tablero'].existObject(self, direccion, p0))
        super p0
        if locationChange?
            @context['gui'].sincronizarLogica_GUI( [@oldValues['fila'], @oldValues['columna'], fila, columna] )
        else
            @context['gui'].sincronizarLogica_GUI( [fila, columna] )
        end
        JThread.sleep @context['gui'].getFrameInterval
    else
        puts 'Error in ' + fila.to_s + ' : ' + columna.to_s + ' => ' + @context['tablero'].msg
    end
  end 

  def cerrarPuerta p0
    @oldValues['fila'] = fila
    @oldValues['columna'] = columna
    if (@context['tablero'].existObject(self, direccion, p0))
        super p0
        if locationChange?
            @context['gui'].sincronizarLogica_GUI( [@oldValues['fila'], @oldValues['columna'], fila, columna] )
        else
            @context['gui'].sincronizarLogica_GUI( [fila, columna] )
        end
        JThread.sleep @context['gui'].getFrameInterval
    else
        puts 'Error in ' + fila.to_s + ' : ' + columna.to_s + ' => ' + @context['tablero'].msg
    end
  end 

  def darMediaVuelta 
    @oldValues['fila'] = fila
    @oldValues['columna'] = columna
    if (true)
        super 
        if locationChange?
            @context['gui'].sincronizarLogica_GUI( [@oldValues['fila'], @oldValues['columna'], fila, columna] )
        else
            @context['gui'].sincronizarLogica_GUI( [fila, columna] )
        end
        JThread.sleep @context['gui'].getFrameInterval
    else
        puts 'Error in ' + fila.to_s + ' : ' + columna.to_s + ' => ' + @context['tablero'].msg
    end
  end 


end
  

class Puerta < JPuerta 

    def initialize context, p0, p1
       super p0, p1
       @context   = context
       @oldValues = {}
       @oldValues['fila']    = fila
       @oldValues['columna'] = columna
    end

    def locationChange?
        return ((@oldValues['fila'] != fila) || (@oldValues['columna'] != columna))
    end

  # Conjunto de metodos
  def abrir 
    @oldValues['fila'] = fila
    @oldValues['columna'] = columna
    if (true)
        super 
        if locationChange?
            @context['gui'].sincronizarLogica_GUI( [@oldValues['fila'], @oldValues['columna'], fila, columna] )
        else
            @context['gui'].sincronizarLogica_GUI( [fila, columna] )
        end
        JThread.sleep @context['gui'].getFrameInterval
    else
        puts 'Error in ' + fila.to_s + ' : ' + columna.to_s + ' => ' + @context['tablero'].msg
    end
  end 

  def cerrar 
    @oldValues['fila'] = fila
    @oldValues['columna'] = columna
    if (true)
        super 
        if locationChange?
            @context['gui'].sincronizarLogica_GUI( [@oldValues['fila'], @oldValues['columna'], fila, columna] )
        else
            @context['gui'].sincronizarLogica_GUI( [fila, columna] )
        end
        JThread.sleep @context['gui'].getFrameInterval
    else
        puts 'Error in ' + fila.to_s + ' : ' + columna.to_s + ' => ' + @context['tablero'].msg
    end
  end 


end



class JRMainGUI < MainGUI
  
  def initialize
    super
    setEvents
  end
  
private
  def setEvents
    meth = ClickAction.new do #|evt|
      toFront
      instance_eval getRubySrc
    end
    addSrcActionListener meth
  end
end

gui = JRMainGUI.new 
r = Robot.new( gui.context, 1, 2, Direccion::Este )
p = Puerta.new( gui.context, 7, 8 )
gui.robot  = r
gui.puerta = p

for i in (1..6)
  gui.setLadrillo i, 8
end

for i in (1..3)
  gui.setLadrillo i, 5
end

for i in (8..12)
  gui.setLadrillo i, 8
end

gui.saveState

gui.visible = true