package ejercicioPro;

public class Mesero implements EmpleadoSala {
    @Override 
    public void atenderMesa() {
        System.out.println("El mesero atiende la mesa. ");
    }
    @Override 
    public void repartirPedido() {
        System.out.println("El mesero lleva el pedido a la mesa");
    }
    public void cobrarEnCaja(){
        System.out.println("El mesero recibe caja");
    }
    
}
