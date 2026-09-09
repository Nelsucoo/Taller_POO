public class App {
    public static void main(String[] args) throws Exception {
        Figura rectangulo = new Rectangulo(5, 10, "Rectángulo");
        Figura cuadrado = new Cuadrado(4, "Cuadrado");
        Figura circulo = new Circulo(3, "Círculo");
        Figura triangulo = new Triangulo(6, 8, "Triángulo");

        System.out.println("Área del " + rectangulo.getTipo() + ": " + rectangulo.area());
        System.out.println("Área del " + cuadrado.getTipo() + ": " + cuadrado.area());
        System.out.println("Área del " + circulo.getTipo() + ": " + circulo.area());
        System.out.println("Área del " + triangulo.getTipo() + ": " + triangulo.area());
    }
}