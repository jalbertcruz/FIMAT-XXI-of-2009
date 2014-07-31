package game;

import soporte.*;

@State("fila, columna, abierta")
public class Puerta implements IPuerta{

    boolean abierta;
    int fila, columna;

    public Puerta(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        abierta = false;
    }

    @Command
    //@Modify("abierta?")
    public void cerrar() {
        abierta = false;
    }

    @Command
    //@Modify("abierta?")
    public void abrir() {
        abierta = true;
    }

    public boolean isAbierta() {
        return abierta;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

}
