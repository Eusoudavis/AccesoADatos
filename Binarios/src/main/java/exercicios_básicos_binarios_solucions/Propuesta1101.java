package exercicios_básicos_binarios_solucions;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Propuesta1101 {

    public static void main(String[] args) {
        int[] t = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        ObjectOutputStream flujoSalida = null;
        try {
            flujoSalida = new ObjectOutputStream(
                    new FileOutputStream("datos.dat"));
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
