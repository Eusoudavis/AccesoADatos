package UD01;
/* outro exemplo, onde se escriben varios obxectos empregando un for
 * para facelo todo xunto.
 * �� � analogo ao exercicio anterior.
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscrituraVariosObjetos {
	public static void main(final String[] args) {
		// creamos los objetos que nos permiten escribir
		FileOutputStream fs = null;
		ObjectOutputStream os = null;
		
		try{
			fs = new FileOutputStream("PersonasNOVAS.txt");
			os = new ObjectOutputStream(fs);
			//declaramos el objeto Persona usando un constructor y escribimos en el disco
			Persona p=new Persona();; 				
				
			
			for(int i=0; i<3;i++){
				//p = new Persona();
				p.setEdad(25+i);
				p.setNombre("Ana");
				os.writeObject(p);
			}
			
			
			// escribimos pasando la creaci�n del objeto
			os.writeObject(new Persona("Ana S�nchez", 27));
		
		
			
			// cerramos el fichero
			os.close();
		}catch(FileNotFoundException fne){
			System.out.println("Error en el fichero");
		}catch(IOException ioe){
			System.out.println("Error E/L");
		}
		System.out.println("Fin del programa");
	}
}
