package soporte.aspects;

import game.IPosicionable;
import game.IAtravesable;
import javax.swing.JButton;

public interface IGraphicAspect extends IAtravesable, IPosicionable {

	void updateImage();

	void saveState();

	void resetState();

	void setCanvas(JButton canv);

	JButton getCanvas();

	Object getObject();
}
