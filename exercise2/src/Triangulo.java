public class Triangulo extends Figura {

private int b;
private int h;

public Triangulo(int b, int h, String tipo){
    super(tipo);
    this.b = b;
    this.h = h;

}

public int getB() {
    return b;
}

public void setB(int b) {
    this.b = b;
}

public int getH() {
    return h;
}

public void setH(int h) {
    this.h = h;
}

@Override 

public double area(){

    return (double)b*h/2;
}
}