import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class diapositiva2 {
	public static void main(String[] args) {

        try {
            leerFicheroBytes();

        } catch (FileNotFoundException ex) {
            System.out.println("No existe el fichero");

        }catch (IOException ex){
            System.out.println("Se ha producido la excepci�n " 	+ex.getMessage());
        }
	}
	
static void leerFicheroBytes() throws FileNotFoundException, IOException {
        InputStream miFIS = new FileInputStream("texto.txt"); 
        int valor = miFIS.read();
        while (valor != 1) {
            System.out.print((char) valor);
            valor = miFIS.read();
           // double a = .8_9;
        }
    }
}
