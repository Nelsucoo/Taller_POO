package ejercicioPro;

public abstract class MetodoPago {
    
    public abstract boolean cobrar(double monto);
    
}

interface PagoConPuntos {
    boolean realizarPagoConPuntos(double monto);
} 

class PagoTarjeta extends MetodoPago {

    @Override 
    public boolean cobrar(double monto) {
        System.out.println("Cobrando $" + monto + " con tarjeta.");
        return true;
    }
}

class PagoEfectivo extends MetodoPago {
    @Override
    public boolean cobrar(double monto) {
        System.out.println("Cobrando $" + monto + " en efectivo.");
        return true;
    }
}

class PagoPuntosFidelidad extends MetodoPago implements PagoConPuntos {
    
    private double puntosDisponibles = 20.0;

    @Override 
    public boolean cobrar(double monto) {
        return realizarPagoConPuntos(monto);
    }

    @Override 
    public boolean realizarPagoConPuntos(double monto){
        if (monto > puntosDisponibles) {
            System.out.println("No hay suficientes puntos para cobrar el monto.");
            return false;
        } else {
        System.out.println("Cobrando $" + monto + " con puntos de fidelidad.");
        return true;
        }
    }
}