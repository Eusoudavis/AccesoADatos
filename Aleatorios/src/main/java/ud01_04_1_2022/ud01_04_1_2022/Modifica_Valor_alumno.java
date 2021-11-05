package ud01_04_1_2022.ud01_04_1_2022;

import java.io.*;

public class Modifica_Valor_alumno {
	public static void main(String[] args) throws IOException {
		File fichero = new File("AleatorioSinple.dat"); // definimos o ficheiro.
		RandomAccessFile file = new RandomAccessFile(fichero, "rw"); // declaramos o ficheiro aleatorio e que se podo
																		// modificar

		StringBuffer buffer = null;// buffer para almacenar nome
		String nome = "alumno10";
		String apellido = "apelido10mofidicado";
		String curso = "DAM";
		int id = 7;

		long posicion = (id - 1) * 70; // posicion na que empeza o rexistro 7
		posicion = posicion + 4 + 20; // tamaño do id mais do nome, xa que me quero situar no apelido

		file.seek(posicion);// imos a situación que nos corresponde non ficheiro
		buffer = new StringBuffer(apellido);
		buffer.setLength(20); // 2O caracteres para o apelido
		file.writeChars(buffer.toString());// insertar apelido
		file.close(); // pechar ficheiro
	}
}