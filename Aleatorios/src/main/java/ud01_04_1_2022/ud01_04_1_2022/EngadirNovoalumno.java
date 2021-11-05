package ud01_04_1_2022.ud01_04_1_2022;
import java.io.*;
public class EngadirNovoalumno {
public static void main(String[]	args)	throws IOException {
File fichero= new File("AleatorioSinple.dat"); // definimos o ficheiro.
RandomAccessFile file = new RandomAccessFile (fichero,"rw"); // declaramos o ficheiro aleatorio

StringBuffer buffer = null;//buffer para almacenar nome
String nome = "alumno20";
String apellido ="apelido20";
String curso ="DAM";
int id=20;
        
long posicion =(id -1)*70;

file.seek(posicion);
file.writeInt (id) ; //uso i+1 para identificar ao alumno
buffer = new StringBuffer(nome);
buffer.setLength(10);	//lO caracteres para el nome
file.writeChars(buffer.toString());//insertar nome

buffer = new StringBuffer( apellido);
buffer.setLength(20);	//2O caracteres para o apelido
file.writeChars(buffer.toString());//insertar apelido

buffer = new StringBuffer( curso);
buffer.setLength(3);	//3 caracteres para o curso
file.writeChars(buffer.toString());//insertar curso
file.close();	//pechar ficheiro
}
}