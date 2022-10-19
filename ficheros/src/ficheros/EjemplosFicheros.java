package ficheros;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class EjemplosFicheros {
	
	public static void leer1(String directorio,String nombreFichero) throws IOException {
		Files.readAllLines(Paths.get(directorio + File.separator + nombreFichero))
		.forEach(e->System.out.println(e));//coge todas las líneas de fichero Paths(coger)
	}
	public static void leer2(String directorio,String nombreFichero) throws IOException {
		String rutaAbsoluta = directorio + File.separator + nombreFichero; // construir la cadena
		Path rutaOrdenador = Paths.get(rutaAbsoluta); //transformar la cadena en una ruta 
		List<String> lineaFichero = Files.readAllLines(rutaOrdenador); //lee el fichero y 
		lineaFichero.forEach(e->System.out.println(e)); //recorre las líneas
	}
	
	public static void main(String[] args) throws IOException {
		leer1("c:\\ficheros","EOI.txt"); //para que la reconozca deben ser dos \\ mñas no 1
		//leer2("c:\\ficheros","EOI.txt");
	}
}
