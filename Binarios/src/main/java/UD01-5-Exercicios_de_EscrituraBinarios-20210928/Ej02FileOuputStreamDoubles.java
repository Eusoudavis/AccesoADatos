package UD01;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//ejemplo que escribe numeros doubles en un fichero
// todos los n�meros son reales

public class Ej02FileOuputStreamDoubles {
	public static void main(String[] args) {
		// declaramos los objetos FileOutputStream y DataOutputStream
		FileOutputStream fEscritura;
		DataOutputStream ds = null;
		try{
			// array de enteros
			double [] array = {5.25, 145.18, 2.37, 143.12, 147.10, 169.19, 47.65};

			fEscritura = new FileOutputStream("NUEVODIR\\Decimales.txt", false);
			ds = new  DataOutputStream(fEscritura);
			// mientras el array tenga elementos los escribimos en el fichero
			for (double i : array) {
				ds.writeDouble(i);
			}
		}catch(FileNotFoundException e){
			System.out.println("No se pudo abrir el fichero Enteros.txt");
		}catch(IOException e){
			System.out.println("No se pudo escribir en el fichero Enteros.txt");
		}finally{
			try{
				ds.close();
			}
			catch(IOException e){
				System.out.println("No se pudo cerrar el fichero Enteros.txt");
			}
		}
	}
}
