package Tarefas6_7.solucions_6_7.ud1_ampliacion_7;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ud1_ampliacion_7 {

    public static void main(String[] args) {

        try ( FileInputStream in = new FileInputStream("deportistas.txt");  
                BufferedWriter outEdad = new BufferedWriter(
                new FileWriter("edades.txt")); 
                BufferedWriter outPeso = new BufferedWriter(
                new FileWriter("pesos.txt"));  
                BufferedWriter outEstatura = new BufferedWriter(
                new FileWriter("estaturas.txt"))) {

            Scanner s = new Scanner(in).useLocale(Locale.US);
            s.nextLine();
            int edad;
            double peso, estatura;

            while (s.hasNext()) {
                String nombre = "";
                while (!s.hasNextInt()) {
                    nombre += s.next() + " ";
                }
                edad = s.nextInt();
                outEdad.write(nombre + "\t" + edad);
                outEdad.newLine();
                peso = s.nextDouble();
                outPeso.write(nombre + "\t" + peso);
                outPeso.newLine();
                estatura = s.nextDouble();
                outEstatura.write(nombre + "\t" + estatura);
                outEstatura.newLine();
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
