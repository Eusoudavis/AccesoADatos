import java.util.Scanner;


public class diapositiva1 {
	public static void main(String[] args) {
	       int num = 10, denom = 0, cociente;
	       Scanner sc = new Scanner(System.in);
	        try {
	           num = sc.nextInt();
	           cociente = num/denom;
	           System.out.println("Resultado:" + cociente);
	       } catch (Exception e) {
	           System.out.println("Se ha producido una excepci�n");
	       }finally{
	           sc.close();
	       }
	 }
}
