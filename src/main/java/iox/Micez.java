/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package iox;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import static iox.MouseTypeEvent.*;

/**
 *
 * @author rash4
 */
public class Micez implements MouseListener, MouseMotionListener, MouseWheelListener{
    private MouseSet evtz = new MouseSet();
    @Override public void mouseClicked(MouseEvent e) {
        this.evtz.execute(CLICKED, e);
    }
    @Override public void mousePressed(MouseEvent e) {
        this.evtz.execute(PRESSED, e);
    }
    @Override public void mouseReleased(MouseEvent e) {
        this.evtz.execute(RELEASED, e);
    }
    @Override public void mouseEntered(MouseEvent e) {
        this.evtz.execute(ENTERED, e);
    }
    @Override public void mouseExited(MouseEvent e) {
        this.evtz.execute(EXITED, e);
    }
    @Override public void mouseDragged(MouseEvent e) {
        this.evtz.execute(DRAGGED, e);
    }
    @Override public void mouseMoved(MouseEvent e) {
        this.evtz.execute(MOVED, e);
    }
    @Override public void mouseWheelMoved(MouseWheelEvent e) {
        this.evtz.execute(WHEEL, e);
    }

}
