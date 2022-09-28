package Java1;

import java.util.Scanner;

public class Exercise1 {
	
	//1. Crea un programa que diga el resultado de sumar 36 y 27.
	public static void exercise1() {
		int num1 = 36;
		int num2 = 27;
		System.out.println("El resultado de sumar 36 y 27: " + (num1+num2));
	}
	
	/*2. Crea un programa con 2 variables de tipo entero con los valores 15 y 4. Para estos valores calcula la
	suma, la resta, la multiplicación, la división y el resto. Ten en cuenta que al ser 2 números enteros, el
	resultado de la división también será entero. Muestra por pantalla los resultados de esta manera:*/
	
	public static void exercise2() {
		int n1 = 15;
		int n2 = 4;
		System.out.println("15 + 4 = "+(n1+n2)+'\n'+
						   "15 - 4 = "+(n1-n2)+'\n'+
						   "15 / 4 = "+(n1/n2)+'\n'+
						   "15 * 4 = "+(n1*n2)+'\n'+
						   "15 % 4 = "+(n1%n2)+'\n');
	}
	
	/*3. Crea 2 variables enteras con el mismo valor en la misma línea (declaración y asignación) y muestra la
	siguiente información:
	a. Si la primera variable es menor que la segunda
	b. Si son iguales
	c. Si la primera variable es mayor o igual Sque la segunda*/
	
	public static void exercise3() {
		int numero1 = 4; int numero2 = 4;
		System.out.println(numero1 + " es menor que " + numero2 + ": " + (numero1 < numero2));
		System.out.println(numero1 + " son iguales " + numero2 + ": " + (numero1 == numero2));
		System.out.println(numero1 + " es mayor o igual que " + numero2 + ": " + (numero1 >= numero2));
	}
	
	/*4. Crea 4 variables de tipo double con los valores que quieras. A continuación muestra sus valores por
	consola usando 4 instrucciones para imprimir por consola y sin generar ningún salto de línea (todos
	los valores se verán en una sola línea*/
	
	public static void exercise4() {
		double v1 = 10;
		double v2 = 5;
		double v3 = 3;
		double v4 = 4;
		
		System.out.println(((v1+v2) * v3) / v4 );
	}
	
	/*5. Escribe un programa que declare una variable entera N y asígnale un valor. A continuación escribe las
	instrucciones que realicen los siguientes:*/
	
	public static void exercise5() {
		int N = 1;
		N += 77;
		System.out.println(N);
		N =- 3;
		System.out.println(N);
		N *= 2;
		System.out.println(N);
	}
	
	/*6.Programa que declare cuatro variables enteras A, B, C y D y asígnale un valor a cada una. A
	continuación escribe las instrucciones necesarias para que: */
	
	public static void exercise6() {
		int A = 1;
		int B = 2;
		int C = 3;
		int D = 4;
		
		int auxA = A;
		int auxB = B;
		int auxC = C;
		int auxD = D;
		
		B = auxC;
		C = auxA;
		D = auxB;
		A = auxD;
		
		System.out.println("B toma el valor de C -> B = " + auxB);
		System.out.println("C toma el valor de A -> C = " + auxC);
		System.out.println("A tome el valor de D -> A = " + auxA);
		System.out.println("D tome el valor de B -> D = " + auxD);
	}
	/*7. Crea un programa donde definimos 2 variables de tipo carácter. Muestra la posición de cada carácter
		en la tabla unicode y la diferencia entre ambos caracteres. Si los caracteres son ‘b’ y ‘k’, la salida
		sería:*/
	public static void exercise7() {
		char b = 'b'; char k = 'k';
		System.out.println("'b' tiene la posición "+ (int)b);
		System.out.println("'k' tiene la posición "+ (int)k);
		System.out.println("La diferencia entre 'b' y 'k': "+ ('k' - 'b'));
	}
	/*8. ¿Cuál sería el resultado de las siguientes operaciones? a=5; b=++a; c=a++; b=b*5; a=a*2;
		Calcúlalo a mano y luego crea un programa que lo resuelva, para ver si habías hallado la
		solución correcta.*/
	public static void exercise8() {
		int a = 5;int b; int c;
		b = ++a;//incrementa e imprime 6
		c = a++;//imprime 6 y  luego incrementa
		b = b*5;
		a = a*2;//incrementa a 7 y multiplica
		
		System.out.println( "a: " + a + "\n" + "b: " + b+ "\n" + "c: " + c);
	}
	/*9. Pregúntale al usuario su nombre y muestra un mensaje saludándole con su nombre*/
	public static void exercise9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime tu nombre ");
		String name = sc.nextLine();
		System.out.println("Hola"+name);
	}
	/*10. Escribe un programa que lee un número entero por teclado y obtiene y muestra por pantalla el doble y
	el triple de ese número. */
	public static void exercise10() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número: ");
		float number = sc.nextFloat();
		
		number *= 2;
		System.out.println("El doble del número es: "+number);
		number *= 3;
		System.out.println("El triple del número es: "+number);
	}
	/*11. Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. La fórmula
	correspondiente para pasar de grados centígrados a fahrenheit es:*/
	public static void exercise11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("¿A cúantos grados centígrados estas: ?");
		int Grados = sc.nextInt();
		double Fahrenheit = 32 + (9 * ((double)Grados / 5));
		System.out.println("Eso equivale a tener: "+Fahrenheit+" ºF");
	}
	/*12. Programa que lea un número entero de 3 cifras y muestre por separado las cifras del número.*/
	public static void exercise12() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime 3 cifras");
		int num = sc.nextInt();
		int unidades = num % 10;
		int num2 = num / 10; 
		int decenas = num2 % 10; 
		int centenas = num2 / 10;
		
		System.out.println("Centenas: " + centenas + ", decenas: " + decenas + ", unidades: " + unidades);
	}
	/*13. Programa que pida por teclado la fecha de nacimiento de una persona (dia, mes, año) y calcule su
	número de la suerte. El número de la suerte se calcula sumando el día, mes y año de la fecha de
	nacimiento y a continuación sumando las cifras obtenidas en la suma. */
	public static void exercise13() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu fecha de nacimiento: (dia, mes, año)");
		int dia = sc.nextInt();
		int mes = sc.nextInt();
		int año = sc.nextInt();

		int suma = dia + mes + año;
		int num1 = suma % 10;
		int num2 = (suma / 10) % 10;
		int num3 = (suma / 10) % 10;
		//int num4 = num /10;
		
		//System.out.println("Tú número de la suerte es: " + ());
	}
	public static void main(String[] args) {
		
		/*exercise1();
		exercise2();
		exercise3();
		exercise4();
		exercise5();
		exercise6();
		exercise7();
		exercise8();
		exercise9();
		exercise10();
		exercise11();
		exercise12();*/
		exercise13();
	}
}
