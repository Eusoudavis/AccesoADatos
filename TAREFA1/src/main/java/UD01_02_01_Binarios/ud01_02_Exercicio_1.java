 package UD01_02_01_Binarios;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//exercicio 1, escribir un arquivo de datos, en binario, cos 10 numeros
//tratar os numeros como arrai e escribir usando Object.

public class ud01_02_Exercicio_1 {

    public static void main(String[] args) {
        int[] t = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        ObjectOutputStream flujoSalida = null;
        try {
            flujoSalida = new ObjectOutputStream(new FileOutputStream("datosmartes.dat"));
            flujoSalida.writeObject(t);
        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
            if (flujoSalida != null) {
                try {
                    flujoSalida.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}
