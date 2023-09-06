package src;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MyMouseListener implements MouseListener, MouseMotionListener {
    public static int mouseX;
    public static int mouseY;
    public static boolean mouseClicked = false;

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        MyMouseListener.mouseClicked = true;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        MyMouseListener.mouseClicked = false;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        MyMouseListener.mouseClicked = true;
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        MyMouseListener.mouseX = e.getX();
        MyMouseListener.mouseY = e.getY();
    }
}