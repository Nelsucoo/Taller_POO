public class PuntoTiempo extends Punto {

    private int t;

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public double velocidad(){

        double velocidad = this.modulo() / this.getT();
        
        return velocidad;
    }

    public PuntoTiempo(int x, int y, int t) {
        super(x, y);
        this.setT(t);
    }

    public PuntoTiempo(){
        this(0, 0, 0);
    }

    
}
