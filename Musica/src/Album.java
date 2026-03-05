public class Album {
    private int idAlbum;
    private String titulo;
    private int anoLancamento;
    private String genero;
    private int numeroDeFaixas;
    private String gravadoraResponsavel;

    public int getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(int idAlbum) {
        this.idAlbum = idAlbum;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumeroDeFaixas() {
        return numeroDeFaixas;
    }

    public void setNumeroDeFaixas(int numeroDeFaixas) {
        this.numeroDeFaixas = numeroDeFaixas;
    }

    public String getGravadoraResponsavel() {
        return gravadoraResponsavel;
    }

    public void setGravadoraResponsavel(String gravadoraResponsavel) {
        this.gravadoraResponsavel = gravadoraResponsavel;
    }
}
