package lsp;
public abstract class Vehiculo {

    protected String marca;
    protected int velocidadMax;

    public Vehiculo(String marca, int velocidadMax){
        this.marca = marca;
        this.velocidadMax = velocidadMax;
    }
    public abstract void acelerar();
}

interface ConMotor {
    void acelerarConMotor();
}

class Carro extends Vehiculo implements ConMotor {
    public Carro(String marca, int velocidadMax){
        super(marca, velocidadMax);
    }

    @Override
    public void acelerarConMotor() {
        System.out.println(marca + " acelera usando el motor.");
    } 
    @Override
    public void acelerar(){
        acelerarConMotor();
    }
}

class Bicicleta extends Vehiculo {
    public Bicicleta(String marca, int velocidadMax){
        super(marca, velocidadMax);
    }
    @Override 
    public void acelerar(){
        System.out.println(marca + " acelera con pedaleo.");
    }
}