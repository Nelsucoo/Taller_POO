package isp;

public class App {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Avioneta avioneta = new Avioneta();
        VehiculoAnfibio china = new VehiculoAnfibio();

        carro.andarEnTierra();
        avioneta.andarEnTierra();
        avioneta.volar();
        china.andarEnTierra();
        china.navegar();

    
    }
}

