package dip;

public interface Motor {
    void encender();
}

class MotorGasolina implements Motor{
    @Override 
    public void encender(){
        System.out.println("Motor a gasolina encendido.");
    }
}
class MotorElectrico implements Motor{
    @Override 
    public void encender(){
        System.out.println("Motor electrico encendido en silencio.");
    }
}

class Carro{
    private Motor motor;

    //inyectando el motor desde afuera , via constructor
    public Carro(Motor motor){
        this.motor = motor;
    }

    public void arrancar(){
        motor.encender();

    }
}
