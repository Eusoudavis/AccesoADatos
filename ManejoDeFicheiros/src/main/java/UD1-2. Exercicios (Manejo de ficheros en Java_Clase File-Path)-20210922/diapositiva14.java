import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class diapositiva14 {
	public static void main(String[] args) {

	    Path ruta = Paths.get("mifichero.txt");
	    Path rutaDestino = Paths.get("c:\\mifichero.txt");

	    try {
	        //Copia ficheros de disco
	        Files.copy(ruta, rutaDestino);
	    } catch (IOException e) {
	        System.out.println(e.toString());
	    }

	}

}
