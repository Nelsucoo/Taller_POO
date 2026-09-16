package srp;

public class App {
    public static void main(String[] args) {

        Carro carroGasolina = new Carro(new MotorGasolina());
        carroGasolina.arrancar();

        Carro carroElectrico = new Carro(new MotorElectrico());
        carroElectrico.arrancar();

        // Cambiar de motor NO requiere tocar la clase Carro
    }
}

