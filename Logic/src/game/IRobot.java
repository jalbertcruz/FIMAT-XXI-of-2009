package game;

public interface IRobot extends IPosicionable {

    void girarDerecha();

    void darMediaVuelta();

    void girarIzquierda();

    void darPaso();

    Direccion getDireccion();
}