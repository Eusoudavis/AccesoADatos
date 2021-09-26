import java.io.File;
import java.io.IOException;
import java.net.StandardSocketOptions;

/*
* Ejemplo que crea un objeto File con una ruta y un fichero inexistentes
*/
public class EjemploFile01 {

	public static void main(String[] args) throws IOException  {

		String separador = File.separator;
		System.out.println(separador);
		File ruta = new File("C:" +separador+"Users"+separador+"david+"+separador+"Desktop"+separador+"follas");
		File f = new File( ruta, "aaaa1.txt");
		f.createNewFile();
	
	}
}


