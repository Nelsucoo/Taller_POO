public class Cuadrado extends Figura {

    private int lado;

    public Cuadrado(int lado, String tipo){
        super(tipo);
        this.lado = lado;

    }   
    @override
    public double area(){

        return (double) lado * lado;
    }




}