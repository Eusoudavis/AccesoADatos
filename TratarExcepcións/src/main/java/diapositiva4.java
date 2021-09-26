public class diapositiva4 {

	static void miMetodo(int n) throws Exception {
        try {
            switch (n) {
                case 1:
                    System.out.println("1er case");
                    break;
                case 2:
                    System.out.println("2er case");
                    throw new RuntimeException("2!");
                case 3:
                    System.out.println("3er case");
                    throw new Exception("3!");
            }
        } catch (RuntimeException e) {
            System.out.print("RuntimeException: ");
            System.out.println(e.getMessage());
        } finally{
            System.out.println("try-block ejecutado");
        }
    }
	public static void main(String[] args) {

	     for (int i = 1; i < 4; i++) {
	         try {
	             diapositiva4.miMetodo(i);
	          } catch (Exception ex) {
	             System.out.println("Excepci�n capturada "+
	                     ex.getMessage());
	          }
	       }
	}
}