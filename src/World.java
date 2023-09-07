package src;

public class World {
    public int width = 16;
    public int height = 16;

    public int[][] map = new int[this.height][this.width];

    public Celda celda = new Celda(16, 16);

    public World() {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                int n = Utils.redondear(Math.random());
                this.map[i][j] = n;
            }
        }
    }
}

class Celda {
    public float width = 32;
    public float height = 32;

    Celda(float a, float b) {
        this.width = a;
        this.height = b;
    }
}