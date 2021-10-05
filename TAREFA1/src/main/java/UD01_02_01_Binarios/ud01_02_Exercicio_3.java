package UD01_02_01_Binarios;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ud01_02_Exercicio_3 {

    public static void main(String[] args) {
        try ( ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream("datosmartes.dat"))) {
            int[] taboa = (int[]) flujoEntrada.readObject();
            System.out.println(Arrays.toString(taboa));
            
        } catch (IOException ex) {
            System.out.println("error lectura");
        } catch (ClassNotFoundException e){
        	System.out.println("O ficheiro non almacena obxectos táboa, non serve");
        }
    }

}
