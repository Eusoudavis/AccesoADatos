package UD01;

/* 
 * Ejemplo que escribe y lee datos binarios en un fichero
 * 1� Nos pide el nombre del fichero donde va a escribir o leer
 * 2� Nos pide si queremos abrir el fichero en el modo sobreescribir o insertar
 * 3� Introducimos los datos en el fichero (codigo y nombre de usuario)
 */

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploFileInputOutputStream02 {
	public static void main(final String[] args) {
		
		// menu principal donde elegimos la opcion a ejecutar (Leer o Escribir)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int opcion = 0;
		do{
			try{
				System.out.println("1.- Escribir en el fichero");
				System.out.println("2.- Leer del fichero");
				System.out.println("3.- Salir");
				System.out.println("Elegir opcion: ");
				opcion = Integer.parseInt(br.readLine());
				switch (opcion){
				case 1:
					escrituraDisco();
					break;
				case 2:
					lecturaDisco();
					break;
				}
			}catch(NumberFormatException e){
				System.out.println("Error al introducir la opcion");
			}catch(IOException ioe){
				System.out.println("Error al introducir la opcion");
			}
		}while(opcion != 3);
	}// fin del main
	
	// metodo para escribir en el disco los datos a introducir
	static void escrituraDisco(){ 
		File archivo = null;
		DataOutputStream flujoescritura = null;

		String respuesta="";

		try{
			//introducimos el nombre del fichero
			String nombrefich= introducirDatos("Introduce el nombre del fichero de claves desde el teclado");
			//creamos el objeto File
			archivo= new File (nombrefich) ; 
			// Comprobamos si el fichero existe en cuyo caso preguntamos
			// si se quiere sobreescribir o no
			if (archivo.exists()){
				respuesta= introducirDatos("El fichero ya existe �Desea sobreescribirlo (SI/NO)?");
			}
			// seg�n sea la respuesta abrimos el fichero en modo sobreescritura o en  el modo a�adir

			//compareToIgnoreCase es que compare sin distinguir may�sculas y min�sculas
			if (respuesta.compareToIgnoreCase("si")==0){
				flujoescritura = new DataOutputStream ( new FileOutputStream(nombrefich));
			}else{
				flujoescritura= new DataOutputStream (new FileOutputStream(nombrefich,true));
			}

			// introducimos los datos que queremos escribir en el fichero
			String nombre= introducirDatos("Introduce el nombre del usuario por teclado. "
					+ "# Para finalizar: ");
			while(!nombre.equals("#")){
				// el codigo lo convertimos a entero
				int codigo = Integer.parseInt(introducirDatos("Introduce el c�digo "
						+ "del usuario por teclado: "));

				//escribimos los datos en el fichero
				flujoescritura.writeInt(codigo);
				flujoescritura.writeUTF(nombre);
				nombre= introducirDatos("Introduce el nombre del usuario por teclado. # Para finalizar: ");
			}
		}catch (IOException ioe){
			System.out.println("No se ha podido escribir la informaci�n en el fichero " +archivo.getName());
		}finally{
			try{
				if (flujoescritura != null){
					flujoescritura.close();
				}
			}catch (IOException ioe){
				System.out.println("No se ha podido cerrar correctamente el flujo del fichero " + archivo.getName());
			}
		}
	}// fin del m�todo escrituraDisco
	
	static void lecturaDisco(){
		File archivo = null;
		DataInputStream flujolectura =null;
		String nombreFichero = null;
		System.out.println() ;
		try{
			//tecleamos el nombre del fichero
			nombreFichero = introducirDatos("Introduce el nombre del fichero por teclado");
			// abrimos el fichero para lectura
			archivo= new File (nombreFichero);
			flujolectura= new DataInputStream (new FileInputStream(archivo));
			//leemos los datos mientras existan
			//Ojo el orden al leer tiene que ser el mismo que al escribir
			while (true){
				System.out.println ("Codigo de Usuario: "+ flujolectura.readInt());
				System.out.println ("Nombre de Usuario: "+ flujolectura.readUTF());
			}
		}catch (FileNotFoundException fnf){
			System.out.println("No se ha podido encontrar el fichero " +archivo.getName());
		}catch (EOFException eof){
		}catch (IOException ioe){
			System.out.println("No se ha podido leer la informaci�n del fichero " +archivo.getName());
		}finally{
			try{
				if (flujolectura!=null){
					flujolectura.close();
				}
			}catch (IOException ioe){
				System.out.println("No se ha podido cerrar el flujo del fichero " + archivo.getName());
			}
		} //fin finally
	}//fin lecturaDisco
	
	// metodo para introducir datos desde el teclado
	static String introducirDatos(String mensaje){ 
		
		try {
			System.out.println("--------------------------------------------------------");
			System.out.print(mensaje);
			return (new BufferedReader(new InputStreamReader(System.in))).readLine(); //Está esperando a leer o que poñamos coma unha liña de comandos
			//e leeo todo como unha liña aínda que haxa espazos
		} catch (IOException ioe) {
			System.out.println("\nError interno en sistema de entrada/salida\n");
		}
		return "";
	} // fin del m�todo introducirDatos
}// fin clase


