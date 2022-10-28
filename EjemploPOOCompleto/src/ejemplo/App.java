package ejemplo;

public class App {
    public static void cambiaProducto(Producto producto) {
        producto.setNombre("Mesa");
    }

    public static void main(String[] args) throws Exception {
        Producto p = new Producto("Silla", 100);
        Producto p2 = new Producto(p.getNombre(), p.getPrecio());

        System.out.println(p);
        System.out.println(p2);

        if(p.equals(p2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");
        }

        // System.out.println(p.getNombre().toUpperCase() + " - " + p.getPrecio());
        // System.out.println("Total con impuesto (10): " + p.getPrecioImpuesto(10));
        // System.out.println("Total con impuesto (21): " + p.getPrecioImpuesto());


        /*Ejercicio propuesto:*/
        Jugador jugador1 = new Jugador("Juan",29,1000.95);
        Jugador jugador2 = new Jugador("Ana",37,-1500.38);
        //Jugador jCopia = new Jugador(jugador1);

        System.out.println("Primer jugador: "+jugador1.getNombre()+" "+jugador1.getEdad()+" años "+jugador1.getSueldo()+" sueldo");
        System.out.println("Segundo jugador: "+jugador2.getNombre()+" "+jugador2.getEdad()+" años "+jugador2.getSueldo()+" sueldo");
    }
}
