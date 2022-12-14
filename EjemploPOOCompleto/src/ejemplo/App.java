package ejemplo;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void Productos(){
        Producto p = new Producto("Silla", 100);
        Producto p2 = new Producto(p.getNombre(), p.getPrecio());

        System.out.println(p);
        System.out.println(p2);

        if(p.equals(p2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");
        }

        System.out.println(p.getNombre().toUpperCase() + " - " + p.getPrecio());
        System.out.println("Total con impuesto (10): " + p.getPrecioImpuesto(10));
        System.out.println("Total con impuesto (21): " + p.getPrecioImpuesto());
    }
    public static void Jugadores() {
        List<Jugador> ListJugadores = new ArrayList<Jugador>();
        Jugador jugador1 = new Jugador("Juan",29,10000.95);
        Jugador jugador2 = new Jugador("Ana",37,-15000.38);
        Jugador jugador3 = new Jugador("Joanna",35,-15000.38);
        Jugador jugador4 = new Jugador("Daniela",26,20000);

        System.out.println("Primer jugador: "+jugador1.getNombre()+" "+jugador1.getEdad()+" años "+jugador1.getSueldo()+" sueldo");
        System.out.println("Segundo jugador: "+jugador2.getNombre()+" "+jugador2.getEdad()+" años "+jugador2.getSueldo()+" sueldo");
        System.out.println(jugador2);

       
        ListJugadores.add(jugador1);
        ListJugadores.add(jugador2);
        ListJugadores.add(null);
        ListJugadores.add(null);
        ListJugadores.add(jugador3);
        ListJugadores.add(jugador4);
        
        for (Jugador jugador : ListJugadores) {
            if (jugador != null) {
                System.out.println(jugador.toString());
            }
        }
    }
    public static void Equipos(){
        Equipo e = new Equipo();

        e.addJugador(new Jugador("Alma",25,25000));
        e.addJugador(new Jugador("Antonio",22,44000));
        e.addJugador(new Jugador("Lucia",40,21000));
        e.addJugador(new Jugador("Oscar",35,39000));

        e.deleteJugador(0);

        for (int i = 0; i < e.getNumJugadores(); i++) {
            System.out.println(e.getJugador(i));
        }
        System.out.println("Total sueldos: "+ e.totalSueldos());
    }
    public static void main(String[] args) throws Exception {
        Productos();
        Jugadores();
        Equipos();
    }
}
