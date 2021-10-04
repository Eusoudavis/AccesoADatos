
package Tarefas6_7.solucions_6_7.ud1_ampliacion_6;


import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class ud1_ampliacion_6 {

   public static void main(String[] args) {
        FileInputStream in = null;
        try {
            in = new FileInputStream("deportistas.txt");
            Scanner s = new Scanner(in).useLocale(Locale.US);
            s.nextLine();
            int edad;
            double peso, estatura;
            int contador = 0;
            double sumaEdades = 0.0;
            double sumaEstaturas = 0.0;
            double sumaPesos = 0.0;
            while (s.hasNext()) {
                String nombre = "";
                while (!s.hasNextInt()) {
                    nombre += s.next() + " ";
                }
                contador++;
                edad = s.nextInt();
                sumaEdades += edad;
                peso = s.nextDouble();
                sumaPesos += peso;
                estatura = s.nextDouble();
                sumaEstaturas += estatura;
                System.out.println("nombre: " + nombre + "\tedad: " + edad
                        + "\tpeso: " + peso + "\testatura: " + estatura);
            }
            System.out.println("media edades: " + sumaEdades / contador);
            System.out.println("media pesos: " + sumaPesos / contador);
            System.out.println("media estaturas: " + sumaEstaturas / contador);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }

    }
}
