import java.util.Date;

public class FaixaMusical {
    private int idFaixaMusical;
    private String titulo;
    private double duracao;
    private String genero;
    private Date dataLancemento;
    private int numeroDeStreams;
    public boolean getInfoFaixaMusical;


//    metodos
    public void reproduzir() {
        IO.println("Reproduzindo faixa: " + titulo);
    }

    public void pausar() {
        IO.println("Faixa pausada: " + titulo);
    }

    public String getInfoFaixaMusical() {
        return "Faixa: " + titulo + " (" + genero + ")";
    }


//    getter e setter

    public int getIdFaixaMusical() {
        return idFaixaMusical;
    }

    public void setIdFaixaMusical(int idFaixaMusical) {
        this.idFaixaMusical = idFaixaMusical;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getDataLancemento() {
        return dataLancemento;
    }

    public void setDataLancemento(Date dataLancemento) {
        this.dataLancemento = dataLancemento;
    }

    public int getNumeroDeStreams() {
        return numeroDeStreams;
    }

    public void setNumeroDeStreams(int numeroDeStreams) {
        this.numeroDeStreams = numeroDeStreams;
    }


}
