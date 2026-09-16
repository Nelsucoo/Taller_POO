package srp;

public class Vehiculo {


    private String marca;
    private int velocidadMax;

    public Vehiculo(String marca, int velocidadMax){
        this.marca = marca;
        this.velocidadMax = velocidadMax;
    }

    public void acelerar() {
        System.out.println(marca + " esta acelerando.");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    


}
    

