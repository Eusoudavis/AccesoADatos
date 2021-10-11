package UD01;
/*
import EX_Serialización.Vehiculo;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// ejemplo que nos permite escribir y leer objetos Alumnos
// neste caso, como se usa directamente a clase ObjectOutputStream sen sobrescribila
// temos o problema de se o chamamos varias veces a execuci�n
//inserta a cabeceira dos campos unha vez por cada execuci�n
//provocando un erro de lectura posteriormente.


public class LecturaEscrituraObjetos01 {

	public static void main(String[] args) {
		escrituraObjetos();
		lecturaObjetos();

	}

	static void escrituraObjetos(){
		FileOutputStream fo = null;
		ObjectOutputStream oo = null;

		try{
			fo = new FileOutputStream("NUEVODIR\\Alumnos1.dat", true);
			oo = new ObjectOutputStream(fo);

			//creo los objetos a escribir
			Vehiculo vehiculo1 = new Vehiculo("5558hgf", "Peshó", "307", 60 );

			// escribimos en el fichero
			oo.writeObject(vehiculo1);

		}catch(FileNotFoundException fn){
			System.out.println("Error. Fichero no existe");
		}catch(IOException io){
			System.out.println("Error de escritura");
		}
	}// fin metodo escrituraObjetos

	static void lecturaObjetos(){
		FileInputStream fi = null;
		ObjectInputStream oi = null;

		try{
			fi = new FileInputStream("Vehiculos.txt");
			oi = new ObjectInputStream(fi);

			while(true){
				//creo el objeto donde voy a guardar los datos leidos del disco
				Vehiculo vehiculo = (Vehiculo) oi.readObject();
				System.out.println(vehiculo);
			}

		}catch(ClassNotFoundException cn){
			System.out.println("Error en la clase alumnos");
		}catch(FileNotFoundException fn){
			System.out.println("Error. Fichero no existe");
		}catch(EOFException eof){
			System.out.println("Fin de la lectura");
		}catch(IOException io){
			System.out.println("Error de lectura/escritura");
		}
	}// fin metodo lecturaObjetos

}*/
