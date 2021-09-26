import java.io.File;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.IOException;
public class diapositiva13 {
	public static void main(String[] args) {
	    boolean creado = false;  
	        
	    File miFichero = new File("mifichero1.txt");
	    try {
	        creado = miFichero.createNewFile();
	    } catch (IOException ex) {
	        System.out.println(ex.toString());
	    }

	    Path ruta1 = Paths.get("mifichero.txt");

	    System.out.println(ruta1.getFileName());
	    System.out.println(ruta1.toAbsolutePath());

	    Path ruta2 = ruta1.toAbsolutePath();
	    //La interfaz Path implementa Iterator
	    for (Path miniruta : ruta2) {
	        System.out.println(miniruta);
	    }
	}
}
