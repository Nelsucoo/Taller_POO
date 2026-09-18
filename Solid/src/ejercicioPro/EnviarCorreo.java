package ejercicioPro;

public class EnviarCorreo {

    public void enviarCorreoConfirmacion(Pedido pedido){
        System.out.println("Enviando correo de confirmacion a " + pedido.getCliente() + "...");
    }
  
}

class ImpresoraTermica {
    public void imprimir(String texto) {
        System.out.println("[Impresora termica] " + texto);
    }
}