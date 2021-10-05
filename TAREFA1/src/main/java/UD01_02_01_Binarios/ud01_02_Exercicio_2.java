package UD01_02_01_Binarios;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.Scanner;

// preguntar cantos numeros se queren gardar
// e continuación, crear un arrai con eses numeros
// e gravamos os datos como se fora obxectos
// coa propiedade writeObject
public class ud01_02_Exercicio_2 {

	public static void main(String[] args) {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("datosproba.dat"))) {
			System.out.println("Número de elementos: ");
			int n = new Scanner(System.in).nextInt();
			double tabla[] = new double[n];
			for (int i = 0; i < tabla.length; i++) {
				System.out.print("Introduzca un número real: ");
				tabla[i] = new Scanner(System.in).useLocale(Locale.US).nextDouble();
			}
			out.writeObject(tabla);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
