package colecciones;

import java.util.List;
import java.util.ArrayList;

public class EjerciciosLandaStreams {
    
    public static void ejercicioPropuesto() {
        List<String> nombres = new ArrayList<>(
        List.of("gato", "perro", "aro", "murciélago", "patata", "Orca"));

        nombres.replaceAll(n -> n.toUpperCase());
        nombres.removeIf(cad -> cad.startsWith("A"));
        nombres.forEach(cad -> System.out.println(cad));

        System.out.println(nombres);
    }
    public static void main(String[] args) {
        ejercicioPropuesto();
    }
}
