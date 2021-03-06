package EX_Binario;

import java.io.*;
import java.util.*;

public class Main {

    private static ArrayList<Cliente> listaClientes;
    private String nomeFicheiro = "banco.dat";
    private static List<Cliente> Lista = new ArrayList<Cliente>();

    public static void main(String[] args) throws IOException {
        File f = new File("banco.dat");

        ler(f);

        int opcion;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.- Alta Cliente");
            System.out.println("2.- Baja Cliente.");
            System.out.println("3.- Listar Cliente.");
            System.out.println("Salir.");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    if(f.exists()){
                        System.out.println("banco.txt existe");
                        altaExiste(f);
                    }else{
                        System.out.println("banco.txt non existe");
                        altaNonExiste(f);
                    }
                    break;
                case 2:
                    buscaElimina(f);
                    break;
                case 3:
                    ler(f);
                    break;
            }
        }while (opcion!=4);
    }

    public static void altaExiste(File f){
        ObjectOutputStream objectOutputStream = null;
        Lista.add(new Cliente("78800199Z","David",7,8,1994,100));
        Lista.add(new Cliente("78800199J","Javier",18,2,1988,100));

            try{
                FileOutputStream fs = new FileOutputStream(f, true);
                MiObjectOuputStream cabeceira = new MiObjectOuputStream(fs);
                cabeceira.writeObject(Lista);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    public static void altaNonExiste(File f) throws IOException {
        f.createNewFile();
       Lista.add(new Cliente("80008687l","Tono",28,12,1994,100));
       Lista.add(new Cliente("12345678J","Silvia",22,11,1996,100));

       try{
            FileOutputStream fs = new FileOutputStream(f, true);
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(Lista);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ler(File f) throws FileNotFoundException {
        FileInputStream fi = null;
        ObjectInputStream oi = null;
       try{
            fi = new FileInputStream(f);
            oi = new ObjectInputStream(fi);
           Cliente cliente1 = null;

                Lista = (List<Cliente>) oi.readObject();

           for (Cliente cli: Lista
                ) {
               System.out.println(cli.toString() + "\n");
           }
    }catch (FileNotFoundException e){
           System.out.println("Non se atopou o ficheiro.");
       }
       catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void buscaElimina(File f) throws FileNotFoundException {

        System.out.println("Introducir un dos seguintes DNI: ");

        ler(f);

        Scanner sc = new Scanner(System.in);
        String dniBusqueda = sc.nextLine();


        for (int i = 0; i < Lista.size(); i++){
            if (Lista.get(i).getDNI().equals(dniBusqueda)){
                Lista.remove(i);
                System.out.println("Borrado");

                List<Cliente> copia = new ArrayList<Cliente>();
                f.delete();
                for (Cliente cli: copia
                ) {
                    try{
                        FileOutputStream fs = new FileOutputStream(f, true);
                        ObjectOutputStream os = new ObjectOutputStream(fs);
                        os.writeObject(cli);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                }
            }
        try{
            FileOutputStream fs = new FileOutputStream(f);
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(Lista);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        }
    }





