package Funciones;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Funciones {
	/*1. Crea una función que te dibuje una fila de 20 asteriscos usando un bucle. Llámala desde el main 3 veces.*/
	private static void ejercicio1() {
		for (int i = 0; i <20; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	/*2. Crea una función que reciba una cadena y 2 números enteros por parámetro y te
	imprima si la longitud de la cadena está entre los 2 números o no. Llámala al menos 2
	veces, una en la que sí esté en el rango, y otra en la que no.*/
	public static void ejercicio2(String  cadena, int num1, int num2) {
		System.out.println(cadena.length() >= Math.min(num1, num2) && cadena.length() <= Math.min(num2,num1) ? 
				"la longitud de la cadena esta en el rango de: " + cadena.length():
				"Error: la cadena sale del rango indicado");
	}
	/*3. Crea una función que reciba un carácter y un número, dibuja un cuadrado usando ese
	carácter cuyo ancho y alto sea igual al número recibido. Prueba la función.*/
	public static void ejercicio3(char caracter, int numero) {
		// Fila arriba
		for(int i=0; i<numero;i++) {
			System.out.print(caracter);
		}
		System.out.println();
		
		// Filas de mitad
		for(int i=0; i<numero-2;i++) {
			System.out.print(caracter);  // el lado izquierdo del cuadrado
			for(int j=0; j<numero-2;j++) {
				System.out.print(" ");
			}
			System.out.print(caracter); // el lado derecho del cuadrado
			System.out.println();
		}
				
		// Fila abajo
		for(int i=0; i<numero;i++) {
			System.out.print(caracter);
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
	public static String ejercicio7(String[] cadenas) {
		int aleatorio = new Random().nextInt(0,cadenas.length);
		return cadenas[aleatorio];
	}
	/*8. Crea una función que reciba un número indeterminado de parámetros enteros y
	devuelva el máximo. Ten en cuenta que si recibes cero números, debes devolver cero
	también.*/
	public static int ejercicio8(int...numeros){
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] > numeros[i+1])
				return Math.max(numeros[i], numeros[i+1]);
		}
		return 0;
	}
	/*9. Crea una función que reciba una cadena y una subcadena por parámetro y devuelva
	cuantas veces aparece la subcadena dentro de la cadena. Para ello debes saber que
	como segundo parámetro a indexOf le puedes pasar la posición a partir de la cual
	buscar (empezaríamos en cero). Cuando te devuelva -1 es que ya no la ha encontrado
	(utiliza un bucle).
	Por ejemplo, si recibimos “cocinando cocos con chocolate” y “co” devolveremos el
	número 4.*/
	public static int ejercicio9(String cadena, String subcadena ) {
		int veces = 0;
		int posicion = 0;
		int pos=0;
		do {
			posicion = cadena.indexOf(subcadena,pos);
			if(posicion != 1)
			{
				pos++;
				veces++;
			}
		}while(pos != 1);
        return veces;
	}
	/*10. Crea una función que reciba una cadena, un separador (char) y un número n. La
	función insertará el separador dentro de la cadena cada n caracteres (ten en cuenta
	que al insertar el separador, la siguiente posición se incrementa en 1.*/
	public static void ejercicio10(String cadena,char separador, int n) {
		for (int i = 0; i < cadena.length(); i++) {
			System.out.print(cadena.charAt(i));
			if (i == n) {
				System.out.print(separador);
				n+=2;
			}
		}
	}
	/*11. Crea una función que reciba una cadena con una serie de números separados por
	punto y coma “;”, y devuelva la media de dichos números.*/
	public static double ejercicio11(String num) {
		String[] numeros = num.split(";");
		double value = 0;
		for (int i = 0; i < numeros.length; i++) {
			value += Double.parseDouble(numeros[i]);
		}
		return value / numeros.length;
	}
	/*12. Crea una función que reciba un array de cadenas y te lo devuelva ordenado
	alfabéticamente de la ‘z’ a la ‘a’.*/
	public static String[] ejercicio12(String[] cadenas) {
		Arrays.sort(cadenas,Collections.reverseOrder());
		return cadenas;
	}
	/*13. Crea una función que reciba un array de números y un número. y te devuelva cuantas
	veces aparece ese número en el array.*/
	
	public static void ejercicio13(int[] numeros, int n) {
		int veces = 0;
		for (int i = 0; i < numeros.length; i++) { //cuantas veces el numero aparce ene l array de numeros
			if(numeros[i] == n)
				veces++;
		}
		System.out.println("El "+n+" aparece "+ veces+" veces");
	}
	public static String MesesEspanol(int mes) {
            String resultado = "";
	    switch(mes) {
            case 1:
                resultado = "enero";
                break;
            case 2:
                resultado = "febrero";
                break;
            case 3:
                resultado = "marzo";
                break;
            case 4:
                resultado = "abril";
                break;
            case 5:
                resultado = "mayo";
                break;
            case 6:
                resultado = "junio";
                break;
            case 7:
                resultado = "julio";
                break;
            case 8:
                resultado = "agosto";
                break;
            case 9:
                resultado = "septiembre";
                break;
            case 10:
                resultado = "octubre";
                break;
            case 11:
                resultado = "noviembre";
                break;
            case 12:
                resultado = "diciembre";
                break;
            default:
                resultado = "mes fuera del calendario";
                break;
        }
        return resultado;
    }
	/*14. Crea una función que a partir de una fecha (LocalDateTime) que reciba por parámetro,
	te devuelva una cadena con la fecha en el siguiente formato:
	Si recibimos la siguiente fecha “04/07/2019”, devolvería “Jueves, 4 de julio de 2019”.*/
	public static String ejercicio14(String fecha) {
	    LocalDate fechaConvertirda = LocalDate.parse(fecha);
	    var mes = fechaConvertirda.getMonth().getValue();
	    var dia = fechaConvertirda.getDayOfMonth();
	    var anyo = fechaConvertirda.getYear();
	    var diaValor = fechaConvertirda.getDayOfWeek().getValue();
	    String result = "";

	   switch(diaValor){
	    case 1:
	        result = "lunes, " + dia + " de " + MesesEspanol(mes) + " de " + anyo;
	        break;
	    case 2:
	        result = "martes, " + dia + " de "+ MesesEspanol(mes) + " de " + anyo;
	        break;
	    case 3:
	        result = "miércoles, " + dia + " de "+ MesesEspanol(mes) + " de " + anyo;
	        break;
	    case 4:
	        result = "jueves, " + dia + " de "+ MesesEspanol(mes) + " de " + anyo;
	        break;
	    case 5:
	        result = "viernes, " + dia + " de "+ MesesEspanol(mes) + " de " + anyo;
	        break;
	    }
    return result;
	   
	}
	/*15. Crea una función que reciba una fecha en formato dd-mm-yyyy, conviértela a fecha
	(LocalDate) utilizando la función subString o split para extraer el día, mes y año, o usa
	el DateTimeFormatter, súmale 2 años, 3 meses y 5 días, y muestra la fecha resultante.*/
	public static void ejercicio15(String fecha) {
		String[] fechaArray = fecha.split("-");
		String day = fechaArray[0];
		String mes = fechaArray[1];
		String anyo = fechaArray[2];
		System.out.println("Día: "+day+" mes: " + mes + " año: " + anyo);

		LocalDate Formatofecha = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-y"));
		System.out.println(Formatofecha); //1995-04-04
		
		System.out.println(Formatofecha.plusYears(2).plusMonths(3).plusDays(5));//1997-07-09
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
		/*
		String[] cadenas = {"Nadis","Julia","Fernando","Joanna","Luz Elena"};
		String CaracterAleatorio = ejercicio7(cadenas);
		
		boolean adivina = true;
		int intento = 3;
		do{
			Scanner sc = new Scanner(System.in);
			System.out.print("Adivina la palabra seleccionada ");
			String palabra = sc.next();
			if(palabra.equalsIgnoreCase(CaracterAleatorio)) {
				System.out.println("Felicidades, has adivinado");
				adivina = false;
			}
			else {
				System.out.print("Te quedan: "+ (intento-1)+ " intentos. ");
				intento--;
			}
			if(intento == 0)
				System.out.println("La respuesta era: "+ CaracterAleatorio);
		}while(adivina && intento != 0 || intento < 0);
		*/
		/*
		int valorMax = ejercicio8(7,65,8);
		int valorMax1 = ejercicio8();
		System.out.println(valorMax);
		System.out.println(valorMax1);
		*/
		/*
		String cadena = "cocinando cocos con chocolate";;
		String busca = "co";
		int apariciones = ejercicio9(cadena,busca);
		System.out.println(apariciones == -1 ? "La cadena no se encuentra" : "La cadena aparece "+ apariciones + " veces");
		*/
		
		//ejercicio10("Hay una mosca en mi sopa",'*',3);
		
		/*double media = ejercicio11("5;8;90;8;87.46");
		System.out.println(Math.floor(media*100) /100); //para que el redondeo salga con dos decimales*/
		/*
		String[] cadenas = {"Nadis","Julia","Fernando","Joanna","Luz Elena"};
		String[] OrdenAlfareverse = ejercicio12(cadenas);
		System.out.println(String.join(", ", OrdenAlfareverse));
		*/
		/*
		int[] numeros = {12,12,54,12,9};
		ejercicio13(numeros,12);
		*/
		/*
		String date = ejercicio14("2019-07-04");
		System.out.println(date);
		*/
	    ejercicio15("04-04-1995");
	}
}
