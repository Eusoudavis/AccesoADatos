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
        String nome = "";
        int idade = 0;
        System.out.println("Introuce o teu nome: ");
        nome = sc.nextLine();
        System.out.println("Escriba a súa idade: ");
        idade = sc.nextInt();

        try {
            File f = new File("datos.txt");
            if (f.exists()){
                FileWriter fw = new FileWriter(f, true);
                BufferedWriter bw = new BufferedWriter(fw);
                    bw.write("Nome " +nome + " idade " + idade + "\n");
                    bw.close();
            }else {
                f.createNewFile();
                FileWriter fw = new FileWriter(f);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("Nome " +nome + " idade " + idade + "\n");
                bw.close();
            }
        } catch (IOException e) {
            System.out.println("Erro de entrada ou saída de datos ");
        }finally {
            System.out.println("Fin de programa");
        }
    }
}
