public class App {
    public static void main(String[] args) throws Exception {

        Punto p1 = new Punto();

            p1.setX(0);
            p1.setY(0);

        System.out.println(p1.getX());
        System.out.println(p1.getY());
        System.out.println(p1.modulo());

        Punto p2 = new Punto(3);

        System.out.println(p2.getX());
        System.out.println(p2.getY());

        Punto p3 = new Punto(1, 2);

        System.out.println(p3.getX());
        System.out.println(p3.getY());

        Punto p4 = new Punto();

        System.out.println(p4.getX());
        System.out.println(p4.getY());

        PuntoTiempo p5 = new PuntoTiempo(2, 4, 6);

        System.out.println(p5.getX());
        System.out.println(p5.getY());
        System.out.println(p5.getT());
        System.out.println(p5.velocidad());

        PuntoTiempo p6 = new PuntoTiempo();

        System.out.println(p6.getX());
        System.out.println(p6.getY());
        System.out.println(p6.getT());

    }
}
    