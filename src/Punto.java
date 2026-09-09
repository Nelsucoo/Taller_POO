public class Punto {

    private int x, y;


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double modulo(){

        double modulo = Math.sqrt(this.getX()^2 + this.getY()^2);
        
        return modulo;
    }

    public Punto(int x, int y) {
    this.setX(x);
    this.setY(y);
    }

    public Punto(int xy) {
        this(xy, xy);
    }

    public Punto() {   
        this(0, 0);
    }

    
    
}
