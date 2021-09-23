package UD1;
import java.io.File;
import java.io.FileWriter;

import java.io.IOException;
import java.io.PrintWriter;

// Ejemplo de utilizaci�n de las clase FileWriter y PrintWriter

public class Ejemplo01FileWriter {
	public static void main(String[] args) throws IOException {
	//array de nombres
	String [] nombres = {"Pepito", "Ana", "Santiago", "Jorge", "Iciar", "Isabel", "Pedro", 
	"Manuel", "Jaime"};
		
	File f = new File("Nombres.txt");
	FileWriter fw = new FileWriter(f);
		 
	//PrintWriter permite salida con formato
	// la siguiente sentencia a�ade los nombres a los ficheros
    //	FileWriter fw = new FileWriter("Nombres.txt", true);
	
	
		PrintWriter salida = new PrintWriter(fw);
		// las dos sentencias anteriores son equivalentes a la siguiente
		
	//	PrintWriter salida = new PrintWriter("Nombres.txt");
		
		for (int i = 0; i < nombres.length; i++) {
			salida.println("Elemento: "+ i+" "+nombres[i]);
		}
		salida.flush();
		salida.close();
		fw.close();
		
	}
}


