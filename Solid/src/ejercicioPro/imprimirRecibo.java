package ejercicioPro;

public class imprimirRecibo {
    public void imprimirElRecibo(Pedido pedido) {
        
        ImpresoraTermica impresora = new ImpresoraTermica();
        impresora.imprimir("Recibo de " + pedido.getCliente() + ": $" + pedido.calcularTotal());
    }
}
