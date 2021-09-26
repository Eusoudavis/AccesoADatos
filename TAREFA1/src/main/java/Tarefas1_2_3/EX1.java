package Tarefas1_2_3;

import java.io.*;
import java.util.Scanner;

public class EX1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nome do arquivo: ");
        String ficheiro = sc.nextLine();

        String separador = File.separator;
        File f;
        FileReader fr;
        BufferedReader br = null;
        String ruta = "C:\\Users\\david\\Desktop\\ACCESO A DATOS";
        try {
            f = new File(ruta + separador + ficheiro);
            if (f.exists()){
                fr = new FileReader(f);
                br = new BufferedReader(fr);
                String Contido;
                while((Contido = br.readLine())!= null){
                    System.out.println(Contido);
                }
            }else {
                System.out.println("Buscaremos o arquivo prueba.txt");
                f = new File("prueba.txt");
                if (f.exists()){
                    fr = new FileReader(f);
                    br = new BufferedReader(fr);
                    String Contido2;
                    while ((Contido2 = br.readLine())!=null){
                        System.out.println(Contido2);
                    }
                }else{
                    System.out.println("Este ficheiro non existe");
                }
            }

        }catch (FileNotFoundException e) {
          System.out.println("Ficheiro non atopado");
        } catch (IOException e) {
            System.out.println("Erro de lectura");
        }finally {
            try {
                System.out.println("Fin de programa");
                br.close();
            } catch (IOException e) {
                System.out.println("Erro pechando o ficheiro");
            }
        }

    }
}
