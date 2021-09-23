package UD1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/*
 * escribe caracteres en un fichero de nombre FichTexto01.txt (si no existe lo crea).
 *  se escribe el array completo en una operaci�n de escritura
 */

public class Ejemplo02FileWriter {
	public static void main(final String[] args) throws IOException {

		File f= new File("FichTexto01.txt");
		FileWriter fw = new FileWriter(f); // crea el fichero de salida

		String cadena = "Esto es una prueba de FileWriter m�todo write escribiendo caracter a caracter";

		char[] cad = cadena.toCharArray(); // convierte un String en un array de caracteres
		fw.write("HOla");
		for(int i=0; i< cad.length; i++){
			fw.write(cad[i]); // se escribe un caracter
			fw.write("\n");
		}
		fw.append('*'); // a�ade un * al final
		fw.write(cadena);
		fw.append('*'); // a�ade un * al final
		fw.write(cad);
		fw.close(); // cierra el fichero
		System.out.println("Programa Finalizado");
	}
}
