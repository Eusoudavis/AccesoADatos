package CRUD;

public class Oficina {
    private final int TAM_NOMBRE = 30;
    private final double TAM_POSTO = 8.2;

    private int oficina;
    private String cidade;
    private double superficie;
    private double vendas;

    public Oficina(int oficina, String cidade, double superficie, double vendas) {
        this.oficina = oficina;
        this.cidade = cidade;
        this.superficie = superficie;
        this.vendas = vendas;
    }

    public int getTAM_NOMBRE() {
        return TAM_NOMBRE;
    }

    public double getTAM_POSTO() {
        return TAM_POSTO;
    }

    public int getOficina() {
        return oficina;
    }

    public void setOficina(int oficina) {
        this.oficina = oficina;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }
}

