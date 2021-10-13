package Aleatorio;

import java.io.*;
import java.util.Scanner;

public class Alumno implements Serializable {

    private static final int TAMANHOREGISTRO=70; // tama�o del registro
    private static final int NOMELONGMAX=20;	// longitud m�xima del nombre
    private static final int APELIDOLONGMAX=40;
    private static final int CURSOLONGMAX=6;
    private static int cod = 0;
    private static void incrementarCod(){
        cod++;
    }


    public static void main(final String[] args) {

        File f = new File("alumnos.DAT");

        int opcion;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("1.- Introducir Alumnos");
            System.out.println("2.- Listado Alumnos");
            System.out.println("3.- Buscar un Alumno");
            System.out.println("4.- Modificar notas un Alumno");
            System.out.println("5.- Salir");

            System.out.println("Introduce una opcion: ");
            opcion = sc.nextInt();
            try{
                switch (opcion){
                    case 1:
                        if(f.exists()){
                            System.out.println("banco.txt existe");
                            insertarRegistroNovo(f);
                        }else{
                            System.out.println("banco.txt non existe");
                           f.createNewFile();
                            insertarRegistro(f);
                        }                        break;
                    case 2:
                        ler(f);
                        break;
                    case 3:
                        buscarAlumno(f);
                        break;
                    case 4:
                        modificar(f);
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        System.out.println("Opci�n erronea");
                }
            }catch (NumberFormatException | IOException e){
                System.out.println("La opcion tiene que ser un numero");
            }
        }while(opcion != 5);

    }


    public Alumno() {
    }
    private static int numRexistros(File f){
        RandomAccessFile puntero;
        try {
            puntero = new RandomAccessFile(f, "r");
            return (int)Math.ceil ((double)puntero.length()/ (double)TAMANHOREGISTRO);

        } catch (FileNotFoundException e) {
            System.out.println("Error el fichero no existe");
            return 0;
        } catch (IOException e) {
            System.out.println("ERROR GRAVE DE ENTRADA/SALIDA");
            return 0;        }
    }

    public static void modificar(File f) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        String aux="";
        String alum;
        String aux2="";
        boolean esta = false;
        RandomAccessFile puntero = null;
        if (numRexistros(f)>0) {

            System.out.println("Introduce o nome do alumno: ");
            alum = sc.nextLine();
            try {
                puntero = new RandomAccessFile(f, "r");
                for (int i = 0; i < numRexistros(f); i++) {
                    puntero.seek(i * TAMANHOREGISTRO);
                    if (alum.compareToIgnoreCase(String.valueOf(puntero.readInt())) == 0) {
                        puntero.seek(i * TAMANHOREGISTRO);
                        System.out.println("\n---------------------------------------------");
                        System.out.println("Código: " + puntero.readInt());
                        System.out.println("Nombre: " + puntero.readUTF());
                        System.out.println("Apelido: " + puntero.readUTF());
                        System.out.println("Curso: " + puntero.readUTF());
                        System.out.println("Introduce o nome do alumno: ");
                       // aux = sc.nextLine();
                        puntero.writeUTF(sc.nextLine());
                        esta = true;
                    }

                }
                if (esta == false) {
                    System.out.println("Alumno inexistente");
                }


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

            public static void insertarRegistro(File f) {
        Scanner sc = new Scanner(System.in);
        RandomAccessFile puntero = null;

        String nome, apelido, curso;
        try {
            puntero = new RandomAccessFile(f, "rw");

           // for (int i = 0; i < numRexistros(f); i++) {

               // puntero.seek(i*TAMANHOREGISTRO);
                System.out.println("Código " + cod);

                System.out.println("Introduce nome ");
                nome = sc.nextLine();
                if (nome.length() >= NOMELONGMAX) {
                    System.out.println("\nNome demasiado longo\n");
                }
                if (nome.length() < NOMELONGMAX) ;
                puntero.writeInt(cod);
                puntero.writeUTF(nome);
                System.out.println("Introduce Apelido ");
                apelido = sc.nextLine();
                if (apelido.length() >= APELIDOLONGMAX) {
                    System.out.println("\nApelido demasiado longo\n");
                }
                if (apelido.length() < APELIDOLONGMAX) ;
                puntero.writeUTF(apelido);
                System.out.println("Introduce curso ");
                curso = sc.nextLine();
                if (curso.length() >= CURSOLONGMAX) {
                    System.out.println("\nCurso demasiado longo\n");
                }
                if (curso.length() < CURSOLONGMAX) ;
                puntero.writeUTF(curso);
          //  }
        } catch(FileNotFoundException e){
                e.printStackTrace();
            } catch(IOException e){
                e.printStackTrace();
            }
        incrementarCod();
    }

    public static void insertarRegistroNovo(File f) {
        Scanner sc = new Scanner(System.in);
        RandomAccessFile puntero = null;

        int punta =0;
        String nome, apelido, curso;
        try {
            puntero = new RandomAccessFile(f, "rw");

            System.out.println("Posición a introducir os novos datos: ");
            punta = sc.nextInt();

             puntero.seek(punta*TAMANHOREGISTRO);
            String resposta = null;
            System.out.println("Código " + cod);

            System.out.println("Introduce nome ");
            nome = sc.nextLine();

            if (nome.length() < NOMELONGMAX) ;
            puntero.writeInt(cod);
            puntero.writeUTF(nome);

            if (nome.length() >= NOMELONGMAX) {
                System.out.println("\nNome demasiado longo\n");
            }

            System.out.println("Introduce Apelido ");
            apelido = sc.nextLine();
            if (apelido.length() >= APELIDOLONGMAX) {
                System.out.println("\nApelido demasiado longo\n");
            }

            if (apelido.length() < APELIDOLONGMAX) ;
            puntero.writeUTF(apelido);
            System.out.println("Introduce curso ");
            curso = sc.nextLine();

            if (curso.length() >= CURSOLONGMAX) {
                System.out.println("\nCurso demasiado longo\n");
            }

            if (curso.length() < CURSOLONGMAX) ;
            puntero.writeUTF(curso);
            //  }
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
        incrementarCod();
    }

    public static void ler(File f){
        RandomAccessFile puntero;

        if (numRexistros(f) !=0){
            System.out.println("\n\t LISTADO COMPLETO\n---------------------------------------------");
            System.out.println("Código\tNombre\tApelido\tCurso");
            System.out.println("\n---------------------------------------------");
            try {
                puntero = new RandomAccessFile(f, "r");
                for (int i=0; i<numRexistros(f);i++){
                    puntero.seek(i*TAMANHOREGISTRO);
                    System.out.println(puntero.readInt() +"\t"+ puntero.readUTF() +"\t"+ puntero.readUTF() +"\t"+ puntero.readUTF());
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                System.out.println("\nError "+e.toString());
            }
        }			System.out.println("\nNon hai rexistros introducidos");


    }

    public static void buscarAlumno(File f){
        Scanner sc = new Scanner(System.in);
        RandomAccessFile puntero;
        String alum = "";
        boolean esta = false;
        if (numRexistros(f)>0){

            System.out.println("Introduce o nome do alumno: ");
            alum = sc.nextLine();
            try {
                puntero = new RandomAccessFile(f, "r");
                for (int i=0; i<numRexistros(f); i++){
                    puntero.seek(i*TAMANHOREGISTRO);
                    if (alum.compareToIgnoreCase(String.valueOf(puntero.readInt()))==0){
                        puntero.seek(i*TAMANHOREGISTRO);
                        System.out.println("\n---------------------------------------------");
                        System.out.println("Código: "+ puntero.readInt());
                        System.out.println("Nombre: "+ puntero.readUTF());
                        System.out.println("Apelido: "+ puntero.readUTF());
                        System.out.println("Curso: "+ puntero.readUTF());
                        esta = true;
                    }

                }if (esta==false){
                    System.out.println("Alumno inexistente");
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }	else
            System.out.println("Ficheiro sen datos");
        }}



