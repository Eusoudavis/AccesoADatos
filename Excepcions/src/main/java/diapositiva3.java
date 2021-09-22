import java.util.InputMismatchException;
import java.util.Scanner;

public class diapositiva3 {

	    static int minutos;
	    static boolean correcto = false;
	    static Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) {
	        do {
	            try {
	                leerMinuto();
	            } catch (InputMismatchException e) {
	                System.out.println("El tipo de datos introducidos no es correcto,"
	                        + " se debe introducir un entero");
	            } catch (Exception e) {
	                System.out.println("El valor introducido debe estar entre 1 y 60");
	            }finally{
	                sc.nextLine();
	            }
	        } while (!correcto);
	    }

	    public static void leerMinuto() throws InputMismatchException, Exception {
	        System.out.println("Introduce los minutos");
	        minutos = sc.nextInt();
	        if (minutos < 1 || minutos >= 60) {
	            throw new Exception();
	        }
	        correcto = true;
	    }
	}