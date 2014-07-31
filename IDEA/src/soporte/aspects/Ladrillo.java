package soporte.aspects;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ladrillo extends RecursosGraficos {

    ImageIcon imagen;
    game.Ladrillo obj;

    public Ladrillo(game.Ladrillo obj, JButton canv) {
        super(canv);
        this.obj = obj;
        imagen = new ImageIcon(getClass().getResource("/imgs/ladrillo.jpg"));
    }

    @Override
    public ImageIcon getImagen() {
        return imagen;
    }

    public boolean isPasar() {
        return false;
    }

    public int getFila() {
        return obj.getFila();
    }

    public int getColumna() {
        return obj.getColumna();
    }

    public Object getObject() {
        return obj;
    }
    
//    @Override
//    public int hashCode(){
//    	return "ladrillo".hashCode() + fila + columna;
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
//        final Ladrillo other = (Ladrillo) obj;
//        if (this.fila != other.fila) {
//            return false;
//        }
//        if (this.columna != other.columna) {
//            return false;
//        }
//        return true;
//    }
    
}
