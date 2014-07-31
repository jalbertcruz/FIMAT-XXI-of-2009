package gui;

import java.io.IOException;
import org.antlr.runtime.RecognitionException;

import game.*;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;
import soporte.aspects.IGraphicAspect;

public class MainGUI extends javax.swing.JFrame {

    class Assertions {

        public String msg = "";

        public boolean canAccess(IPosicionable element, Direccion dir) {
            boolean res = false;
            int[] dF = {0, 1, 0, -1};
            int[] dC = {1, 0, -1, 0};

            int fila = element.getFila() - 1 + dF[dir.ordinal()];
            int columna = element.getColumna() - 1 + dC[dir.ordinal()];

            // Si esta entre los limites del tablero
            if ((fila > -1 && fila < aspectos.length) && (columna > -1 && columna < aspectos.length)) {
                if (aspectos[fila][columna].peek() instanceof IAtravesable) {
                    if (((IAtravesable) (aspectos[fila][columna].peek())).isPasar()) {
                        res = true;
                    } else {
                        msg = "No permite que se pase(" + aspectos[fila][columna].peek().getClass().getName() + ")";
                    }
                } else {
                    msg = "No es atravesable";
                }
            } else {
                msg = "Fuera de rango.";
            }
            return res;
        }

        public boolean existObject(IPosicionable element, Direccion dir, IPosicionable other) {
            int[] dF = {0, 1, 0, -1};
            int[] dC = {1, 0, -1, 0};
            return ((element.getFila() + dF[dir.ordinal()]) == other.getFila()) && ((element.getColumna() + dC[dir.ordinal()]) == other.getColumna());
        }
    }
    private static final long serialVersionUID = -3894278413480919783L;
    final int dimensionDelTablero = 20;
    public IRobot robot;
    public IPuerta puerta;
    public Hashtable<String, Object> context;
    private Editor ed;
    private JButton[][] casillas;
    private Stack<IGraphicAspect>[][] aspectos;

    @SuppressWarnings("unchecked")
    public MainGUI() {
        initComponents();
        context = new Hashtable<String, Object>();

        context.put("gui", this);

        casillas = new JButton[dimensionDelTablero][dimensionDelTablero];
        aspectos = (Stack<IGraphicAspect>[][]) new Stack<?>[dimensionDelTablero][dimensionDelTablero];
        context.put("tablero", new Assertions());

        for (int i = 0; i < dimensionDelTablero; i++) {
            for (int j = 0; j < dimensionDelTablero; j++) {
                JButton nButt = new JButton();
                nButt.setBackground(Color.WHITE);
                nButt.setBorder(null);
                casillas[i][j] = nButt;
                tablero.add(nButt);

                Stack<IGraphicAspect> asp = new Stack<IGraphicAspect>();

                asp.push(new soporte.aspects.Vacio(new game.Vacio(i + 1, j + 1), nButt));
                aspectos[i][j] = asp;

            }
        }

        ed = new Editor(this);
    }

    public void setLadrillo(long fila, long columna) {

        int nFila = (int) fila - 1;
        int nColumna = (int) columna - 1;

        soporte.aspects.Ladrillo lad = new soporte.aspects.Ladrillo(new game.Ladrillo(nFila + 1, nColumna + 1), casillas[nFila][nColumna]);
        aspectos[nFila][nColumna].push(lad);

        ArrayList<Long> par = new ArrayList<Long>();
        par.add(fila);
        par.add(columna);
        sincronizarLogica_GUI(par);

    }

    public void setPuerta(IPuerta p) {
        puerta = p;
        int f = p.getFila() - 1;
        int c = p.getColumna() - 1;
        aspectos[f][c].push(new soporte.aspects.Puerta(p, casillas[f][c]));

        ArrayList<Long> par = new ArrayList<Long>();
        par.add(new Long(p.getFila()));
        par.add(new Long(p.getColumna()));
        sincronizarLogica_GUI(par);

    }

    public void setRobot(IRobot r) {
        robot = r;
        int f = r.getFila() - 1;
        int c = r.getColumna() - 1;
        aspectos[f][c].push(new soporte.aspects.Robot(r, casillas[f][c]));

        ArrayList<Long> par = new ArrayList<Long>();
        par.add(new Long(r.getFila()));
        par.add(new Long(r.getColumna()));
        sincronizarLogica_GUI(par);

    }

    @SuppressWarnings("unchecked")
    public void sincronizarLogica_GUI(List posiciones) {

        int fInit = (int) ((Long) posiciones.get(0) - 1);
        int cInit = (int) ((Long) posiciones.get(1) - 1);

        setTitle(fInit + " : " + cInit);

        if (posiciones.size() == 2) {
            aspectos[fInit][cInit].peek().updateImage();
        } // Es de tamanno 4
        else {
            int fEnd = (int) ((Long) posiciones.get(2) - 1);
            int cEnd = (int) ((Long) posiciones.get(3) - 1);

            IGraphicAspect aspInit = aspectos[fInit][cInit].pop();
            aspInit.setCanvas(aspectos[fEnd][cEnd].peek().getCanvas());
            aspectos[fEnd][cEnd].push(aspInit);
            aspectos[fInit][cInit].peek().updateImage();
            aspectos[fEnd][cEnd].peek().updateImage();
        }
        // refresh
        update(getGraphics());

//        for (int i = 0; i < aspectos.length; i++) {
//            for (int j = 0; j < aspectos[i].length; j++) {
//                Stack<IGraphicAspect> stack = aspectos[i][j];
//                System.out.print(stack.size() + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println();

    }

    public String getRubySrc() throws RecognitionException, IOException {
        return compiler.Compiler.pseudoCodeToRuby(ed.getJRubySrc());
    // return ed.getJRubySrc();
    }

    public int getFrameInterval() {
        return 500;
    }
    Stack<?>[][] copia;

    @SuppressWarnings("unchecked")
    public void saveState() {
        copia = aspectos.clone();
        for (int i = 0; i < aspectos.length; i++) {
            copia[i] = aspectos[i].clone();
            for (int j = 0; j < aspectos[i].length; j++) {
                copia[i][j] = (Stack<?>) aspectos[i][j].clone();
                for (IGraphicAspect rg : (Stack<IGraphicAspect>) copia[i][j]) {
                    rg.saveState();
                }
            }
        }

    }

    @SuppressWarnings("unchecked")
    public void resetState() {
        aspectos = (Stack<IGraphicAspect>[][]) copia;

        for (int i = 0; i < aspectos.length; i++) {
            for (int j = 0; j < aspectos[i].length; j++) {
                for (IGraphicAspect rg : (Stack<IGraphicAspect>) aspectos[i][j]) {
                    rg.resetState();
                }
                aspectos[i][j].peek().updateImage();
            }
        }
        saveState();
    }

    public void addSrcActionListener(ActionListener l) {
        ed.addSrcActionListener(l);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        portada = new javax.swing.JLayeredPane();
        formato = new javax.swing.JPanel();
        tablero = new javax.swing.JPanel();
        filas = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        columnas = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        formato.setBackground(new java.awt.Color(150, 206, 255));
        formato.setMaximumSize(new java.awt.Dimension(32711, 32711));

        tablero.setBackground(new java.awt.Color(150, 206, 255));
        tablero.setName(""); // NOI18N
        tablero.setLayout(new java.awt.GridLayout(20, 20, -2, -2));

        filas.setBackground(new java.awt.Color(150, 206, 255));
        filas.setLayout(new java.awt.GridLayout(20, 1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText("1");
        filas.add(jLabel8);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setText("2");
        filas.add(jLabel9);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setText("3");
        filas.add(jLabel10);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel11.setForeground(new java.awt.Color(153, 0, 0));
        jLabel11.setText("4");
        filas.add(jLabel11);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel12.setForeground(new java.awt.Color(153, 0, 0));
        jLabel12.setText("5");
        filas.add(jLabel12);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel13.setForeground(new java.awt.Color(153, 0, 0));
        jLabel13.setText("6");
        filas.add(jLabel13);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel14.setForeground(new java.awt.Color(153, 0, 0));
        jLabel14.setText("7");
        filas.add(jLabel14);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel15.setForeground(new java.awt.Color(153, 0, 0));
        jLabel15.setText("8");
        filas.add(jLabel15);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel16.setForeground(new java.awt.Color(153, 0, 0));
        jLabel16.setText("9");
        filas.add(jLabel16);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel17.setForeground(new java.awt.Color(153, 0, 0));
        jLabel17.setText("10");
        filas.add(jLabel17);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel31.setForeground(new java.awt.Color(153, 0, 0));
        jLabel31.setText("11");
        filas.add(jLabel31);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel32.setForeground(new java.awt.Color(153, 0, 0));
        jLabel32.setText("12");
        filas.add(jLabel32);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel33.setForeground(new java.awt.Color(153, 0, 0));
        jLabel33.setText("13");
        filas.add(jLabel33);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel34.setForeground(new java.awt.Color(153, 0, 0));
        jLabel34.setText("14");
        filas.add(jLabel34);

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel35.setForeground(new java.awt.Color(153, 0, 0));
        jLabel35.setText("15");
        filas.add(jLabel35);

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel36.setForeground(new java.awt.Color(153, 0, 0));
        jLabel36.setText("16");
        filas.add(jLabel36);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel37.setForeground(new java.awt.Color(153, 0, 0));
        jLabel37.setText("17");
        filas.add(jLabel37);

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel38.setForeground(new java.awt.Color(153, 0, 0));
        jLabel38.setText("18");
        filas.add(jLabel38);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel39.setForeground(new java.awt.Color(153, 0, 0));
        jLabel39.setText("19");
        filas.add(jLabel39);

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel40.setForeground(new java.awt.Color(153, 0, 0));
        jLabel40.setText("20");
        filas.add(jLabel40);

        columnas.setBackground(new java.awt.Color(150, 206, 255));
        columnas.setAlignmentX(1.5F);
        columnas.setAlignmentY(1.5F);
        columnas.setLayout(new java.awt.GridLayout(1, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel18.setForeground(new java.awt.Color(153, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("1");
        jLabel18.setAlignmentX(0.5F);
        jLabel18.setMinimumSize(new java.awt.Dimension(4, 4));
        jLabel18.setPreferredSize(new java.awt.Dimension(8, 8));
        columnas.add(jLabel18);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel19.setForeground(new java.awt.Color(153, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("2");
        jLabel19.setAlignmentX(0.5F);
        columnas.add(jLabel19);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel20.setForeground(new java.awt.Color(153, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("3");
        columnas.add(jLabel20);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel21.setForeground(new java.awt.Color(153, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("4");
        columnas.add(jLabel21);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel22.setForeground(new java.awt.Color(153, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("5");
        columnas.add(jLabel22);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel23.setForeground(new java.awt.Color(153, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("6");
        columnas.add(jLabel23);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel24.setForeground(new java.awt.Color(153, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("7");
        columnas.add(jLabel24);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel25.setForeground(new java.awt.Color(153, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("8");
        columnas.add(jLabel25);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel26.setForeground(new java.awt.Color(153, 0, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("9");
        columnas.add(jLabel26);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel27.setForeground(new java.awt.Color(153, 0, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("10");
        jLabel27.setMinimumSize(new java.awt.Dimension(4, 4));
        columnas.add(jLabel27);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("11");
        columnas.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("12");
        columnas.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("13");
        columnas.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("14");
        columnas.add(jLabel4);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("15");
        columnas.add(jLabel5);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("16");
        columnas.add(jLabel6);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("17");
        columnas.add(jLabel7);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel28.setForeground(new java.awt.Color(153, 0, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("18");
        columnas.add(jLabel28);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel29.setForeground(new java.awt.Color(153, 0, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("19");
        columnas.add(jLabel29);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel30.setForeground(new java.awt.Color(153, 0, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("20");
        columnas.add(jLabel30);

        javax.swing.GroupLayout formatoLayout = new javax.swing.GroupLayout(formato);
        formato.setLayout(formatoLayout);
        formatoLayout.setHorizontalGroup(
            formatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formatoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(filas, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablero, javax.swing.GroupLayout.PREFERRED_SIZE, 969, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272))
            .addGroup(formatoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(columnas, javax.swing.GroupLayout.PREFERRED_SIZE, 989, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(261, Short.MAX_VALUE))
        );
        formatoLayout.setVerticalGroup(
            formatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formatoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(columnas, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filas, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                    .addComponent(tablero, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(667, 667, 667))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(913, 913, 913)
                        .addComponent(portada, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(formato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(formato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(portada)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void formWindowOpened(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowOpened
        //saveState();
        ed.setVisible(true);
    }// GEN-LAST:event_formWindowOpened
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel columnas;
    private javax.swing.JPanel filas;
    private javax.swing.JPanel formato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane portada;
    private javax.swing.JPanel tablero;
    // End of variables declaration//GEN-END:variables
    }


