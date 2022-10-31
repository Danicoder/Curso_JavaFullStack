public class App {
    public static void Interfaz() {
        Circulo ci = new Circulo(4);
        Cuadrado cu = new Cuadrado(6);

        ci.getPerimetro();
        ci.getArea();
        cu.getPerimetro();
        cu.getArea();
    }
    public static void main(String[] args) throws Exception {
        Interfaz();
    }
}
