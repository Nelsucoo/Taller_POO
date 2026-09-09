public class Punto3D extends PuntoTiempo{

    private int z;

    public Punto3D(int x, int y, int z, int t) {
        super(x, y, t);
        this.setZ(z);
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public double modulo(){

        double modulo = Math.sqrt(this.getX()^2 + this.getY()^2 + this.getZ()^2);
        
        return modulo;
    }

}
