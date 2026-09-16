package srp;
public class Vehiculomal {

    private String marca;
    private int velocidadMax;

    public Vehiculomal(String marca, int velocidadMax){
        this.marca = marca;
        this.velocidadMax = velocidadMax;
    }

    public void acelerar() {
        System.out.println(marca + " esta acelerando.");
    }

    //Responsabilidad 2: persistencia
    public void guardarEnBasesDeDatos() {
        System.out.println("Conectando a la BD...");
        System.out.println("INSERT INTO vehiculos VALUES ('" + marca + "', " + velocidadMax + ")");
    }

     //Responsabilidad 3: Generar reporte
    public void generarReportePDF(){
        System.out.println("Generando PDF con los datos de " + marca + "...");
    }
    
}