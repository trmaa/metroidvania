package src;

public class Main {
    public static int iter = 0;
    public static Ventana ventana = new Ventana();
    public static Canvas cvs = new Canvas();

    public static World world = new World();

    public static void main(String[] args) {
        Main.ventana.add(Main.cvs);

        while (true) {
            Main.loop();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void loop() {
        Main.iter++;
        Main.cvs.repaint();
        // Main.cvs.setSize(Main.ventana.getWidth(), Main.ventana.getHeight());
    }
}