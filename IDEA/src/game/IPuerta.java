package game;


public interface IPuerta extends IPosicionable  {

    void abrir();

    void cerrar();

    boolean isAbierta();
}
