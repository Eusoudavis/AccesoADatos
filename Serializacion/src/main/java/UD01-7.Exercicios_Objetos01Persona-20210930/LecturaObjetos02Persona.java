
/*
 * Ejemplo que lee todos los objeto de un fichero en disco
 * � o mesmo caso que no exemplo anterior, unicamente agora os lemos todos
 * para saber cando rematamos de ler, hai que comprobar se tamos no final
 * do ficheiro, para iso usamos un while...
 */
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LecturaObjetos02Persona {
	public static void main(final String[] args) throws IOException {

		//abrimos el fichero de lectura 
		FileInputStream fs = null;
		ObjectInputStream os = null;

		System.out.println("Nombre \t Edad" );
		try{
			fs = new FileInputStream("NUEVODIR\\PersonasNOVAS.txt");
			os = new ObjectInputStream(fs);
			
			while(true){ // lectura del fichero mientras haya objetos
				// os debe realizar un castingal tipo original
				Persona p = (Persona)os.readObject();
				System.out.println(p.getNombre() +"\t" +p.getEdad());
			}
		}catch(ClassNotFoundException cnf){
			System.out.println("Error la clase");
		}catch(FileNotFoundException fnfe){
			System.out.println("Error en el fichero");
		}catch(EOFException eo){ //capturamos a situaci�n de chegar ao final do ficheiro, amosar aviso de fin.
			System.out.println("Fin del fichero");
		}
		catch(IOException ioe){
			System.out.println("Error");
		}
		os.close();
	}

}
