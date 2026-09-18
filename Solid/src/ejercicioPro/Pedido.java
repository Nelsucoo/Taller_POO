package ejercicioPro;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private  String cliente;
    private List<String> platos = new ArrayList<>();
    private List<Double> precios = new ArrayList<>();
    private descuento estrategiaDescuento;

    public void agregarPlato(String nombre, double precio) {
        platos.add(nombre);
        precios.add(precio);
    }

    public double calcularTotal() {
        double subtotal = 0;
        for (double precio : precios) {
            subtotal += precio;
        }
        return estrategiaDescuento.calcularDescuento(subtotal);
    }

      
    public String getCliente(){
        return cliente;
    }
    public void setCliente(String cliente) { 
        this.cliente = cliente; 
    }
    public descuento getEstrategiaDescuento() {
    return estrategiaDescuento;
    }
    public void setEstrategiaDescuento(descuento estrategiaDescuento) {
        this.estrategiaDescuento = estrategiaDescuento;
    }
   
}

