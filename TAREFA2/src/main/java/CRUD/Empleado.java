package CRUD;

import java.util.Date;

public class Empleado {
    private final int TAM_NOMBRE = 30;
    private final int TAM_POSTO = 30;

    private int numEmp;
    private String nombre;
    private int idade;
    private String oficina;
    private String posto;
    private Date contrato;

    public Empleado(int numEmp, String nombre, int idade, String oficina, String posto, Date contrato) {
        this.numEmp = numEmp;
        this.nombre = nombre;
        this.idade = idade;
        this.oficina = oficina;
        this.posto = posto;
        this.contrato = contrato;
    }

    public Empleado() {

    }

    public int getTAM_NOMBRE() {
        return TAM_NOMBRE;
    }

    public int getTAM_POSTO() {
        return TAM_POSTO;
    }

    public int getNumEmp() {
        return numEmp;
    }

    public void setNumEmp(int numEmp) {
        this.numEmp = numEmp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public String getPosto() {
        return posto;
    }

    public void setPosto(String posto) {
        this.posto = posto;
    }

    public Date getContrato() {
        return contrato;
    }

    public void setContrato(Date contrato) {
        this.contrato = contrato;
    }
}
