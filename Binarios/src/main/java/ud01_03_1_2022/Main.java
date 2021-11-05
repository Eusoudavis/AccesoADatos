package ud01_03_1_2022;

import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
// Propiedades
		Vehiculo v = new Vehiculo();
		Scanner sc = new Scanner(System.in);
		String nuevoVehiculo = "Datos del vehículo:";
		String finVehiculo = "\n";
		System.out.println("Escribe marca del coche");
		v.setMarca(sc.nextLine());
		System.out.println("Escribe modelo del coche");
		v.setModelo(sc.nextLine());
		System.out.println("Escribe matricula del coche");
		v.setMatricula(sc.nextLine());
		System.out.println("Escribe capacidad del deposito");
		v.setDeposito(Double.parseDouble(sc.nextLine()));
		boolean finFichero = false;
		File ve = new File("vehiculos14.dat");
		try {
			if (ve.exists()) {
				// Escritura de datos
				/*
				 * EscribirSinCabecera ven sendo o meu ObjectOutputStream editado para que non
				 * escriba na cabeceira do ficheiro, e deste xeito evitarme problemas coa
				 * StreamCorruptedExecption e poder ler os datos correctamente los datos
				 */
				EscribirSinCabecera salida = new EscribirSinCabecera(new FileOutputStream("vehiculos14.dat", true));
				salida.writeObject(v);
				salida.close();
			} else {
				ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("vehiculos14.dat", true));
				salida.writeObject(v);
				salida.close();
			}
// Lectura de datos
			ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("vehiculos14.dat"));
// Mentras teña obxetos dentro do ficheiro lído
			do {
				try {
					Vehiculo vLeidos = (Vehiculo) entrada.readObject();
					System.out.println(nuevoVehiculo);
					System.out.println(vLeidos);
					System.out.println(finVehiculo);
				} catch (EOFException e) {
					finFichero = true; // Controlo a salida del bucle para dejar de leer
				}
			} while (!finFichero);
			entrada.close();
			sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}