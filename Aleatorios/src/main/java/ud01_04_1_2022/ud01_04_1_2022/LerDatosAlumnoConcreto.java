package ud01_04_1_2022.ud01_04_1_2022;
import java.io.*;
public class LerDatosAlumnoConcreto {
public static void main(String[] args)	throws IOException {
File fichero = new File("AleatorioSinple.dat");
//declara o ficheiro de acceso aleatorio
RandomAccessFile file = new RandomAccessFile (fichero,	"r");

int	id, posicion;
char nome[] = new char[10];
char apellido[] = new char[20], aux;
char curso[] = new char[3];

posicion=0;	//para situarnos ao principio
//supoñamos que queremos os datos do alumno de identificador 5
int identificador = 5;
posicion = (identificador - 1) * 70;  //calculo de onde empeza o rexistro do alumno

        file.seek(posicion);  //poñemonos nese rexistro
        id=file.readInt();
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
}
}
