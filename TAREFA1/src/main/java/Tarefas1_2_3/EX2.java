package Tarefas1_2_3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*Deseña unha aplicación que pida ao usuario o seu nome e idade. Estes datos
 deben gardarse no ficheiro datos.txt. Si ese ficheiro existe, deben engadirse ao final
 nunha nova liña, en caso de non existir, debe crearse o ficheiro.
*/
public class EX2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String base = "";
        String nome, apelido;
        System.out.println("Introuce o teu nome: ");
        nome = sc.nextLine();
        System.out.println("Escriba o seu apelido: ");
        apelido = sc.nextLine();

        try {
            File f = new File("datos.txt");
            if (f.exists()){
                FileWriter fw = new FileWriter(f);
               // BufferedWriter bw = new BufferedWriter(fw);
               // for (int i=0; i<base.length();i++) {
                    fw.write(nome + " " + apelido);
                  //  fw.write(apelido);

                //}
            }else {
                f.createNewFile();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }


    }

}
