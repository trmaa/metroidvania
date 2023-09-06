package src;

public class World {
    public int width = 5;
    public int height = 5;

    public int[][] map = {
        {0,0,0,0,0},
        {0,0,0,0,0},
        {0,0,0,0,0},
        {0,0,0,0,0},
        {1,1,1,1,1}
    };

    public Celda celda = new Celda(Main.cvs.getWidth()/this.width,Main.cvs.getHeight()/this.height);

    public World(){
        for(int i = 0;i < this.height;i++){
            for(int j = 0;j < this.width;j++){
                int n = Utils.redondear(Math.random());
                this.map[i][j] = n;
                System.out.print(n);
            }
        }
    }
}

class Celda {
    public float width = 32;
    public float height = 32;

    Celda(float a, float b){
        this.width = a;
        this.height = b;
    }
}