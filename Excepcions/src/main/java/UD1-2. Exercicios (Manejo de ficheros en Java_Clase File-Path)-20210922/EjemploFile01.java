package UD1;
import java.io.File;
import java.io.IOException;

/*
* Ejemplo que crea un objeto File con una ruta y un fichero inexistentes
*/
public class EjemploFile01 {

	public static void main(String[] args) throws IOException  {
		File ruta = new File("C:\\Users\\dgcives\\Desktop\\A DE ANTONIO");
		File f = new File( ruta, "aaaa1.txt");
		f.createNewFile();
	
	}
}


