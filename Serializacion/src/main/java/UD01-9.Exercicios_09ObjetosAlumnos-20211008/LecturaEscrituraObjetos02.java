package UD01;

import EX_Serialización.Vehiculo;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LecturaEscrituraObjetos02 {
	// ejemplo que nos permite escribir y leer objetos Alumnos
	// el fichero no se sobreescribe a�ade objetos al final
	// Para solventar o problema da sobrescritura das cabeceiras, o que facemos
	// � crear o noso propio obexto ObjectOutpuStream, heredando do orixinal
	// e redefinindo o m�todo writeStreamHeader() para que NON FAGA NADA.


	public static void main(String[] args) throws NumberFormatException, IOException {
		File f = new File("vehiculos.txt");
		int opcion;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do{
			System.out.println("1.- Insertar Registros.");
			System.out.println("2.- Leer Registros.");
			System.out.println("3.- Salir.");
			System.out.println("Elegir opcion: ");
			opcion = Integer.parseInt(br.readLine());
			switch(opcion){
			case 1:
				if(f.exists()){
					System.out.println("vehiculos existe");
					escrituraObjetosExisteFichero(f);
				}else{
					System.out.println("vehiculos no existe");
					escrituraObjetosNuevoFichero(f);
				}
				break;
			case 2:
				lecturaObjetos(f);
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("Error en la opcion.");

			}// fin switch
		}while(opcion != 3);



	} // fin main

	static void escrituraObjetosNuevoFichero(File f){
		FileOutputStream fo = null;
		ObjectOutputStream oo = null;

		try{
			fo = new FileOutputStream(f);
			oo = new ObjectOutputStream(fo);

			//creo los objetos a escribir

			Vehiculo vehiculo1 = new Vehiculo("Renault","Megane","5555SSS", 60D);


			/*Alumnos alumno1 = new Alumnos("Luis", "Vigo", 25 );
			Alumnos alumno2 = new Alumnos("Carmen", "Madrid", 32 );
			Alumnos alumno3 = new Alumnos("Iciar", "Eibar", 22 );*/

			System.out.println("Escribiendo registros. Espere");
			// escribimos en el fichero
			oo.writeObject(vehiculo1);
			//oo.writeObject(vehiculo2);
			//oo.writeObject(alumno3);


		}catch(FileNotFoundException fn){
			System.out.println("Error. Fichero no existe");
		}catch(IOException io){
			System.out.println("Error de escritura");
		}finally{
			try{
				if(fo != null){
					fo.close();
					oo.close();
				}
			}catch(IOException io){
				System.out.println("Error al cerrar el fichero");
			}
		}
	}// fin metodo escrituraObjetosNuevo

	static void escrituraObjetosExisteFichero(File f){
		FileOutputStream fo = null;
		UD01.MiObjectOuputStream mo = null;

		try{
			fo = new FileOutputStream(f,true);
			mo = new UD01.MiObjectOuputStream(fo);

			//creo los objetos a escribir

			Vehiculo vehiculo2 = new Vehiculo("Nissan","Casicai","1111fff", 70D);

			/*Alumnos alumno1 = new Alumnos("Bea", "Vigo", 25 );
			Alumnos alumno2 = new Alumnos("Pedro", "Madrid", 32 );
			Alumnos alumno3 = new Alumnos("I�igo", "Eibar", 28 );*/

			System.out.println("A�adiendo registros. Espere");

			// escribimos en el fichero
			/*mo.writeObject(alumno1);
			mo.writeObject(alumno2);*/
			mo.writeObject(vehiculo2);


		}catch(FileNotFoundException fn){
			System.out.println("Error. Fichero no existe");
		}catch(IOException io){
			System.out.println("Error de escritura");
		}finally{
			try{
				if(fo != null){
					fo.close();
					mo.close();
				}
			}catch(IOException io){
				System.out.println("Error al cerrar el fichero");
			}
		}
	}// fin metodo escrituraObjetosExiste

	static void lecturaObjetos(File f){
		FileInputStream fi = null;
		ObjectInputStream oi = null;

		try{
			fi = new FileInputStream(f);
			oi = new ObjectInputStream(fi);

			while(true){
				//creo el objeto donde voy a guardar los datos leidos del disco
				//Alumnos alumno = (Alumnos) oi.readObject();
				Vehiculo vehiculo = (Vehiculo) oi.readObject();
				System.out.println(vehiculo);
			}

		}catch(ClassNotFoundException cn){
			System.out.println("Error en la clase alumnos");
		}catch(FileNotFoundException fn){
			System.out.println("Error. Fichero no existe");
		}catch(EOFException eof){
			System.out.println("Fin del la lectura");
		}catch(IOException io){
			System.out.println("Error de lectura");
		}finally{
			try{
				if(fi != null){
					fi.close();
					oi.close();
				}
			}catch(IOException io){
				System.out.println("Error al cerrar el fichero");
			}
		}
	}// fin metod0 lecturaObjetos

}
