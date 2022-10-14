package VectorArrays;

import java.util.Iterator;
import java.util.Scanner;

public class EjerciciosArrays {
	/*1. Crea un array con los nombres de los meses. A continuación pide al usuario un número
	del 1 al 12. Muéstrale el nombre del mes correspondiente sin usar estructuras
	condicionales (es decir, a partir de los valores del array).*/
	
	public static void ejercicio1() {
		String[] meses = {"Entero", "Febrero", "Marzo", "Abril", "Mayo", "Junio","Julio", "Agosto","Septiembre","Octubre", "Noviembre", "Diciembre"};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número del 1 al 12");
		int num = sc.nextInt();
		if(num >= 1 && num <= 12)
			System.out.println("El mes indicado es: "+ meses[num-1]);
		else System.out.println("No indicaste un número entre 1 y 12");
	}
	/*2. Crea un array de enteros con 10 posiciones. A continuación pide al usuario que vaya
		introduciendo uno a uno los 10 números por consola. Muestra lo siguiente:
		a. La lista de números introducidos
		b. La suma de los números
		c. La media de los números
		d. El mayor y el menor de los números (crea un máximo y un mínimo provisional que
		será igual al primer número del array, después vas comparando con el resto de
		posiciones).*/
	public static void ejercicio2() {
			
		int suma = 0;
		double media =0 ;
		int[] numeros = new int [10];
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Dime el número que quieras guardar, te quedan "+ (11-(i+1)) + " números: ");
			numeros[i] = sc.nextInt();
		}

		int mayor = numeros[0];
		int menor = numeros[0];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(i + " -> " + numeros[i]+ " , \n");
			//Suma de números de un Array
			suma += numeros[i];
			//media de los números (dividiendo la suma entre el número total de valores)
			media = suma / numeros.length;
			//El mayor y el menor de los números
			mayor = Math.max(numeros[i], mayor);
			menor = Math.min(numeros[i], mayor);
		}
		
		System.out.println("La suma del Array es: "+ suma);
		System.out.println("La media del Array es: "+ media);
		System.out.println("El mayor del Array es: "+ mayor);
		System.out.println("El menor del Array es: "+ menor);
	}
	/*3. Pide al usuario 10 números con decimales (double). Usa un array para almacenarlos.
	Muestra la media y los números que están por encima de esa media.*/
	public static void ejercicio3() {
		Scanner sc = new Scanner(System.in);
		double[] numeros = new double [5];
		double suma = 0;
		double media = 0;
		double[] mayores = new double[numeros.length];
		
		for (int j = 0; j < numeros.length; j++) {
			System.out.println("Dime el número "+ (j+1));
			numeros[j] = sc.nextDouble();
			suma += numeros[j];
			media = suma /numeros.length;

			if (numeros[j] > media) {
		      mayores[j] = numeros[j];
		    }
		}
		System.out.println("La madia de los números elegidos es: "+ media);
		System.out.print("Valores mayores a la media: ");
	    for (int i = 0; i < mayores.length; i++) {
	        if (mayores[i] != 0) {
	            System.out.print(" " + mayores[i]+"\n");
	        }
	    }
	}
	/*4. Crea un programa que almacene en una tabla el número de días que tiene cada mes
	(de un año no bisiesto), pida al usuario que te indique un mes (ej. 2 para febrero) y un
	día (ej. el día 15). Muéstrale qué número de día es dentro del año (por ejemplo, el 15
	de febrero sería el día número 46, y el 31 de diciembre sería el día 365).*/
	public static void ejercicio4() {
		int[] dias = {31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un mes (ej. 2 para febrero): ");
		int mes = sc.nextInt();
		System.out.println("Dime un día (ej. el día 15): ");
		int dia = sc.nextInt();
		
		int numDia = 0;
		if(mes <= 12 && mes > 0) {
			if(dia <= 31 && dia > 0) {
				for (int i = 0; i < (mes-1); i++) {//mes-1 porqué empezando desde cero entra al bucle una ves mas de la que debe
					numDia += dias[i];
				}
				System.out.print("Total del días del año: "+(numDia+dia));
			}
			else
				System.out.println("El día no corresponde con ningún día del calendario");
		}
		else {
			System.out.println("El mes introducido no corresponde con el calendario");
		}
	}
	/*5. Crea 2 arrays, uno para almacenar notas de alumnos y otro para almacenar sus
	nombres. A continuación pregunta al usuario cuántos alumnos hay en total. En función
	del número de alumnos pide sus nombres y sus notas y guárdalos en los respectivos
	arrays.
	Recorre ambos arrays mostrando el nombre de cada alumno y su nota.*/
	public static void ejercicio5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuántos alumnos hay en total? ");
		int alumnos = sc.nextInt(); 
		
		String[] nombres = new String[alumnos];
		double[] notas = new double[alumnos];
		double nota;
		String alumno;
		
		for (int i = 0; i < alumnos; i++) {
			System.out.println("Dime el nombre del alumno "+ (i+1) +" :");
			nombres[i] = sc.next();
			
			System.out.println("Dime su nota ");
			notas[i] = sc.nextDouble();
		}
		System.out.printf("%12s%5s\n", "NOMBRE", "NOTA");
		for (int i = 0; i < alumnos; i++) {
			System.out.printf("%12s%5.2f\n", nombres[i], notas[i]);
		}
	}
	/*6. Crea un array de números enteros con 10 posiciones. Pregunta al usuario por un
	número y guarda en el array la tabla de multiplicar de dicho número. A continuación,
	recorre el array y muestra lo que tienes almacenado.*/
	public static void ejercicio6() {
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int [10];
		System.out.println("Dime un número de la tabla de multiplicar: ");
		int tabla = sc.nextInt(); 
		
		for (int i = 1; i <= numeros.length; i++) {
			System.out.println(tabla + " x "+ i + " = "+ (tabla*i));
		}
	}
	/*7. Crea un programa con 2 arrays que almacenen 10 números cada uno (pon los valores
	que quieras). Suma las posiciones de ambos arrays (usa un bucle) en un tercer array,
	y al final muestra los resultados:*/
	public static void ejercicio7() {
		int[] array1 = {7, 12, 3, 8, 3, 9, 5, 11, 20, 9}; 
		int[] array2 = {8, 5, 3, 12, 25, 1, 6, 13, 7, 4};
		int[] array3 = new int [array1.length];

		for (int i = 0; i < array2.length; i++) {
			array3[i] = array1[i] + array2[i];
		}
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array3[i]+" , ");
		}
	}
	/*8. Crea un array de cadenas con 10 posiciones. Pide al usuario que introduzca 10
	nombres. Por cada nombre introducido, debes comprobar que no existe ya en el array.
	Si existe, no lo guardes y vuelve a pedirle otro nombre.*/
	public static void ejercicio8() {
		Scanner sc = new Scanner(System.in);
		String[] nombres = new String[10];
		String nombre;
		boolean repetido = false;
		
		for (int i = 0; i < nombres.length; i++) {
			do {
				System.out.print("Introduce un nombre "+ (i+1)+": ");
				nombre = sc.next();
				nombres[i] = nombre;
				for (int j = 0; j < i; j++) {// para que no pregunte la primera vez
					if(nombres[(i-1)].equals(nombre)) {
						repetido = true;
						System.out.print("Nombre repetido, introduce un nombre distinto: ");
						nombres[i] = sc.next();
						
					}
				}
			}while(repetido);
		}
	}
	/*9. Pide al usuario que escriba un nombre y guárdalo. A continuación, muestra las vocales
	que contiene ese nombre (debes recorrer la cadena y comparar sus caracteres).*/
	public static void ejercicio9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un nombre ");
		String nombre = sc.nextLine().toLowerCase();
		
		char letra;
		for (int i = 0; i < nombre.length(); i++) {
			letra =nombre.charAt(i);
			switch(letra) {
				case 'a':
				case 'á':
				case 'e':
				case 'é':
				case 'i':
				case 'í':
				case 'o':
				case 'ó':
				case 'u':
				case 'ú':
					System.out.print(letra + " ");
			}
		}
	}
	/* 10. Crea un programa que reciba 2 parámetros de entrada. Esos 2 parámetros serán 2
	números que el programa sumará y mostrará el resultado. Se debe comprobar que se han recibido 
	esos 2 parámetros o mostrar un error. Recuerda que los parámetros se reciben como cadenas, por
	lo que hay que convertirlos a número.*/
	public static void ejercicio10(double parametro1,double parametro2) {
		double suma = (double)parametro1 + parametro2;
		System.out.println(suma);
	}
	public static void main(String[] args) {
		//ejercicio1();
		//ejercicio2();
		//ejercicio3();
		//ejercicio4();
		//ejercicio5();
		//ejercicio6();
		//ejercicio7();
		//ejercicio8(); correguir
		//ejercicio9();
		ejercicio10(10.5,21);
	}
}