public class Ejemplo02Excepciones {

	public static void main(String[] args) {
		/* 
		 * El ejemplo captura 3 excepciones que se pueden producir. Cuando se encuentra 
		 * el primer error se produce un salto al bloque catch que maneja dicho error; 
		 * en este caso al encontrar la sentencia de asignaci�n arraynum[10] = 20; 
		 * se lanza la excepci�n ArrayIndexOutOfBoundsException (ya que el array 
		 * est� definido para 4 elementos y se da valor al elemento de la posici�n 10) 
		 * 
		 */ 

		String cad1 = "20", cad2 = "2", mensaje; 
		int numerador, denominador, cociente; 
		int[] arraynum = new int[4]; //definimos o arrai para 4 elementos

		try{ 
			//codigo que puede producir errores 
			arraynum[20] = 20; //sentencia que produce la excepcion 
			numerador = Integer.parseInt(cad1); //no se ejecuta 
			denominador = Integer.parseInt(cad2);//no se ejecuta 
			cociente = numerador/denominador; //no se ejecuta 

			mensaje = String.valueOf(cociente); //no se ejecuta 
		
		
		}
		catch(NumberFormatException nfe){ 
			mensaje = "Caracteres no num�ricos"; 
		}catch (ArithmeticException ae) { 
			mensaje = "Divisi�n por cero"; 
		}catch (ArrayIndexOutOfBoundsException aio) { 
			mensaje = "Array fuera de rango"; 
		}
		finally{ 
			System.out.println("finally Se ejecuta siempre"); 
		} 
		System.out.println(mensaje); //si se ejecuta 
	}// fin main 
}// fin clase 

