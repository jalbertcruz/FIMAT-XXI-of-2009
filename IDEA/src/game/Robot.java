package game;

import soporte.*;

@State("fila, columna, direccion")


public class Robot implements IRobot {

    @Require("@context['tablero'].canAccess(self, direccion)")
    @Command
    public void darPaso() {
        //          E, S, O, N (Este, Sur, Oeste, Norte)
        int[] dF = {0, 1, 0, -1};
        int[] dC = {1, 0, -1, 0};
        fila += dF[direccion.ordinal()];
        columna += dC[direccion.ordinal()];
    }

    @Query
    public int getFila() {
        return fila;
    }





    private int fila,  columna;

    private Direccion direccion;
    

    public Robot(int pFila, int pCol, Direccion dir) {
        fila = pFila;
        columna = pCol;
        direccion = dir;
    }

    @Command
    public void girarDerecha() {
        int val = direccion.ordinal() + 1;
        val = val % Direccion.values().length + 1;
        direccion = Direccion.values()[val - 1];
    }

    @Command
    public void girarIzquierda() {
        int val = direccion.ordinal() + 1;
        val = val == 1 ? Direccion.values().length : val - 1;
        direccion = Direccion.values()[val - 1];
    }

    @Require("@context['tablero'].existObject(self, direccion, p0)")
    @Command
    public void abrirPuerta(IPuerta p) {
        p.abrir();
    }

    @Require("@context['tablero'].existObject(self, direccion, p0)")
    @Command
    public void cerrarPuerta(IPuerta p) {
        p.cerrar();
    }

    public Direccion getDireccion() {
        return direccion;
    }

    @Query
    public int getColumna() {
        return columna;
    }

    @Override
    public String toString() {
        return "Fila: " + fila + ", columna: " + columna + " -- " + direccion;
    }

    @Command
    public void darMediaVuelta() {
        girarIzquierda();
        girarIzquierda();
    }
}
