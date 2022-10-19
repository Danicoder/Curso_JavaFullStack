package Funciones;

public class Funciones {
	/*1. Crea una función que te dibuje una fila de 20 asteriscos usando un bucle. Llámala desde el main 3 veces.*/
	private static void ejercicio1() {
		for (int i = 0; i <20; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	/*. Crea una función que reciba una cadena y 2 números enteros por parámetro y te
	imprima si la longitud de la cadena está entre los 2 números o no. Llámala al menos 2
	veces, una en la que sí esté en el rango, y otra en la que no.*/
	public static void ejercicio2(String  cadena, int num1, int num2) {
		if(cadena.length() >= num1 && cadena.length() <= num2) {
			System.out.println("la longitud de la cadena esta en el rango de: " + cadena.length());
		}
		else {
			System.out.println("Error: la cadena sale del rango indicado");
		}
	}
	/*3. Crea una función que reciba un carácter y un número, dibuja un cuadrado usando ese
	carácter cuyo ancho y alto sea igual al número recibido. Prueba la función.*/
	public static void ejercicio3(char caracter, int lado) {
		for (int i = 0; i < lado; i++) {
			for (int j = 0; j < lado; j++) {
				System.out.print(caracter);
			}
			System.out.println();
		}
	}
	/*4. Crea una función con 2 parámetros. El primero será una cadena y representa al
	nombre de una persona, mientras que el segundo contendrá al resto de parámetros
	recibidos (…), que serán cadenas con los trabajos que la persona ha realizado.*/
	public static void ejercicio4(String nombre, String...trabajos) {
		if(trabajos.length == 0) {
			System.out.println(nombre+" nunca ha trabajado");
		}
		else {
			System.out.println(nombre + " ha trabajado como: "+ String.join(", ", trabajos));
		}
	}
	/*5. Crea una función que reciba un número y devuelva un booleano indicando si el número
	recibido es primo o no. Llama a la función varias veces y muestra el resultado
	devuelto. Recuerda que un número primo es aquel que solo es divisible (resto == 0)
	entre 1 y él mismo.*/
	public static void ejercicio5(int numero) {
		boolean primo = false;
		if((numero % 2) == 0) {
			System.out.println(primo);
		}
		else {
			System.out.println(primo=true);
		}
	}
	/*6. Crea una función que reciba un array de números y devuelva su media.*/
	public static void ejercicio6(double[] array) {
		double media = 0;
		double suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		media = suma / array.length;
		System.out.println("La media es: "+media);
	}
	/*7. Crea una función que reciba un array de cadenas por parámetro y devuelva una de las
	cadenas al azar. Pista: puedes generar un número aleatorio entre 0 y la última
	posición del array usando new Random().nextInt(array.length).
	A continuación pide al usuario que adivine la palabra seleccionada (tiene 3 intentos,
	usa un bucle). Si la acierta felicítale, y si no, dile cual era la correcta.*/
	public static void ejercicio7(String[] cadenas) {
		for (String cadena : cadenas) {
			cadena
		}
	}
	public static void main(String[] args) {
		//se podría repetir también con un for tantas veces como llamadas a la función se quieran hacer
		/*
		ejercicio1();
		ejercicio1();
		ejercicio1();
		*/
		/*
		ejercicio2("Hola",2,4); //sí esta en el rango
		ejercicio2("Chao",7,8); //no esta en el rango
		*/
		//ejercicio3('*',10);
		/*
		ejercicio4("Daniela");
		ejercicio4("Daniela","Auxiliar","camarera");
		ejercicio4("Daniela","Auxiliar","camarera","cocinera");
		*/
		/*ejercicio5(23);//primo
		ejercicio5(90);//no primo*/
		/*
		double[] numeros = {12,14,54,87,9};
		ejercicio6(numeros);
		*/
		//String[] cadenas = {"Nadis","Julia","Fernando"};		
	}
}
