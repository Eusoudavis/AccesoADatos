package EX_Serialización;

import java.io.*;
import java.util.Scanner;

public class LecturaEscritura {
    public static void main(String[] args) {

        FileOutputStream fs = null;
        Cabecera os = null;

        Vehiculo vehiculo = new Vehiculo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce marca ");

        vehiculo.setMarca(sc.nextLine());
        System.out.println("Introduce modelo ");

        vehiculo.setModelo(sc.nextLine());
        System.out.println("Introduce matricula ");

        vehiculo.setMatricula(sc.nextLine());
        System.out.println("Introduce depósito ");

        vehiculo.setDeposito(sc.nextDouble());
        File f = new File("vehiculos.txt");

        try{
            if (f.exists()){
                fs= new FileOutputStream(f, true);
                os= new Cabecera(fs);
                os.writeObject(vehiculo);
            }else {
                f.createNewFile();
                fs= new FileOutputStream(f);
                os= new Cabecera(fs);
                os.writeObject(vehiculo);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fi = new FileInputStream(f);
            ObjectInputStream oi = new ObjectInputStream(fi);
            System.out.println(vehiculo);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
