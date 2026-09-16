package ejercicioPro;

public class EnviarCorreo {

    public void enviarCorreoConfirmacion(){
        System.out.println("Enviando correo de confirmacion a " + cliente + "...");
    }
    public void setCliente(String cliente) { this.cliente = cliente; }
    public void SetTipoCliente(String tipoCliente) { this.tipoCliente = tipoCliente; }
}

class ImpresoraTermica {
    public void imprimir(String texto) {
        System.out.println("[Impresora termica] " + texto);
    }
}