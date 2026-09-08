public class Punto3D extends PuntoTiempo{
     private int z;
    public int getZ(){
        return this.z;
    }
    public void setZ(int z){
        this.z = z;
    }
public Punto3D(int x, int y, int z, int t){
        super(x,y,t);
        this.setZ(z);

    }
@Override   
public double modulo (){
        return Math.sqrt(x^2 + y^2 + z^2);
    }
}
