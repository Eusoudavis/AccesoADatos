package EX_Binario;

import java.io.Serializable;

public class Cliente implements Serializable {
    protected String DNI, nome;
    protected double saldo;
    protected int dia,mes,ano;

    public Cliente(String DNI, String nome,  int dia, int mes, int ano, double saldo) {
        this.DNI = DNI;
        this.nome = nome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.saldo = saldo;

    }

    public Cliente() {

    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Main{" +
                "DNI='" + DNI + '\'' +
                ", nome='" + nome + '\'' +
                ", dia=" + dia +
                ", mes=" + mes +
                ", ano=" + ano +
                ", saldo=" + saldo +
                '}';
    }
}
