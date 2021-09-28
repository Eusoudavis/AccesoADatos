package UD01;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ej01FileOutputStreamEnteros {
	
	//exemplo que escribe numeros enteiros nun ficheiro, sempre n�meros do mesmo tipo.


	public static void main(String[] args) {
		// declaramos os obxectos FileOutputStream e DataOutputStream
		FileOutputStream fEscritura = null;
		DataOutputStream ds = null;
	
		try{
			
			// arrai de enteiros
			int [] array = {5, 18, 23, 12, 10, 1, 47};
			
			String [] nombres = {"Bea", "Ana", "Maria", "Juan", "Pedro","Teresa","Marta"};
				
			fEscritura = new FileOutputStream("NUEVODIR\\EnterosNombres.txt", true);//Crear obxecto FileOutputStream
			ds = new  DataOutputStream(fEscritura); 
			
			// mentras o arrai ten elementos, escribimos no ficheiro
			for (int i=0 ;i<array.length; i++) {
				ds.writeInt(array[i]);//Escribimos un dato tipo int
				ds.writeUTF(nombres[i]); //Escribimos un string.
			}
		}catch(FileNotFoundException e){
			System.out.println("No se pudo abrir el fichero Enteros.txt");
		}catch(IOException e){
			System.out.println("No se pudo escribir en el fichero Enteros.txt");
		}
 		finally{
			try{
				ds.close();
				fEscritura.close();
			}
			catch(IOException e){
				System.out.println("No se pudo cerrar el fichero Enteros.txt");
			}
		}
	}
}
