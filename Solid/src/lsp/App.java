/*package lsp;
public class App {
    public static void main(String[] args) {
        Vehiculo[] flota = {
            new Vehiculo("Genérico", 100),
            new Bicicleta("BMX", 30)
        };

        for (Vehiculo v : flota) {
            v.acelerarConMotor();  // esto falla con Bicicleta
        }
    }
}*/
package lsp;
public class App {
    public static void main(String[] args) {
        Vehiculo[] flota = {
            new Carro("Chevrolet", 220),
            new Bicicleta("BMX", 25)
        };

        for (Vehiculo v : flota){
            v.acelerar();
        }
    }
}