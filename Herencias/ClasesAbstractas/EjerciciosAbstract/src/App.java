public class App {
    public static void main(String[] args){
        Circulo ci = new Circulo(4);
        Cuadrado cu = new Cuadrado(6);

        System.out.println("Círculo (radio: )"+ci.getRadio());
        System.out.println("Área: "+ci.getArea());
        System.out.println("Perímetro: "+ci.getPerimetro());

        System.out.println("Cuadrado (lado: )"+cu.getLado());
        System.out.println("Área: "+cu.getArea());
        System.out.println("Perímetro: "+cu.getPerimetro());
    }
}
