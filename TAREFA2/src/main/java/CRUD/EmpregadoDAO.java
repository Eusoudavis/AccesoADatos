package CRUD;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmpregadoDAO implements InterfaceEmpleado{
    Empleado empleado;

    private static Connection conectar() {
        Connection con = null;
        String url = "jdbc:mysql://localhost/empresa";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Error al conectar al SGBD.");
        }
        return con;
    }

    @Override
    public void create(Empleado empleado) {

    }

    @Override
    public List<Empleado> read() {
        String sql = "SELECT * FROM empleados";
        List<Empleado> empleados = new ArrayList<>();
        try {
            Connection connection = conectar();
            PreparedStatement sentencia = connection.prepareStatement(sql);
            ResultSet re= sentencia.executeQuery();
           // System.out.println("\t - empleados: \n ");

            while (re.next()){
                empleado = new Empleado();
                int numEmp = re.getInt("numemp");
                String nombre = re.getString("nombre");
                int idade = re.getInt("edad");
                String oficina = re.getString("Oficina");
                String posto = re.getString("puesto");
                Date contrato = re.getDate("contrato");

                //empleados.add((Empleado) empleados);


                connection.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return empleados;
    }

    @Override
    public void update(Empleado empleado) {

    }

    @Override
    public void delete(int numEmpleado) {

    }
}
