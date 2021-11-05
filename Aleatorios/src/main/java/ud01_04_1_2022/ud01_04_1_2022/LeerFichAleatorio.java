package ud01_04_1_2022.ud01_04_1_2022;
import java.io.*;
public class LeerFichAleatorio {
public static void main(String[] args)	throws IOException {
File fichero = new File("AleatorioSinple.dat");
//declara o ficheiro de acceso aleatorio
RandomAccessFile file = new RandomAccessFile (fichero,	"r");

int	id, posicion;
char nome[] = new char[10];
char apellido[] = new char[20], aux;
char curso[] = new char[3];

posicion=0;	//para situarnos ao principio

for(;;){	//percorro o ficheiro
file.seek(posicion); //imos ao principio

id=file.readInt () ;	// obteño o id do alumno
for	(int i = 0; i < nome.length; i++)	{
aux = file.readChar();//recorro un a un os carácteres do nome
nome[i] = aux;	//engadoos ao arrai
}
String nomeS= new String(nome);//convierto a String el arrai

for	(int i = 0; i < apellido.length; i++)	{
aux = file.readChar();//recorro un a un os carácteres do nome
apellido[i] = aux;	//engadoos ao arrai
}
String apelidoS= new String(apellido);//convierto a String el arrai

for	(int i = 0; i < curso.length; i++)	{
aux = file.readChar();//recorro un a un os carácteres do nome
curso[i] = aux;	//engadoos ao arrai
}
String cursoS= new String(curso);//convierto a String el array

System.out.println("ID:	" + id + "  Nome:  " +nomeS+ "  Apellido: " + apelidoS + "  curso: "  + cursoS );
posicion= posicion + 70; //posicionome no seguinte alumno
//Cada alumno ocupa 70  bytes	
//Si xa os percorremos todos, saio do for.
if (file.getFilePointer()==file.length()) break;

}//fin bucle for
file.close() ;	//pechar ficheiro
}
}