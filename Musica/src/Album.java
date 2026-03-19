import java.util.ArrayList;
import java.util.List;

public class Album {
    private int idAlbum;
    private String titulo;
    private int anoLancamento;
    private String genero;
    private int numeroDeFaixas;
    private String gravadoraResponsavel;


//    lista para guardar faixas
    private List<FaixaMusical> faixasAlbum = new ArrayList<>();


//    metodos
    public void adicionarFaixas(FaixaMusical faixa){
        faixasAlbum.add(faixa);
        numeroDeFaixas++;
        IO.println("Faixa adicionada!");
    }

    public void removerFaixas(FaixaMusical faixa) {
        faixasAlbum.remove(faixa);
        numeroDeFaixas--;
        IO.println("Faixa removida!");
    }

    public void listarFaixas() {
        for (FaixaMusical faixa : faixasAlbum) {
            System.out.println(faixa.getInfoFaixaMusical());
        }
    }

    public String getInfoAlbum() {
        return "Álbum: " + titulo + " (" + anoLancamento + "), Gênero: " + genero;
    }




//  getter e setter
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

    public List<FaixaMusical> getFaixas() {
        return faixasAlbum;
    }

    public void setFaixas(List<FaixaMusical> faixas) {
        this.faixasAlbum = faixas;
    }
}
