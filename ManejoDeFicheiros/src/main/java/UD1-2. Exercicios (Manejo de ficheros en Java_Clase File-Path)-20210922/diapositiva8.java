import java.io.File;
import java.io.IOException;
public class diapositiva8 {
	public static void main(String[] args) {
	    boolean creado = false;
	    //Creo un objeto File para la carpeta que ya existe
	    File miCarpeta = new File("d:\\unaCarpeta");
	    //Creo un objeto File para el fichero nuevo en la carpeta existente
	    File miFichero = new File(miCarpeta, "mifichero1.txt");
	    try {
	        //Creo el fichero en el disco
	        creado = miFichero.createNewFile();
	    } catch (IOException ex) {
	        System.out.println(ex.toString());
	    }
	    //Muestro resultados relacionados con el objeto File
	    System.out.println(creado);
	    System.out.println(miFichero.getAbsolutePath());
	    System.out.println(miFichero.getName());
	    System.out.println(miFichero.isDirectory());
	    System.out.println(miCarpeta.isDirectory());
	}

}
