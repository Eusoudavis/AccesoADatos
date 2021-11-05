package DB40;

public class Empleado {
    private int emp_no;
    private String apelido;
    private String oficio;
    private int dir;
    private String fecha;
    private int salario;
    private int comision;
    private int dept_no;

    public Empleado(int emp_no, String apelido, String oficio, int dir, String fecha, int salario, int comision, int dept_no) {
        this.emp_no = emp_no;
        this.apelido = apelido;
        this.oficio = oficio;
        this.dir = dir;
        this.fecha = fecha;
        this.salario = salario;
        this.comision = comision;
        this.dept_no = dept_no;
    }

    public int getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public int getDir() {
        return dir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    public int getDept_no() {
        return dept_no;
    }

    public void setDept_no(int dept_no) {
        this.dept_no = dept_no;
    }
}
