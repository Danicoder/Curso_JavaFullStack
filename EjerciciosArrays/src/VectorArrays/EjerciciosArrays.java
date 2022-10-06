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
		Scanner sc = new Scanner(System.in);
		
		int[] ArrayEnteros = new int[10]; 
		
		for (int i = 0; i < ArrayEnteros.length; i++) {
			System.out.print("Dime el número que quieras guardar ");
			int num = sc.nextInt();
			ArrayEnteros[0] = num;
		}
	}
	public static void main(String[] args) {
		//ejercicio1();
		ejercicio2();
	}
}