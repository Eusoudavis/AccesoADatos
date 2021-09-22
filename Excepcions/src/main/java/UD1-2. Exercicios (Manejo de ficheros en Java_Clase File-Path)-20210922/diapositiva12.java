package UD1;
import java.nio.file.Path;
import java.nio.file.Paths;
public class diapositiva12 {
	public static void main(String[] args) {

	    System.out.println("Informaci�n de la ruta actual");
	   //Paths devuelve la ruta que indiquemos
	    Path relative = Paths.get(".");
	    Path absolute = relative.toAbsolutePath().normalize();

	    System.out.printf("Ruta relativa: %s\n", relative);

	    System.out.printf("Ruta absoluta: %s\n", absolute);

	    System.out.printf("N� carpetas de ruta abs.: %d\n", absolute.getNameCount());

	    System.out.printf("Carpeta padre: %s\n", absolute.getParent());

	    System.out.printf("Subcarpetas de la ruta (0, 1): %s\n", absolute.subpath(0, 1));
	}

}
