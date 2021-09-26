package EX1Antonio;

public class Polideportivo extends ParaTodasCidades implements IInstalacionDeportiva, IEdificio{
   private String tipoInstalacion;
   private float Superficie;

    public Polideportivo(String nome, String cidade) {
        super(nome, cidade);
    }

    public Polideportivo(String nome, String cidade, String tipoInstalacion, float superficie) {
        super(nome, cidade);
        this.tipoInstalacion = tipoInstalacion;
        Superficie = superficie;
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
    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    @Override
    public String toString() {
        return "Polideportivo{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", tipoInstalacion='" + tipoInstalacion + '\'' +
                ", Superficie=" + Superficie +
                '}';
    }

    @Override
    public float getSuperficie() {
        return 0;
    }
}
