public class Circulo extends Figura{
    private double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double getPerimetro() {
        return 2*Math.PI*radio;
    }

    @Override
    public double getArea() {
        return Math.pow(radio,2) * Math.PI;
    }
}
