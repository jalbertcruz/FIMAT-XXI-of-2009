package soporte.aspects;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Puerta extends RecursosGraficos {

    game.IPuerta obj;
    ImageIcon doorOpen, doorClose;

    public Puerta(game.IPuerta puerta, JButton canv) {
        super(canv);
        this.obj = puerta;
        doorOpen = new ImageIcon(getClass().getResource("/imgs/puertaAbierta.jpg"));
        doorClose = new ImageIcon(getClass().getResource("/imgs/puertaCerrada.jpg"));

    }

    public boolean isPasar() {
        return obj.isAbierta();
    }

    public int getFila() {
        return obj.getFila();
    }

    public int getColumna() {
        return obj.getColumna();
    }

    public ImageIcon getImagen() {
        return obj.isAbierta() ? doorOpen : doorClose;
    }

    public Object getObject() {
        return obj;
    }
    
//    @Override
//    public int hashCode(){
//    	return "puerta".hashCode() + obj.getFila() + obj.getColumna();
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Puerta other = (Puerta) obj;
//        if (this.obj != other.obj && (this.obj == null || !this.obj.equals(other.obj))) {
//            return false;
//        }
//        return true;
//    }
}
