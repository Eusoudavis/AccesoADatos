package exercicios_básicos_binarios_solucions;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.Scanner;

public class Resuelta1103 {

    public static void main(String[] args) {
        try ( ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("datos.dat"))) {
            System.out.println("N�mero de elementos: ");
            int n = new Scanner(System.in).nextInt();
            double tabla[] = new double[n]; 
            for (int i = 0; i < tabla.length; i++) {
                System.out.print("Introduzca un n�mero real: ");
                tabla[i] = new Scanner(System.in).
                        useLocale(Locale.US).nextDouble();
            }
            out.writeObject(tabla); 
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
