public class Circulo implements IFigura{
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

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
