package soporte.aspects;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Robot extends RecursosGraficos  {

    ImageIcon dNorte;
    ImageIcon dEste;
    ImageIcon dSur;
    ImageIcon dOeste;
    game.IRobot obj;

    public Robot(game.IRobot robot, JButton canv) {
        super(canv);

        this.obj = robot;

        dNorte = new ImageIcon(getClass().getResource("/imgs/N.jpg"));
        dEste = new ImageIcon(getClass().getResource("/imgs/E.jpg"));
        dSur = new ImageIcon(getClass().getResource("/imgs/S.jpg"));
        dOeste = new ImageIcon(getClass().getResource("/imgs/W.jpg"));
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

    public ImageIcon getImagen() {
        ImageIcon[] _icons = new ImageIcon[]{dEste, dSur, dOeste, dNorte};
        return _icons[obj.getDireccion().ordinal()];
    }

    public Object getObject() {
        return obj;
    }
    
//    @Override
//    public int hashCode(){
//    	return "robot".hashCode() + obj.getFila() + obj.getColumna();
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
//        final Robot other = (Robot) obj;
//        if (this.obj != other.obj && (this.obj == null || !this.obj.equals(other.obj))) {
//            return false;
//        }
//        return true;
//    }
}
