package ejercicioPro;

public interface descuento {
    double calcularDescuento(double subtotal);

}

class Regular implements descuento{
   
    @Override 
    public double calcularDescuento(double subtotal) {
        return subtotal;
    }

}

class Vip implements descuento {

    @Override 
    public double calcularDescuento(double subtotal){
        double totalDescuento = subtotal * 0.5;
        return totalDescuento;
    }
}

class Empleado implements descuento {


    @Override 
    public double calcularDescuento(double subtotal){
        double totalDescuento = subtotal * 0.5;
        return totalDescuento;
    }
}
