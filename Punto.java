public class Punto {
    private int x, y;
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public double modulo (){
        return Math.sqrt(x^2 + y^2);
    }
    public Punto (int x, int y){
        this.setX(x);
        this.setY(y);

    }
   public Punto (int xy){
        this(xy,xy);
    } 
   public Punto (){
        this(0,0);

    }
}


