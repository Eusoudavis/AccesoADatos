import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/*
 * Escribe cadenas de caracteres que se obtiene de un array de String, 
 * las cadenas se graban una a continuaci�n de la otra sin saltos de l�nea
 */
public class Ejemplo03FileWriter {
	public static void main(final String[] args) {
		
		// creamos un array de string 
		String provincias[] = {"La Coru�a", "Lugo", "Orense", "Pontevedra", "Guip�zcoa", 
				"Vizcaya", "Alava"};
		
		try{
			//File f= new File("D:\\Ciclos Formativos\\ProyectosAccesoDatos1718"
				//+ "\\FicherosTexto\\Provincias.txt");
			File f= new File("Provincias.txt");
			FileWriter fw = new FileWriter(f); // crea el fichero de salida
			for (int i=0; i< provincias.length; i++)
				fw.write(provincias[i]);
			fw.close();
		}catch(IOException ioe){
			System.out.println("Disco lleno o protegido");
		}finally{
			System.out.println("programa finalizado");
		}
	}
}
