package src;

public class Main {
    public static int iter = 0;
    public static Canvas cvs = new Canvas();
    public static Ventana ventana = new Ventana();

    public static String scen = "world0";

    public static void main(String[] args) {
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
    }
}