package isp;

public interface VehiculoMal {

    void andarEnTierra();
    void volar();
    void navegar();    
} 

class Carro implements VehiculoMal {
    @Override 
    public void andarEnTierra() {
        System.out.println("El carro anda por la carretera. ");
    }
    @Override
    public void volar(){
        throw new UnsupportedOperationException("Un carro no vuela");
    }
    @Override
    public void navegar(){
        throw new UnsupportedOperationException("Un carro no navega. ");

    } 
}