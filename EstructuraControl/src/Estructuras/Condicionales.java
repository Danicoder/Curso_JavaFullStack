package Estructuras;

import java.util.Iterator;
import java.util.Scanner;

public class Condicionales {
	/*2. Programa que lea un número entero y muestre si el número es múltiplo de 10 (si el resto de la
	división entre 10 da 0).*/
	public static void exercise2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número entero: ");
		int num = sc.nextInt();
		
		if((num % 10) == 0) {
			System.out.println("El número introducido es múltiplo de 10");
		}
		else {
			System.out.println("El número introducido no es múltiplo de 10");
		}
		//también se puede hacer con operador ternario
		//System.out.println((num % 10) == 0 ?  "El número introducido es múltiplo de 10" : "El número introducido no es múltiplo de 10");
	}
	/*3. Programa que lea un carácter por teclado y compruebe si es una letra mayúscula. Una letra mayúscula
		es aquella que está entre la ‘A’ y la ‘Z’. Recuerda que se pueden comparar los caracteres como si
		fueran números.*/
	public static void exercise3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Teclea un caracter: ");
		//char caracter = sc.next().charAt(0); //sc.nextLine() también serviría
		char cadena = sc.nextLine().charAt(0);
		
		if(cadena >= 'A' && cadena <= 'Z') {
			System.out.println("Es mayúscula");
		}
		else {
			System.out.println("Es minúscula");
		}
		sc.close();
	}
	/*4. Programa que le pida 2 cadenas de texto al usuario y compruebe si son iguales.*/
	public static void exercise4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una cadena de texto: ");
		String cadena1 = sc.nextLine();
		System.out.println("Dime la segunda cadena de texto: ");
		String cadena2 = sc.nextLine();
		
		//System.out.println((cadena1.equals(cadena2) ? "Son iguales" : "No son iguales") );
		if(cadena1.equals(cadena2)) {System.out.println("Son iguales");}
		else {System.out.println("No son iguales");}
	}
	/*5. Programa que lea dos números por teclado y muestre el resultado de la división del primer número por
		el segundo. Se debe comprobar que el divisor no puede ser cero.*/
	public static void exercise5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el primer numero: ");
		double num1 = sc.nextDouble();
		System.out.println("Dime el segundo numero: ");
		double num2 = sc.nextDouble();

		System.out.println((num1/num2) != 0 ?  (num1/num2): "El divisor no puede ser cero");
	}
	/*6. Programa que pida al usuario tres números enteros y muestre el mayor de los tres.*/
	public static void exercise6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el primer número entero: ");
		int num1 = sc.nextInt();
		System.out.println("Dime el segundo número entero: ");
		int num2 = sc.nextInt();
		System.out.println("Dime el tercer número entero: ");
		int num3 = sc.nextInt();
		
		if((num1 > num2) && (num1 > num3)) {
			System.out.println(num1 + " Es el mayor de los tres");
		}
		else if((num2 > num1) && (num2 > num3)) {
			System.out.println(num2 + " Es el mayor de los tres");
		}
		else if((num3 > num1) && (num3 > num2)) {
			System.out.println(num3 + " Es el mayor de los tres");
		}
	}
	/*7. Programa que pida al usuario una cantidad de horas, de minutos y de segundos (3 números diferentes).
		Comprueba que la hora está en el rango de 0 a 23, los minutos y los segundos de 0 a 59.*/
	public static void exercise7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cúantas horas invertistes (pm)? ");
		int horas = sc.nextInt();
		
		if(horas >= 00 && horas <= 23) {
			
			System.out.println("¿Cúantos minutos invertistes (pm)? ");
			int minutos = sc.nextInt();
			
			if(minutos >= 0 && minutos <= 59) {
				
				System.out.println("¿Cúantos segundos invertistes (pm)? ");
				int segundos = sc.nextInt();
				
				if(segundos >= 0 && segundos <= 59) {
					System.out.println("El tiempo invertido fue de: " + horas + " horas, " + minutos + " minutos y " + segundos + "segundos");
				}
				else {System.out.println("El valor introducido es erróneo");}
			}
			else {System.out.println("El valor introducido es erróneo");}
		}
		else {System.out.println("El valor introducido es erróneo");}
	}
	/*8. Escribe un programa que declare una variable A de tipo entero y asígnale un valor. A continuación
	muestra un mensaje indicando si A es par o impar. Utiliza el operador ternario ( ? : ) dentro de
	WriteLine para resolverlo.*/
	public static void exercise8() {
		int A = 3;
		System.out.println(((A % 2) == 0 ? "Es par" : "Es impar"));
	}
	/*9. Programa que lea una variable entera llamada mes y compruebe con una estructura switch,
	si el valor corresponde a un mes de 30 días, de 31 o de 28. Supondremos que febrero tiene 28
	días. Se mostrará además de los días, el nombre del mes. Se mostrará un error cuando el mes
	no sea válido.*/
	public static void exercise9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el número de mes: ");
		int mes = sc.nextInt();
		switch (mes) {
		case 1:
			System.out.println("El mes de enero tiene " + 31 + " días.");
			break;
		case 2:
			System.out.println("El mes de febrero tiene " + 28 + " días.");
			break;
		case 3:
			System.out.println("El mes de marzo tiene " + 31 + " días.");
			break;
		case 4:
			System.out.println("El mes de abril tiene " + 30 + " días.");
			break;
		case 5:
			System.out.println("El mes de mayo tiene " + 31 + " días.");
			break;
		case 6:
			System.out.println("El mes de junio tiene " + 30 + " días.");
			break;
		case 7:
			System.out.println("El mes de julio tiene " + 31 + " días.");
			break;
		case 8:
			System.out.println("El mes de agosto tiene " + 31 + " días.");
			break;
		case 9:
			System.out.println("El mes de septiembre tiene " + 30 + " días.");
			break;
		case 10:
			System.out.println("El mes de octubre tiene " + 31 + " días.");
			break;
		case 11:
			System.out.println("El mes de noviembre tiene " + 30 + " días.");
			break;
		case 12:
			System.out.println("El mes de diciembre tiene " + 31 + " días.");
			break;
		

		default:
			break;
		}
		
	}
	/*10. Crea un programa que lea una letra tecleada por el usuario y diga si se trata de un signo de
	puntuación (. , ; :), una cifra numérica (del 0 al 9) u otro carácter, usando "switch" (pista:
	necesitarás usar un dato de tipo "char").*/
	public static void exercise10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una letra: ");
		char letra = sc.next().charAt(0);
		
		switch (letra) {
		case '.':
			System.out.println("Es un .");
			break;
		case ',':
			System.out.println("Es una ,");
			break;
		case ':':
			System.out.println("Son dos puntos :");
			break;
		case '0':
			System.out.println("Es un 0");
			break;
		case '1':
			System.out.println("Es un 1");
			break;
		case '2':
			System.out.println("Es un 2");
			break;
		case '3':
			System.out.println("Es un 3");
			break;
		case '4':
			System.out.println("Es un 4");
			break;
		case '5':
			System.out.println("Es un 5");
			break;
		case '6':
			System.out.println("Es un 6");
			break;
		case '7':
			System.out.println("Es un 7");
			break;
		case '8':
			System.out.println("Es un 8");
			break;
		case '9':
			System.out.println("Es un 9");
			break;

		default:
			System.out.println("Es otro carácter");
			break;
		}
	}
	/*11. Pide al usuario 2 números. Después muestra al usuario un menú con las siguientes opciones:
	1. Sumar, 2. Restar, 3. Multiplicar, 4. Dividir. Comprueba la opción elegida, haz la operación y
	muestra el resultado de la misma.
	Si la operación elegida es la división, comprueba que el segundo número (divisor) no sea cero
	antes de hacer la operación.*/
	
	public static void exercise11(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el primer número");
		double num1 = sc.nextDouble();
		System.out.println("Dime el segundo número");
		double num2 = sc.nextDouble();
		if(num2 != 0) { 		
			System.out.println("¿Qué tipo de operación desea realizar?\n");
			System.out.println(" 1.Sumar \n 2.Restar \n 3.Multiplicar \n 4.Dividir");
			int option = sc.nextInt();
			
			boolean seguir = true;
			while(seguir) {
				switch (option) {
				case 1:
					System.out.println("La suma es: "+(num1 + num2));
					break;
				case 2:
					System.out.println("La resta es: "+(num1 - num2));
					break;
				case 3:
					System.out.println("La multiplicaciíon es: "+(num1 * num2));
					break;
				case 4:
					System.out.println("La división es: "+(num1 / num2));
					break;
				default:
					System.out.println("Haz introducido un núemro no válido");
					break;
				}
				
				System.out.print("Deseas continuar: (s / n) ");
				Scanner opc = new Scanner(System.in);
				String response = opc.nextLine().toLowerCase();
				if(response == "n") {seguir = false;}
				else if(response == "s") {seguir = true;}
				else {
					System.out.println("Respuesta erronea");
					break;
				}
			}
		}
		else {
			System.out.println("El divisior no debe ser cero");
		}
	}
	/*12. Crea una variable con el precio de una entrada que inicialmente valga 50. Pregunta al usuario
		  su edad.
		a. Si es menor de edad se le hará un descuento del 25% en la entrada.
		b. Si es mayor de edad pero no está jubilado (65 años), pregúntale si es socio. Si el usuario
		responde “sí” hazle un descuento del 40%.
		c. Si está jubilado se le hará un descuento del 75%.
		d. Finalmente muéstrale el precio que tiene que pagar por la entrada*/
	public static void exercise12() {
		final int mayorEdad = 18;
		final int price = 50;
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime tu edad: ");
		int edad = sc.nextInt();
		//debemos ponerlo sí vamos hacer más de una entrada por teclado o consola después de un int
		sc.nextLine(); //tanbién se podría transformar en entero int edad int edad = Integer.parseInt(sc.nextLine());
		String socio;
		if(edad < mayorEdad) {
			System.out.println("El precio final al aportarte el 25% de descuento es: " + (price * (1-0.25)));
		}
		else if(edad >= mayorEdad && edad < 65) {
			System.out.println("Es usted socio: (si/no)");
			socio = sc.nextLine();
			if(socio.equals("si")) {
				System.out.println("Aplicando un descuento de 40% el precio a pagar es de: "+(price * (1-0.40)));
			}
			else {
				System.out.println("El precio a pagar es de: "+ price);
			}
		}
		else if(edad >= 65) {
			System.out.println("Aplicando un descuento de 75% el precio a pagar es de: "+(price * (1-0.75)));
		}
	}
	/*13. Muestra por pantalla los números de 20 al 1 usando un bucle while, y después hazlo otra vez
	usando un bucle for.*/
	public static void exercise13() {
		int i = 0;
		while(i < 20){
			i++;
			System.out.print(i + " ");
		}
	}
	/*14. Inicializa una variable entera a 0. Después, pregunta al usuario por un número y súmaselo a la
	variable inicial. Repite esto hasta que el usuario introduzca el número cero. Utiliza el bucle
	do..while.*/
	public static void exercise14() {
		int var = 0;
		int num;
		do {
			System.out.println("Dime un número: \n");
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
			var += num;
			if(num == 0) break;
			System.out.println("Resultado: "+ var);
		}
		while(num != 0);
	}
	/*15. Pide al usuario un número y calcula cuantas cifras tiene dicho número. Para ello puedes dividir
	el número entre 10 hasta que el resultado sea cero.*/
	public static void exercise15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un número: ");
		double num = sc.nextDouble();
		
		while(num != 0){
			num += num / 10;
			System.out.println("El número tiene "+ num + " cifras");
		}
	}
	/*16. Pide al usuario un número y dibuja una línea con tantos asteriscos como el número introducido.*/
	public static void exercise16() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un número entero: ");
		int num = sc.nextInt();

		for (int j = 0; j < num; j++) {
			System.out.print(" * ");
		}
	}
	/*17. Muestra los números del 1 al 30 menos los divisibles entre 3 (resto da cero)*/
	public static void exercise17() {
		for (int i = 1; i <= 30; i++) {
			if((i % 3) > 0)
			System.out.println(i);
		}
	}
	/*18. Muestra de 5 en 5, los números del 0 al 100.*/
	public static void exercise18() {
		for (int i = 0; i < 100; i+=5) {
			System.out.print(i+5+" ");
		}
	}
	/*19. Pregunta al usuario un número y muestra del 1 hasta ese número, en una misma línea,
	separados por comas (debes comprobar cuando es el último y no poner una coma en ese
	caso).*/
	public static void exercise19() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un número entero: ");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.print(((i != num) ? i+",": i+""));
		}
	}
	/*20. Repite el ejercicio 2 pero con un bucle infinito (la condición nunca será falsa). En este caso
	tendrás que comprobar dentro del bucle cuando el usuario ha introducido un cero para salir
	(break). Si el usuario introduce un número negativo no lo sumes (usa continue para saltarte la
	suma).*/
	public static void exercise20() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un número entero: ");
		int num = sc.nextInt();
		int i = 1;
		sc.nextLine();
		while (true) {
			System.out.print(i+",");
			i++;
			if(num == 0) break;
			else if(num < 0){
				continue;  //vuelve al comienzo del while
			}
			
		}
	}
	/*21. Pide al usuario un número y dile los divisores de dicho número (resto da cero).*/
	public static void exercise21() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un número entero: ");
		double num = sc.nextDouble();
		
		for (int i = 0; i < num / 2; i++) {
			if((num % i) == 0) {
				System.out.println("Los divisores de dicho número son " + i);
			}
		}
	}
		public static void main(String[] args) {
		//exercise2();
		//exercise3();
		//exercise4();
		//exercise5();
		//exercise6();
		//exercise7();
		//exercise8();
		//exercise9();
		//exercise10();
		//exercise11();
		//exercise12();
		//exercise13();
		//exercise14();
		//exercise15(); //rectificar
		//exercise16();
		//exercise17();
		//exercise18();
		//exercise19();
		exercise20();
		//exercise21();
	
	}
}
