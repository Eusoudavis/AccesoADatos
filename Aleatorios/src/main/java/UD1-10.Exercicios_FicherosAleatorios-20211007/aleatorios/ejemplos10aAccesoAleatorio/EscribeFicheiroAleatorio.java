package UD1;

//EscribeFicheiroAleatorio.java
/* HAI QUE TER EN CONTA OS TAMA�OS DE CADA CAMPO
 * boolean   1byte
 * char	     2bytes
 * byte      1byte
 * short     2 bytes
 * int       4 bytes
 * long      8 bytes
 * flota     4 bytes
 * double    8 bytes
 * @author antonio
 *
 */
import java.io.*;

public class EscribeFicheiroAleatorio {

	public static void main(String[] args) throws IOException {

		File ficheiroDatos = new File("empregados");
		RandomAccessFile accesoAleatorio = new RandomAccessFile(ficheiroDatos, "rw");

		// Definimos arrays cos datos.
		String apelido[] = { "CALVO", "HERMO", "LOJO", "PI�EIRO", "POUSO" };
		int dep[] = { 10, 20, 10, 30, 20 };
		Double salario[] = { 995.90, 1200.45, 1200.45, 885.75, 3500.0 };

		StringBuffer buffer = null; // B�fer para guardar os apelidos
		int n = apelido.length; // N� de elementos do array

		for (int i = 0; i < n; i++) {
			accesoAleatorio.writeInt(i + 1); // inserta id de traballador/a
			buffer = new StringBuffer(apelido[i]);
			buffer.setLength(10);//cada apelido ocupa 10 bytes
			accesoAleatorio.writeChars(buffer.toString()); // inserta o apelido
			accesoAleatorio.writeInt(dep[i]); // inserta departamento
			accesoAleatorio.writeDouble(salario[i]); // inserta salario
		}

		accesoAleatorio.close();
	}
}
