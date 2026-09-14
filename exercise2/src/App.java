public class App {
    public static void main(String[] args) throws Exception {
        Figura rectangulo = new Rectangulo(3, 6, "Rectángulo");
        Figura cuadrado = new Cuadrado(5, "Cuadrado");
        Figura circulo = new Circulo(4, "Círculo");
        Figura triangulo = new Triangulo(3, 4, "Triángulo");

        System.out.println("Área del " + rectangulo.getTipo() + ": " + rectangulo.area());
        System.out.println("Área del " + cuadrado.getTipo() + ": " + cuadrado.area());
        System.out.println("Área del " + circulo.getTipo() + ": " + circulo.area());
        System.out.println("Área del " + triangulo.getTipo() + ": " + triangulo.area());
    }
}