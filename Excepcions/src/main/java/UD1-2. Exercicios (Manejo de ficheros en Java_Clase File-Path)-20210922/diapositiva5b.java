package UD1;
import java.io.File;
public class diapositiva5b {
	public static void main(String[] args) {
	    boolean creado;

	    //Crea una carpeta que no existe 
	    File miCarpeta = new File("d:\\carpeta");
	    creado = miCarpeta.mkdir();
	    System.out.println("Se ha creado la carpeta " + creado);

	    //Crear una ruta. Si las carpetas no existen, las crea
	    File miRuta = new File("d:\\carpeta\\cHija1\\cHija2");
	    creado = miRuta.mkdirs();
	    System.out.println("Se ha creado la ruta " + creado);
	}


}
