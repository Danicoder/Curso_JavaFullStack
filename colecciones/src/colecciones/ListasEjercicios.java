package colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListasEjercicios {
	/*1. Crea una lista con los números 10, 20, 30 y 40. A continuación haz las siguientes
	operaciones:
	a. Añade los números 50 y 60 al final.
	b. Borra el número 20.
	c. Añade los valores 25 y 26 entre el 10 y el 30 (posición 1).
	d. Dale la vuelta a la lista y muéstrala por pantalla
	Los valores finales deberían ser: 60, 50, 30, 26, 25, 10	*/
	public static void ejercicio1() {
		List<Integer> numeros = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		numeros.add(50);
		numeros.add(60);
		numeros.removeIf(n->n==20); // o numeros.removeIf(n.indexOf(20));
		numeros.add(1, 25);
		numeros.add(2, 26);
		numeros.sort(Collections.reverseOrder());
		System.out.println(numeros);
	}
	public static void main(String[] args) {
		ejercicio1();
	}
}
