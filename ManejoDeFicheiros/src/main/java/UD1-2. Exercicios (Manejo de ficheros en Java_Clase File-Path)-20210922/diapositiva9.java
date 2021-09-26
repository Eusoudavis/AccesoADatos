import java.io.File;
public class diapositiva9 {
	public static void main(String[] args) {

	    //Crea un objeto File de la carpeta existente
	    File miCarpeta = new File("d:\\unaCarpeta");

	    /*Almacena en un array de File las carpetas y ficheros 
	    que contiene miCarpeta*/
	    File[] misFiles = miCarpeta.listFiles();

	    //Recorrer el array para mostrar los nombres de los objetos
	    for (File misFile : misFiles) {
	        System.out.println(misFile.getName());
	    }

	}

}
