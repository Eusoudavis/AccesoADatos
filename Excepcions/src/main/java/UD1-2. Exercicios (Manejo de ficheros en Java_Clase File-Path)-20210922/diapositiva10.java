package UD1;
import java.io.File;
import java.io.IOException;
public class diapositiva10 {
	public static void main(String[] args) {
	File ruta = new File("D:\\IES\\Teis\\otro1");
	File f = new File(ruta, "datos.txt");
	System.out.println("1----------------");
	System.out.println(f.getAbsolutePath());
	System.out.println(f.getParent());
	System.out.println(ruta.getAbsolutePath());
	System.out.println(ruta.getParent());
	System.out.println("2----------------");
	
	if (!f.exists()) {  //se comprueba si el fichero existe o no
	    System.out.println("Fichero " + f.getName() + " no existe");
	    if (!ruta.exists()) {  //se comprueba si la ruta existe o no
	        System.out.println("El directorio " + ruta.getName() + " no existe");
	        if (ruta.mkdir()) { //se crea la ruta. Si se ha creado correctamente
	            System.out.println("Directorio creado");
	            try {
	                if (f.createNewFile()) {  //se crea el fichero. Si se ha creado correctamente
	                    System.out.println("Fichero " + f.getName() + " creado");
	                } else {
	                    System.out.println("No se ha podido crear " + f.getName());
	                }
	            } catch (IOException ex) {
	                System.out.println(ex.toString());
	            }
	        } else {
	            System.out.println("No se ha podido crear " + ruta.getName());
	        }
	    } else {  
		    try {
	            //si la ruta existe creamos el fichero
	            if (f.createNewFile()) {
	                System.out.println("Fichero " + f.getName() + " creado");
	            } else {
	                System.out.println("No se ha podido crear " + f.getName());
	            }
	        } catch (IOException ex) {
	           System.out.println(ex.toString());
	        }
	    }
	} else { //el fichero existe. Mostramos el tama�o
	    System.out.println("Fichero " + f.getName() + " existe");
	    System.out.println("Tama�o " + f.length() + " bytes");
	}

}
}
