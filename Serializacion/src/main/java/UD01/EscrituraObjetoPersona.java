package UD01;
/*
 * este ejemplo escribe objetos del tipo Persona en un fichero en disco
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscrituraObjetoPersona {
	public static void main(final String[] args) {
		// creamos los objetos que nos permiten escribir
		FileOutputStream fs = null;
		ObjectOutputStream os = null;

		try{
			fs = new FileOutputStream("Personas.obj"); //creamos un obxecto fileoutputstream que permita engadir informacion ao ficherio ou sobrescribila
			os = new ObjectOutputStream(fs);
		
		
			Persona p = new Persona("Marta peres", 32);//declaramos o obxeto persoa
			os.writeObject(p);  //escribimos no disco

			
			os.writeObject(new Persona("Ana S�nchez", 27)); // outro xeito: escribimos pasando la creaci�n del objeto
			//	p = new Persona();
			p.setEdad(44);
			p.setNombre("Pedro Mart�nez");
			os.writeObject(p);  //outro xeito mais, chamando aos m�todos.

			// cerramos el fichero
			os.close();
		}catch(FileNotFoundException fne){
			System.out.println("Error en el fichero");
		}catch(IOException ioe){
			System.out.println("Error E/L");
		}
	}
}
