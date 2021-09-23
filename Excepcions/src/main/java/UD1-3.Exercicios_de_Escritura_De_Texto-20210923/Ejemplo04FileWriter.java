package UD1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/*
 * Escribe cadenas de caracteres que se obtiene de un array de String, las cadenas se graban desde un
 *  desplazamiento  de 10 caracteres
 */
public class Ejemplo04FileWriter {
	public static void main(final String[] args) {

		String cadena = "Probando el desplazamiento y el numero de caracteres a escribir";

		try{
			//File f= new File("D:\\Ciclos Formativos\\ProyectosAccesoDatos1718"
			//		+ "\\FicherosTexto\\Prueba.txt");
			File f= new File("Provincias.txt");
			FileWriter fw = new FileWriter(f); // crea el fichero de salida

			//desde la posici�n 3 escribe 10 caracteres
			fw.write(cadena, 3, 10);

			fw.close();
		}catch(IOException ioe){
			System.out.println("Disco lleno o protegido");
		}finally{
			System.out.println("programa finalizado");
		}
	}

}
