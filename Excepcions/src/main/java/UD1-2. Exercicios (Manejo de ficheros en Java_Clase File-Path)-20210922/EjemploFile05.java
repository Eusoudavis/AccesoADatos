package UD1;

import java.io.File;
import java.io.IOException;

public class EjemploFile05 {

	public static void main(String[] args) {
		File directorio = new File("NUEVODIR"); // directorio que se crea a partir del actual
		File fichero1 = new File(directorio, "Fichero1.txt");
		File fichero2 = new File(directorio, "Fichero2.txt");
		
		directorio.mkdir(); // crea el directorio
		try{
			if(fichero1.createNewFile())
				System.out.println("Fichero1 creado correctamente");
			else
				System.out.println("Fichero1 no se ha podido crear");
			if(fichero2.createNewFile())
				System.out.println("Fichero2 creado correctamente");
			else
				System.out.println("Fichero2 no se ha podido crear");
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		fichero1.renameTo(new File(directorio, "nuevoFichero")); // renombtramos el fichero
		
		try{
			File fichero3 = new File("NUEVODIR/Fichero3.txt");
			fichero3.createNewFile(); // crea Fichero3 en NUEVODIR 
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		
		if(fichero2.delete())
			System.out.println("Fichero2 borrado correctamente");
		else
			System.out.println("Fichero2 no se ha podido borrar");
	}
}
