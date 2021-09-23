package UD1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//ejemplo que lee el fichero nombres linea a linea
public class Ej01FileReaderLineas {

	public static void main(String[] args) {
		File f;
		FileReader fr;
		BufferedReader br = null;
		try{
			f = new File("Nombres.txt");
			if(f.exists()){
				fr = new FileReader(f);
				br = new BufferedReader(fr);
				String nombre; // variable donde se recupera la informacion
				while((nombre = br.readLine())!= null){
					System.out.println(nombre);
				}
			}else
				System.out.println(("El fichero no existe"));
		}catch(FileNotFoundException fn){
			System.out.println("No se encuentra el fichero");
		}catch(IOException ioe){
			System.out.println("Error de L/E");
		}finally{
			try{
				System.out.println("Fin del programa");
				br.close();
			}catch(IOException ioe){
				System.out.println("Error al cerrar el fichero");
			}
		}
	}
}
