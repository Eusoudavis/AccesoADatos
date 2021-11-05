package CRUD;

import java.util.List;

public interface InterfaceEmpleado {
    public void create(Empleado empleado);
    public List<Empleado> read();
    public void update(Empleado empleado);
    public void delete(int numEmpleado);
}
