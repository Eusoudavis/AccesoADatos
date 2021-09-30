/*
 * Ejemplo que lee el primer objeto de un fichero en disco
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class LecturaObjetoPersona01 {
	public static void main(final String[] args) {
		System.out.println("Nombre \t Edad" );
		try{
			// abrimos el fichero para lectura
			FileInputStream fs = new FileInputStream("NUEVODIR\\Personas.obj");//ficheiro creado no exemplo EscrituraObjetoPersona
			ObjectInputStream os = new ObjectInputStream(fs);

			// unicamente recollemos o PRIMEIRO obxecto, en exemplos posteriores, recolleranse todos.
			// os debe realizar un casting al tipo original
			Persona p = (Persona) os.readObject();  //debemos indicar a que clase imos a castear o obxecto recollido para poder deserializalo.
			System.out.println(p.getNombre() +"\t" +p.getEdad()); //como estamos a tratar xa cun obxecto persoa, podemos acceder aos m�todos.

			os.close();
		}catch(ClassNotFoundException cnf){
			System.out.println("Error la clase");
		}catch(FileNotFoundException fnfe){
			System.out.println("Error en el fichero");
		}catch(IOException ioe){
			System.out.println("Error E/L");
		}
	}

}
