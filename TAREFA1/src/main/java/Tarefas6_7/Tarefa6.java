package Tarefas6_7;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*Crea cun editor de texto un ficheiro ao que chames deportistas.txt, onde se recollen os datos dun grupo
de deportistas, un deportista por cada liña.
Aparece o nome completo, seguido da idade, o peso e a estatura.
A primeira liña do ficheiro será o encabezamento cos nomes dos campos, o documento terá a forma:
Implementa un programa donde se cree un fluxo de texto de entrada, a partir do cal, empregando
scanner, lemos os datos do deportista, amosamolos por pantalla.
Ao final aparecerán os valores medios da idade, o peso e a estatura. Pedimos algo do estilo:*/
public class Tarefa6 {
   /* public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "deportistas.txt";
        File f = null;
        FileReader fr = null;
        Scanner sc = null;
        f = new File(path);
        try {
            fr = new FileReader(f);
            sc = new Scanner(fr);
            ArrayList<Deportista> deportistas = new ArrayList<>();
            boolean primeiraLinea = true;
            while (sc.hasNext()){
                String[] linnha = sc.nextLine().split(";");
                if(primeiraLinea) {
                    primeiraLinea = false;
                    continue;
                }
                Deportista deportista = new Deportista(linnha[0],Integer.parseInt(linnha[1].trim()),Double.parseDouble(linnha[2].trim()),Double.parseDouble(linnha[3].trim()) );
                Deportista.mediaIdade(deportista.getIdade());
                Deportista.mediaPeso(deportista.getPeso());
                Deportista.mediaEstatura(deportista.getEstatura());
                deportistas.add(deportista);
            }
            for(Deportista deportista: deportistas){
                System.out.println(deportista.toString());
            }
            System.out.println("Media idade: " + Deportista.getMediaIdade());
            System.out.println("Media peso: " + Deportista.getMediaPeso());
            System.out.println("Media estatura: " + Deportista.getMediaEstatura());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }*/
        }
 /*fs = new FileInputStream("deportistas.txt");
         os = new ObjectInputStream(fs);
         while (true){
         Persoa p = (Persoa)os.readObject();
         System.out.println(p.getNome() + "\t"       + p.getIdade() + "\t"+ p.getPeso() + "\t" + p.getEstatura() );
         }*/