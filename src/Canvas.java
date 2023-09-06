package src;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {
    public MyKeyListener kl = new MyKeyListener();
    public MyMouseListener ml = new MyMouseListener();

    public Canvas() {
        this.addKeyListener(this.kl);
        this.addMouseListener(this.ml);
        this.addMouseMotionListener(this.ml);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
        this.setFocusable(true);
        this.requestFocusInWindow();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        this.cls(g, new Color(MyMouseListener.mouseClicked ? 0x777777 : 0x000000));
    }

    public void cls(Graphics g, Color c) {
        g.setColor(c);
        g.fillRect(0, 0, Main.ventana.getWidth(), Main.ventana.getHeight());
    }

    public void print(Graphics g, float x, float y, float w, float h, Color c) {
        g.setColor(c);
        g.fillRect(Math.round(x), Math.round(y), Math.round(w), Math.round(h));
    }
}