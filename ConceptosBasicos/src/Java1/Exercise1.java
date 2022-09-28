package Java1;

import java.util.Scanner;
//NNN
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
		
		A= (A != D) ? D : A;
		B= (B != C) ? C : B;
		C= (C != A) ? A : C;
		D= (D != B) ? B : D;
		
		System.out.println("B toma el valor de C -> B = " + B);
		System.out.println("C toma el valor de A -> C = " + C);
		System.out.println("A tome el valor de D -> A = " + A);
		System.out.println("D tome el valor de B -> D = " + D);
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
		b = ++a;
		c = a++;
		b = b*5;
		a = a*2;
		
		System.out.println( a + "\n" + b+ "\n" + c);
	}
	//prueba guardar cambios
	public static void main(String[] args) {
		
		/*exercise1();
		exercise2();
		exercise3();
		exercise4();
		exercise5();
		exercise6();
		exercise7();*/
		exercise8();
	}
}
