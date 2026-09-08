public class App {
    public static void main(String[] args) throws Exception {
        Punto p1 = new Punto(1,2); 
        Punto p2 = new Punto(3);
        Punto p3 = new Punto();
        Punto3D p1 = new Punto(1, 2, 3, 4);
        PuntoTiempo p1 = new PuntoTiempo(1, 2, 3);
        PuntoTiempo p2 = new PuntoTiempo(); 
        System.out.println(p1.getX() + " : " + p1.getY());
        System.out.println(p2.getX() + " : " + p2.getY());
        System.out.println(p3.getX() + " : " + p3.getY());
        System.out.println(p1.modulo());
        System.out.println();

        
        
    }
}
