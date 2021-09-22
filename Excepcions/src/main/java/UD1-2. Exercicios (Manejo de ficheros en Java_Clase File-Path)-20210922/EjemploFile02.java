package UD1;
/*
 * Ejemplo que muestra la lista de ficheros del directorio actual
 */
import java.io.File;

public class EjemploFile02 {
	public static void main(final String[] args) {
		System.out.println("Lista de ficheros del directorio actual:");
		//File f = new File(".");
		//File f = new File("F:\\probasAD\\ciclosFormativos");
		String separator = File.separator;
		File f = new File("C:\\Users\\dgcives\\Desktop\\A DE ANTONIO"/*+separator+"probasAD"+separator+"ciclosFormativos"+separator*/);
		String[] archivos = f.list();
		for(int i=0; i< archivos.length; i++){
			System.out.println(archivos[i]);
		}
	}
}

 
 
