package ud01_04_1_2022.ud01_04_1_2022;
import java.io.*;
public class EscribirFichAleatorio {
public static void main(String[]	args)	throws IOException {
File fichero= new File("AleatorioSinple.dat"); // definimos o ficheiro.
RandomAccessFile file = new RandomAccessFile (fichero,"rw"); // declaramos o ficheiro aleatorio
// pasamos os arrais de datos
String nome[]	= {"Antonio","Xaime","Xavier","Lucia", "Alba","Xoel","pepe"};//nomes
String apelido[] = {"apelido1","apelido22222","apelido333333","apelido444444", "apelido55555","apelido6","apelido7"};//apelidos
String curso[] = {"DAM","DAM","ASI","DAM","ASI","DAM","ASI"};	//curso


StringBuffer buffer = null;//buffer para almacenar nome

int n=nome.length;//numero de elementos do arrai
 
for (int i=0;i<n; i++){ //percorro os arrais
file.writeInt (i+1) ; //uso i+1 para identificar ao alumno
buffer = new StringBuffer( nome[i]	);
buffer.setLength(10);	//lO caracteres para el nome
file.writeChars(buffer.toString());//insertar nome

buffer = new StringBuffer( apelido[i]	);
buffer.setLength(20);	//2O caracteres para o apelido
file.writeChars(buffer.toString());//insertar apelido

buffer = new StringBuffer( curso[i]	);
buffer.setLength(3);	//3 caracteres para o curso
file.writeChars(buffer.toString());//insertar curso
}
file.close();	//pechar ficheiro
}
}