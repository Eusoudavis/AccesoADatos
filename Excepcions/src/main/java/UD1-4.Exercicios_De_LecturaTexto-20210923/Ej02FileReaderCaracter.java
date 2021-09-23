package UD1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ej02FileReaderCaracter {

	public static void main(String[] args) {
		File f;
		FileReader fr = null;
		int caracter;
		
		try{
			f = new File("Nombres01.txt");
			if(f.exists()){
				fr = new FileReader(f);
				//leemos un caracter y sino es el final lo escribimos el final del fichero -1
				while((caracter = fr.read()) != -1 ){
					System.out.println((char)caracter);
				}
			}else
				System.out.println(("El fichero no existe"));
		}catch(FileNotFoundException fn){
			System.out.println("No se encuentra el fichero");
		}catch(IOException ioe){
			System.out.println("Error de L/E");
		}finally{
			try{
				fr.close();
			}catch(IOException ioe){
				System.out.println("Error al cerrar el fichero");
			}
		}
	}
}
