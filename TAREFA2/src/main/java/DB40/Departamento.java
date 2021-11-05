package DB40;

public class Departamento {
    private int dept_no;
    private String nome;
    private String loc;

    public Departamento(int dept_no, String nome, String loc) {
        this.dept_no = dept_no;
        this.nome = nome;
        this.loc = loc;
    }

    public int getDept_no() {
        return dept_no;
    }

    public void setDept_no(int dept_no) {
        this.dept_no = dept_no;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
