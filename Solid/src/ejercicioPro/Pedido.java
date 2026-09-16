package ejercicioPro;

import java.util.ArrayList;

public class Pedido {
    private  String cliente;
    private String tipoCliente;
    private List<String> platos = new ArrayList<>();
    private List<Double> precios = new ArrayList<>();

    public void agregarPlato(String nombre, double precio) {
        platos.add(nombre);
        precios.add(precio);
    }
}




