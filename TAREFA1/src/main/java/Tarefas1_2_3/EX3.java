package Tarefas1_2_3;
/*Implementa un programa que lea un ficheiro de texto chamado carta.txt.
Temos que contar os carácteres,as liñas e as palabras dese ficheiro.
Para simplificar sopuñemos que cada palabra está separada de outra por
un único espazo en blanco ou por un cambio de líña.*/

import java.io.*;

public class EX3 {
    public static void main(String[] args) {
        System.out.println("Vamos a leer o ficheiro carta.txt. ");

        String separador = File.separator;
        File f;
        FileReader fr;
        BufferedReader br = null;
        String ruta = "C:\\Users\\david\\Desktop\\ACCESO A DATOS";

        try {
            f = new File(ruta + separador + "carta.txt");
            if (f.exists()){
                fr = new FileReader(f);
                br = new BufferedReader(fr);
                String Contido;
                while((Contido = br.readLine())!= null){
                    System.out.println(Contido);
                }

        }

    } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }}
