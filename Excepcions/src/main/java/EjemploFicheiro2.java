import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploFicheiro2 {
    /*
     * escribe caracteres en un fichero de nombre FichTexto01.txt (si no existe lo crea).
     * se escribe el array completo en una operación de escritura
     */
    public static void main(final String[] args) throws IOException {
        File f= new File("FichTexto02.txt");
        FileWriter fw = new FileWriter(f); // crea el fichero de salida
        String cadena = "Esto es una prueba de FileWriter método write escribiendo todo"
                + "el array en una unica operacion";
        char[] cad = cadena.toCharArray(); // convierte un String en un array de caracteres
        fw.write(cad); // se escribe el array
        fw.append('*'); // añade un * al final
        fw.close(); // cierra el fichero
        System.out.println("Programa Finalizado");
    }
}

