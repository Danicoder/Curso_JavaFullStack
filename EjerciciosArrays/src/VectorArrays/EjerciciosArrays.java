package VectorArrays;

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
		
	}
	public static void main(String[] args) {
		//ejercicio1();
		//ejercicio2();
		ejercicio3();
	}
}