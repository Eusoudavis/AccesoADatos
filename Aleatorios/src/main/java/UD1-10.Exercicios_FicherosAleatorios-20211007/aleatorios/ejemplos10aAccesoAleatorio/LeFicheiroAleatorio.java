package UD1;

//LeFicheiroAleatorio.java

import java.io.*;

public class LeFicheiroAleatorio {

    public static void main(String[] args) throws IOException {

        File ficheiroDatos = new File("empregados");
        try (RandomAccessFile accesoAleatorio = new RandomAccessFile(ficheiroDatos, "r")) {
            int id, dep, posicion = 0;
            char[] apelido = new char[10];
            char aux;
            Double salario;
            //Bucle para ler un a un, os datos de cada empregado.
            for (; ; ) {
                //Posicion�monos ao principio de cada 'rexistro' do ficheiro.
                accesoAleatorio.seek(posicion);
                //Obtemos id de empregado
                id = accesoAleatorio.readInt();

                //Obtemos apelido, car�cter a car�cter
                for (int i = 0; i < apelido.length; i++) {
                    aux = accesoAleatorio.readChar();
                    apelido[i] = aux;
                }
                String apelidos = new String(apelido);

                //Obtemos departamento
                dep = accesoAleatorio.readInt();

                //Obtemos salario
                salario = accesoAleatorio.readDouble();

                //Mostramos 'rexistro' por pantalla
                System.out.println("Id: " + id + " Apelido: " + apelidos + " Departamento: " +
                        dep + " Salario: " + salario);

                //Cada 'rexistro' ocupa 36 bytes
                posicion = posicion + 36;

                //Controlamos fin do ficheiro
                if (accesoAleatorio.getFilePointer() == accesoAleatorio.length()) break;

            }//Fin do bucle for
        }
    }
}
