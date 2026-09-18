package ejercicioPro;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        PersistenciaPedido persistencia = new PersistenciaPedido();
        imprimirRecibo imprimirRecibo = new imprimirRecibo();
        EnviarCorreo enviarCorreo = new EnviarCorreo();

        Pedido pedido = new Pedido();
        pedido.setCliente("Ana");
        pedido.setEstrategiaDescuento(new Regular());;
        pedido.agregarPlato("Bandeja paisa", 28000);
        pedido.agregarPlato("Limonada", 6000);

        System.out.println("Total: " + pedido.calcularTotal());
        persistencia.guardarEnBasesDeDatos(pedido);
        imprimirRecibo.imprimirElRecibo(pedido);
        enviarCorreo.enviarCorreoConfirmacion(pedido);

        // El código cliente confía en que TODO MetodoPago se puede cobrar igual...
        List<MetodoPago> pagosDelDia = Arrays.asList(
            new PagoTarjeta(),
            new PagoEfectivo(),
            new PagoPuntosFidelidad()
        );

        for (MetodoPago pago : pagosDelDia) {
            pago.cobrar(15000);  // esto revienta con PagoPuntosFidelidad si el monto supera los puntos
        }

        // El mesero queda obligado a "implementar" trabajos que no le corresponden
        Mesero mesero = new Mesero();
        mesero.atenderMesa();
    }
}