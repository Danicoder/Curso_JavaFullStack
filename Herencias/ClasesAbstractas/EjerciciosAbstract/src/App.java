import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void ejemploAbstracto() {
        Circulo ci = new Circulo(4);
        Cuadrado cu = new Cuadrado(6);

        System.out.println("Círculo (radio: )"+ci.getRadio());
        System.out.println("Área: "+ci.getArea());
        System.out.println("Perímetro: "+ci.getPerimetro());

        System.out.println("Cuadrado (lado: )"+cu.getLado());
        System.out.println("Área: "+cu.getArea());
        System.out.println("Perímetro: "+cu.getPerimetro());
    }
    public static void ejemploPolimorfismo() {

        List<Figura> Figuras = new ArrayList<>(Arrays.asList(new Circulo(7.89),new Circulo(4.08),new Circulo(10),
                                                            new Cuadrado(6.5),new Cuadrado(8),new Cuadrado(7)));

        for (Figura figura : Figuras) {
            if(figura instanceof Cuadrado){
                System.out.println("*** Círculo - Radio: " + ((Cuadrado)figura).getLado() + "***");
            }
            else{
                System.out.println("*** Cuadrado - Lado: " + ((Circulo)figura).getRadio() + "***");
            }
            System.out.printf("Area: %.2f. Perímetro: %.2f\n",figura.getArea(),figura.getPerimetro());
        }
    }
    public static void main(String[] args){
        ejemploAbstracto();
        ejemploPolimorfismo();
    }
}
