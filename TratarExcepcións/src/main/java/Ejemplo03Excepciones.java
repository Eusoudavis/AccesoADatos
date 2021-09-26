public class Ejemplo03Excepciones {
	/*
	 * El ejemplo utiliza los m�todos de la clase Throwable
	 */

	public static void main(final String[] args) {
		String cad1 = "2a0", cad2 = "0", mensaje;
		int numerador, denominador, cociente;
		int[] arraynum = new int[4];
		try{
			//codigo que puede producir errores

			arraynum[10] = 20; //sentencia que produce la excepcion
			numerador = Integer.parseInt(cad1); //no se ejecuta
			denominador = Integer.parseInt(cad2);//no se ejecuta
			cociente = numerador/denominador; //no se ejecuta
			mensaje = String.valueOf(cociente); //no se ejecuta
		}catch(NumberFormatException nfe){
			mensaje = "Caracteres no num�ricos";
			System.err.println("toString: " +nfe.toString());
			System.err.println("getMessage: " +nfe.getMessage());
			System.err.println("getLocalizeMessage: " +nfe.getLocalizedMessage());
			nfe.printStackTrace();
			System.err.println("error: " +nfe);
			nfe.printStackTrace();
		}catch (ArithmeticException ae) {
			mensaje = "Divisi�n por cero";
			System.err.println("toString: " +ae.toString());
			System.err.println("getMessage: " +ae.getMessage());
			System.err.println("getLocalizeMessage: " +ae.getLocalizedMessage());
			ae.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException aio) {
			mensaje = "Array fuera de rango";
			System.err.println("toString: " +aio.toString());
			System.err.println("getMessage: " +aio.getMessage());
			System.err.println("getLocalizeMessage: " +aio.getLocalizedMessage());
			aio.printStackTrace();
		}finally{
			System.out.println("finally Se ejecuta siempre");
		}
		System.out.println(mensaje); //si se ejecuta
	}
}

