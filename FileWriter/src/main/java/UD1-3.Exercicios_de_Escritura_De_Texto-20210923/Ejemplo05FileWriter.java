import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/*
 * El siguiente ejemplo escribe 10 filas de caracteres en un fichero de texto y despu�s de escribir
 * cada fila salta una l�nea con el m�todo newLine().
 */
public class Ejemplo05FileWriter {
	public static void main(final String[] args) {
		try{
			//FileWriter fw = new FileWriter("D:\\Ciclos Formativos\\ProyectosAccesoDatos1718"
			//		+ "\\FicherosTexto\\Filas.txt");
			FileWriter fw = new FileWriter("Filas.txt");
			
			BufferedWriter bw = new BufferedWriter(fw);
			//	BufferedWriter bw = new BufferedWriter(new 
			//			FileWriter("E:\\CSDAMultiplataforma\\FicherosTexto\\Filas.txt"));

			for(int i=0; i<11; i++){
				bw.write("Fila n�mero: " +i);
				bw.newLine();
			}
			bw.close();

		}catch(FileNotFoundException fne){
			System.out.println("No se encuentra el fichero");
		}catch(IOException ioe){
			System.out.println("Error de L/E");
		}
	}

}
