package colecciones;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class EjemploArrays {

	public static void ejemplo1() {
		int a;
		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" }; // Del 0 al 11
		int[] numeros = new int[5]; // de la posición 0 a la 4.
		// Asignación de valores a los elementos de un array
		numeros[0] = 3;
		numeros[1] = 4;
		numeros[2] = -1;
		numeros[3] = 4;
		numeros[4] = 4;
		int[] numeros2 = { 4, 7, 8, 9 };
		// numeros[5] = 1; // Error
		System.out.println("La suma da: " + (numeros[1] + numeros[2]));
		// System.out.println("La suma da: " + numeros); // No tiene sentido

		// meses[0] = "Enero";
		System.out.println(meses[1]);
		System.out.println(meses[11]);
		for (int i = 0; i < meses.length; i++) { // recorro todos los meses
			System.out.println(meses[i] + " es el mes " + (i + 1));
		}

		// No sé la posición
		for (String mes : meses) {
			System.out.println(mes);
		}

		int numeroMes = 1;
		for (String mes : meses) {
			System.out.println(mes + " es el mes " + numeroMes);
			numeroMes++;
		}

		// Buscar un elemento dentro del Array

		// Opción 1:

		boolean encontrado = false;
		String mesBuscado = "Enerooooo";
		// La condición también incluye que no hayamos encontrado lo que buscamos
		for (int i = 0; i < meses.length && !encontrado; i++) {
			if (meses[i].equals(mesBuscado)) {
				encontrado = true;
			}
		}
		if (encontrado) {
			System.out.println("El nombre " + mesBuscado + " está en el array");
		} else {
			System.out.println(mesBuscado + " no encontrado...");
		}

		// Opción 2

		if (Arrays.stream(meses).anyMatch(n -> n.equals(mesBuscado))) {
			System.out.println("El nombre " + mesBuscado + " está en el array");
		} else {
			System.out.println(mesBuscado + " no encontrado...");
		}

		// Busca un número negativo en el cojunto del array
		// Siempre que aparezca '->' estamos con programación funcional
		if (Arrays.stream(numeros).anyMatch(numero -> numero < 0)) {
			System.out.println("Hay algún número negativo");
		} else {
			System.out.println("Todos los números son positivos");
		}

		if (Arrays.stream(numeros).allMatch(numero -> numero >= 0)) {
			System.out.println("Todos los números son positivos");
		} else {
			System.out.println("Hay algún número negativo");
		}

	}

	public static void ordenarArrays() {
		int[] nums = { 15, 6, 9, 12, 20 };

		// Algoritmo de la burbuja
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] < nums[i]) { // Intercambiamos
					int aux = nums[i];
					nums[i] = nums[j];
					nums[j] = aux;
				}
			}
		}

		for (int numero : nums) {
			System.out.println(numero);
		}

	}

	public static void ordenarArrays2() {
		int[] nums = { 15, 6, 9, 12, 20 };
		Arrays.sort(nums); // Me ordena el array
		System.out.println(Arrays.toString(nums)); // [6, 9, 12, 15, 20] (Ordenados)
	}

	public static void ordenarArrays3() {
		String[] meses = { "Enero", "febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" }; // Del 0 al 11
		// Orden normal
		Arrays.sort(meses); // Orden lexicográfico (normal) tiene en cuenta las mayúsculas y minúsculas
		System.out.println(Arrays.toString(meses));
		// Orden case insensitive (no tiene en cuenta mayúsculas y minúsculas)
		Arrays.sort(meses, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(meses));
		// Orden inverso case sensitive
		Arrays.sort(meses, Collections.reverseOrder());
		System.out.println(Arrays.toString(meses));
		// Orden inverso case insensitive
		Arrays.sort(meses, String.CASE_INSENSITIVE_ORDER.reversed());
		System.out.println(Arrays.toString(meses));
		// Orden por longitud de las palabras
		Arrays.sort(meses, Comparator.comparingInt(String::length));
		System.out.println(Arrays.toString(meses));
		Arrays.sort(meses, (mesa, mesb) -> Integer.compare(mesa.length(), mesb.length()));
		System.out.println(Arrays.toString(meses));
		Arrays.sort(meses, (a, b) -> a.length() - b.length());
		System.out.println(Arrays.toString(meses));
		// Orden por longitud de las palabras inverso
		Arrays.sort(meses, Comparator.comparingInt(String::length).reversed());
		System.out.println(Arrays.toString(meses));
		Arrays.sort(meses, (mesa, mesb) -> Integer.compare(mesb.length(), mesa.length()));
		System.out.println(Arrays.toString(meses));
		Arrays.sort(meses, (a, b) -> b.length() - a.length());
		System.out.println(Arrays.toString(meses));

		// Imprimo finalmente el array como queda
		for (String mes : meses) {
			System.out.println(mes);
		}
	}

	// 2 dimensiones -> tabla (matriz)
	public static void arraysMultidimensionales() {
		// Ejemplo de tabla no escalonada
		int[][] tabla = new int[4][3]; // crear el array y darle memoria
		tabla[0][0] = 5;
		tabla[0][1] = 4;
		tabla[0][2] = 9;
		tabla[1][0] = 8;
		tabla[1][1] = 5;
		tabla[1][2] = 1000;
		tabla[2][0] = -2;
		tabla[2][1] = 14;
		tabla[2][2] = 5;
		tabla[3][0] = 9;
		tabla[3][1] = 0;
		tabla[3][2] = 8;
		int[][] notas = { { 5, 4, 9 }, { 8, 5, 10 }, { 0, 9, 5 }, { 9, 0, 8 } };

		// recorrer las tablas
		//int alto = tabla.length;
		//int ancho = tabla[0].length;
		for (int fila = 0; fila < tabla.length; fila++) {
			// Mensajes antes de cada fila
			//System.out.println("Tratamiento de la fila: " + fila);
			for (int col = 0; col < tabla[fila].length; col++) {
				//System.out.print(tabla[fila][col] + " ");
				System.out.print("tabla[" + fila + "]["+ col + "]=" + tabla[fila][col] + " ");
			}
			// Mensajes al final de cada fila
			// System.out.println("\nFin de la fila: " + fila); // Generamos salto de línea
			System.out.println();
		}
		// Mensajes al final de la tabla

		// bucle anidado con foreach
		for(int[] fila: tabla) {
			// esto imprime antes de cada fila
			for(int columna: fila) {
				System.out.print(columna + " ");
			}
			// imprime al cada fila
			System.out.println();
		}
		
		int numAlumno = 1;
		double notaMediaGlobal = 0;
		// Calculo de notas medias sobre la tabla notas
		for(int[] alumno: notas) {
			// esto imprime antes de cada fila
			double sumaNotas = 0;
			for(int nota: alumno) {
				sumaNotas += nota;
				notaMediaGlobal += nota;
			}
			// imprime la media alumno
			//System.out.println("Media: " + (sumaNotas/alumno.length));
			System.out.printf("Media del alumno %d: %.2f\n",numAlumno,sumaNotas/alumno.length);
			numAlumno++;
		}
		System.out.println("Número de alumnos: " + notas.length);
		System.out.println("Notas por alumno: " + notas[0].length);
		System.out.printf("Media de todos los alumnos: %.2f\n",notaMediaGlobal/(notas.length*notas[0].length));
		
	}

	public static void crearArrayApartirDeOtro() {
		// creo un array con el número de letras del array meses
		String[] meses = { "Enero", "febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" }; // Del 0 al 11
		int[] letrasMeses = new int[meses.length]; // mismo tamaño que meses
		for (int i = 0; i < meses.length; i++) {
			letrasMeses[i] = meses[i].length();
		}
		for (int mes : letrasMeses) {
			System.out.println(mes);
		}
	}

	public static void main(String[] args) {
		// ejemplo1();
		// ordenarArrays();
		// ordenarArrays2();
		// ordenarArrays3();
		// crearArrayApartirDeOtro();
		arraysMultidimensionales();

	}

}
