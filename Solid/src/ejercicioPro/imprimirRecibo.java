package ejercicioPro;

public class imprimirRecibo {
    public void imprimirElRecibo() {
        
        ImpresoraTermica impresora = new ImpresoraTermica();
        impresora.imprimir("Recibo de " + cliente + ": $" + calcularTotal());
    }
}
