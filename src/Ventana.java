package src;

import javax.swing.*;

public class Ventana extends JFrame {
    public Ventana() {
        setTitle("Jogo");

        setSize(Camara.width, Camara.height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon ico = new ImageIcon("icono.jpg");
        setIconImage(ico.getImage());

        setVisible(true);
    }
}