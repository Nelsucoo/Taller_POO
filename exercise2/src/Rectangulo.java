

public class Rectangulo extends Figura {


private int b;
private int h;



public Rectangulo(int b, int h, String tipo){
    super(tipo);
    this.b = b;
    this.h = h;

}
@Override 

public double area(){

    return (double)b*h;
}
}