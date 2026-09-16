package isp;

public class Avioneta implements Aereo, Terrestre {
    @Override 
    public void volar() {
        System.out.println("La avioneta esta volando. ");
    }
    @Override 
    public void andarEnTierra(){
        System.out.println("La avioneta anda por la pista de aterrizaje. ");
    }
}
