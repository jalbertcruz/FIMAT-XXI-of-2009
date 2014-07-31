package soporte.aspects;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Vacio extends RecursosGraficos {

    ImageIcon imagen;
    game.Vacio obj;
    
    public Vacio(game.Vacio obj, JButton canv) {
        super(canv);
        this.obj = obj;
        imagen = null; //new ImageIcon(getClass().getResource("/imgs/vacio.jpg"));
    }

    public boolean isPasar() {
        return true;
    }

    public int getFila() {
        return obj.getFila();
    }

    public int getColumna() {
        return obj.getColumna();
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public Object getObject() {
        return obj;
    }
//    @Override
//    public int hashCode(){
//    	return "vacio".hashCode() + fila + columna;
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
//        final Vacio other = (Vacio) obj;
//        if (this.fila != other.fila) {
//            return false;
//        }
//        if (this.columna != other.columna) {
//            return false;
//        }
//        return true;
//    }
}
