package isp;

public class VehiculoAnfibio implements Terrestre, Acuatico{
    @Override 
    public void andarEnTierra(){
        System.out.println("El vehiculo anda por la carretera");
    }
    @Override 
    public void navegar(){
        System.out.println("El vehiculo navega por el lago/rio.");
    }
    
}
