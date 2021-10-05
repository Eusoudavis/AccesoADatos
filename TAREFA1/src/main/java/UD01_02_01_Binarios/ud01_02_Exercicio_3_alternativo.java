package UD01_02_01_Binarios;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
/* lectura dun arquivo binario de 10 numeros
 * que foron gravados un a un, sen uso de object
 * por tanto, debemos ler no mesmo orde.
 * 
 */
public class ud01_02_Exercicio_3_alternativo {

    public static void main(String[] args) {
        try ( ObjectInputStream flujoEntrada = new ObjectInputStream(
                new FileInputStream("datos_martes_alternativo.dat"))) {
            int[] t = new int[10];
            for (int i = 0; i < t.length; i++) {
                t[i] = flujoEntrada.readInt();
            }
            System.out.println(Arrays.toString(t));
        } catch (IOException ex) {
            System.out.println("error lectura");
        }
    }

}
