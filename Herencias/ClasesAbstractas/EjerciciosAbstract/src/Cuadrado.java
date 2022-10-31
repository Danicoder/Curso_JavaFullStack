public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getPerimetro() {
        return lado * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(lado,2);
    }
}
