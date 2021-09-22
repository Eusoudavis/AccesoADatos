package UD1;
import java.io.File;
import java.io.IOException;

public class diapositiva5 {
	public static void main(String[] args) {
	    //Crea un fichero en la ruta donde est� el proyecto
	    File miFile = new File("mifichero.txt");
	    //Es obligatorio hacer un try/catch al crear un fichero
	    try {
	        miFile.createNewFile();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
}
