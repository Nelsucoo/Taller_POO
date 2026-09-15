public class App {
    public static void main(String[] args) throws Exception {
        //El constructor crea automaticamente los 5 asientos
        Vuelo vuelo = new Vuelo("AV9401", "Bogota", "Medellin", 5);
        Vuelo.mostrarInfo();

        Ssytem.out.println();
        vuelo.embarcar("A1");
        vuelo.embarcar("A3");
        vuelo.embarcar("A5");
        vuelo.embarcar("A1"); //Ya ocupado

        System.out.println();
        vuelo.mostrarAsientos();

        System.out.println();
        vuelo.desembarcar("A3");
        vuelo.mostrarAsientos();
    }
}
