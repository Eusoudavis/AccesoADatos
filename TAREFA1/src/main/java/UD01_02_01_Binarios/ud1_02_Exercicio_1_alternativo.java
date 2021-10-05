 package UD01_02_01_Binarios;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/* Creamos o arquivo cos 10 numeros
 * binarios, pero escribindo un a un
 * o número no ficheiro.
 */
public class ud1_02_Exercicio_1_alternativo {

    public static void main(String[] args) {
        int[] t = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        ObjectOutputStream flujoSalida = null;
        try {
            flujoSalida = new ObjectOutputStream( new FileOutputStream("datos_martes_alternativo.dat"));
            for (int n:t) {
            	flujoSalida.writeInt(n);
            }
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
