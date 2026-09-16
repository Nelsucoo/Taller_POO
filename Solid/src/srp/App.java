package srp;

public class App {
    public static void main(String[] args) {

        Vehiculo carro = new Vehiculo("Deepal", 180);
        Vehiculo carro2 = new Vehiculo("Chevrolet", 200);

        VehiculoRepositorio repo = new VehiculoRepositorio();
        repo.guardar(carro);
        

        VehiculoReporteGenerador reporte = new VehiculoReporteGenerador();
        reporte.generarPDF(carro);
    }
}

