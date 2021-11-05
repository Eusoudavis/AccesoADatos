package CRUD;

public class Main {
    public static void main(String[] args) {
        EmpregadoDAO e = new EmpregadoDAO();
        e.read();
        System.out.println(e);

    }
}
