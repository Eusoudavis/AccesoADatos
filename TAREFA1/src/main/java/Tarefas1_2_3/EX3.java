package Tarefas1_2_3;
/*Implementa un programa que lea un ficheiro de texto chamado carta.txt.
Temos que contar os carácteres,as liñas e as palabras dese ficheiro.
Para simplificar sopuñemos que cada palabra está separada de outra por
un único espazo en blanco ou por un cambio de líña.*/

import java.io.*;
import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Vamos a leer o ficheiro carta.txt. ");

        String espazo ="";
        int palabras = 0;
        int caracteres = 0;
        int liñas = 0;
        String separador = File.separator;
        File f;
        BufferedReader br = null;
        String ruta = "C:" + separador + "Users" + separador + "david" + separador + "Desktop" + separador + "ACCESO A DATOS";

        f = new File(ruta + separador + "carta.txt");
        Scanner sc = new Scanner(f);

            try {
               if (f.exists()){
                   while (sc.hasNext()) {
                       caracteres = caracteres + sc.next().length();
                       palabras++;

                FileReader fr = new FileReader(f);
                br = new BufferedReader(fr);
                    while ((espazo = br.readLine()) != null) {
                        liñas++;
                    }
                    br.close();
                System.out.println("Numero de lineas: " + liñas);
                System.out.println("Numero de palabras: " + palabras);
                System.out.println("Numero de caracteres: " + caracteres);}}
            } catch (FileNotFoundException e) {
                System.out.println("Arquivo non atopado");
            } catch (IOException e) {
                System.out.println("Erro de lectura");
            }finally {
                System.out.println("Fin de programa");
            }
        }
    }
