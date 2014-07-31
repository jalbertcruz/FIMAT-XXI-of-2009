package soporte.aspects;

import java.util.Hashtable;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import dataInterchange.*;
import java.util.ArrayList;

public abstract class RecursosGraficos implements IGraphicAspect {

    protected JButton canvas;
    private Hashtable<String, Object> states;

    public RecursosGraficos(JButton canv) {
        canvas = canv;
        states = new Hashtable<String, Object>();
    }

    public void saveState() {
        FieldManipulator fManip = new FieldManipulator(getObject());
        ArrayList<String> keys = fManip.getFieldsNames();
        states.put("_canvas", canvas);
        if (keys != null) {
            for (String f : keys) {
                try {
                    states.put(f, fManip.read(f));
                } catch (IllegalArgumentException ex) {
                    Logger.getLogger(RecursosGraficos.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(RecursosGraficos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void resetState() {
        FieldManipulator fManip = new FieldManipulator(getObject());
        ArrayList<String> keys = fManip.getFieldsNames();
        canvas = (JButton) states.get("_canvas");

        if (keys != null) {
            for (String f : keys) {
                try {
                    fManip.write(f, states.get(f));
                } catch (IllegalArgumentException ex) {
                    Logger.getLogger(RecursosGraficos.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(RecursosGraficos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public JButton getCanvas() {
        return canvas;
    }

    public void setCanvas(JButton value) {
        canvas = value;
    }

    public abstract ImageIcon getImagen();

    public void updateImage() {
        canvas.setIcon(getImagen());
    }
}
