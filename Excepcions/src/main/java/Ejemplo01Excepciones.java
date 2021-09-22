public class Ejemplo01Excepciones {
	public static void main(final String[] args) {
		int numerador = 10, denominador = 0, cociente;
			
		try{
			//codigo que puede producir errores
			cociente = numerador/denominador;
			System.out.println("Resultado = "+cociente);
			}catch(NumberFormatException nfe){
			//tratamiento de la excepci�n
			}catch (ArithmeticException ae) {
			//tratamiento de la excepci�n
			}catch (ArrayIndexOutOfBoundsException aio) {
			//tratamiento de la excepci�n
			}catch (Exception e) {
			//tratamiento si se produce cualquier otra excepci�n
			}finally{
			//se ejecuta haya o no excepci�n
				System.out.println("Final");
			}
	}
}


