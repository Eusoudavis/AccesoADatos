package UD01;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class EjemploFileInputStream01 {
	public static void main(final String[] args) {
		FileInputStream fLectura = null;
		DataInputStream ds = null;
		try{
			fLectura = new FileInputStream("NUEVODIR\\EnterosNombres.txt");
			ds = new DataInputStream(fLectura);
			//bucle infinito
			while(true){
				System.out.print(ds.readInt() +" " );//Lemos enteiro
				System.out.println(ds.readUTF()); //lemos string
			}
		}catch (FileNotFoundException e){
			System.out.println("ERROR GRAVE: El fichero Enteros.txt no est� disponible");
			return;
		}catch (EOFException e){
				System.out.println("Fin del fichero");
		}catch(IOException ioe){
			System.out.print("Error no se ha podido leer de Enteros.txt");
		}
		finally{
			try{
				ds.close();
				System.out.println("Fin del programa");
			}
			catch(IOException e){
				System.out.print("Error no se ha podido cerrar Enteros.txt");
			}
		}
	}
	
}
