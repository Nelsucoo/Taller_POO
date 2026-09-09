

public class Circulo extends Figura{

    private int radio;

    public Circulo(int radio, String tipo){
        super(tipo);
        this.radio = radio;
    }

    @override
    public double area(){
        return(double) 3.14 * (radio^2)/2;
    }


}