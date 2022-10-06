package colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EjemploListas {
	public static void ejemplo1() {
		//crear listas
		List<String> nombres = new ArrayList<String>();
		
		//añadir elementos a la lista
		nombres.add("Daniela");
		nombres.add("Juan");
		nombres.add("Enrique");
		
		//recoorer una lista e imprime su contenido
		System.out.println(nombres); //si son objetos o cadenas si, porque lo muestra en modo array
		for(String nombre : nombres) {
			System.out.println(nombre);
		}
		nombres.forEach(nombre -> System.out.println(nombre));
		nombres.forEach(nombre -> System.out.println(nombre + " García"));
		nombres.forEach(nombre -> System.out.println(nombre.length())); //7,4,7
		
		//eliminar elementos de una lista
		nombres.remove(1);//borro posicionalmente
		nombres.remove("Fran"); //borra el primer Fran que encuentre
		nombres.remove("Paco"); //como no existe ese nombre,no hace nada
		
		//añadir en una posición intermedia
		nombres.add(1, "New name");
		
		//tamaño de la lista
		System.out.println("El tamaño de la lista es: " + nombres.size());
		//conversiones entre arrays y listas
		String[] nombresArrays = new String[nombres.size()];
		nombres.toArray(nombresArrays);
		System.out.println("Impresión de la lista");
		nombres.forEach(nombre -> System.out.println(nombre));
		System.out.println("Impresión de un array");
		System.out.println(Arrays.toString(nombresArrays));
		//(mas común) - convertir Array en lista
		String[] meses = {"Enero", "febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre"};
		List<String> mesesLista = new ArrayList<String>(Arrays.asList(meses));
		// creación de una lista a partir de otra/s
		List<String> alumnos = new ArrayList<String>(Arrays.asList("Lucia","Manuel","Alberto"));
		List<String> alumnosBorrar = new ArrayList<String>(Arrays.asList("Camila","Alma"));
		List<String> alumnos2 = new ArrayList<String>(Arrays.asList("Juan","Camila","Alma"));
		List<String> todosAlumnos = new ArrayList<String>(alumnos);
		todosAlumnos.addAll(alumnos2);
		todosAlumnos.removeAll(alumnosBorrar);
		//Borra toda la lista isEmpty es boolean
		todosAlumnos.clear();
		if(todosAlumnos.isEmpty()){ 
			System.out.println("La lista esta vacía");
		}
		//Ordenar una lista (null para ordenar alfabéticamnete)
		alumnos.sort(null);
		alumnos.sort(String.CASE_INSENSITIVE_ORDER);
		alumnos.sort(Comparator.comparingInt(String::length));
		alumnos.sort(String.CASE_INSENSITIVE_ORDER.reversed());
		alumnos.sort(Collections.reverseOrder(null));
		
		System.out.println(alumnos);
	}
	public static void buscarLista() {
		List<String> meses = new ArrayList<String>(Arrays.asList("Enero", "febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",

				"Octubre", "Noviembre", "Diciembre"));
		if(meses.contains("Enero"))
			System.out.println("Enero existe en la lista");
		if(meses.containsAll(new ArrayList<String>(Arrays.asList("Enero","Febrero"))))
				System.out.println("Enero y Febrero existe en la lista");
	}
	public static void main(String[] args) {
		//ejemplo1();
		buscarLista();
	}
}
