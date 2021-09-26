package EX1Antonio;

public class Oficina extends ParaTodasCidades implements IEdificio {

    private float superficie =0;

    public Oficina(String nome, String cidade) {
        super(nome, cidade);
    }

    public Oficina(String nome, String cidade, float superficie) {
        super(nome, cidade);
        this.superficie = superficie;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public String getCidade() {
        return super.getCidade();
    }

    @Override
    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "superficie=" + superficie +
                ", nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
