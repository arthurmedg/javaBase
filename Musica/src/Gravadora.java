import java.util.ArrayList;
import java.util.List;

public class Gravadora {
    private int idGravadora;
    private String nome;
    private String paisOrigem;
    private int numeroDeArtistasContratados;
    private List<FaixaMusical> catalogoDeFaixa;

    public Gravadora(int idGravadora, String nome, String paisOrigem, int numeroDeArtistasContratados, List<FaixaMusical> catalogoDeFaixa) {
        this.idGravadora = idGravadora;
        this.nome = nome;
        this.paisOrigem = paisOrigem;
        this.numeroDeArtistasContratados = numeroDeArtistasContratados;
        this.catalogoDeFaixa = new ArrayList<>();
    }

    //    metodos
    public void contratarCantor(String novoCantor) {
        numeroDeArtistasContratados ++;
        IO.println("Novo cantor contratado, bem-vindo: " + novoCantor);
    }

    public void lancarFaixa(FaixaMusical faixa) {
        catalogoDeFaixa.add(faixa);
        IO.println("Faixa lançada pela gravadora " + nome + ":" + faixa.getInfoFaixaMusical());
    }

    public void listarCatalogo() {
        IO.println("Catálogo da gravadora " + nome + ":");
        for (FaixaMusical faixa : catalogoDeFaixa) {
            IO.println(faixa.getInfoFaixaMusical);
        }
    }

    public void pagarFuncionarios() {
        IO.println("Funcionários foram pagos...");
    }

    public String InfoGravadora() {
        return "Gravadora: " + nome + " | País de origem: " + paisOrigem + " | Número de artistas: " + numeroDeArtistasContratados;
    }


//    getter e setter
    public int getIdGravadora() {
        return idGravadora;
    }

    public void setIdGravadora(int idGravadora) {
        this.idGravadora = idGravadora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public int getNumeroDeArtistasContratados() {
        return numeroDeArtistasContratados;
    }

    public void setNumeroDeArtistasContratados(int numeroDeArtistasContratados) {
        this.numeroDeArtistasContratados = numeroDeArtistasContratados;
    }

    public List<FaixaMusical> getCatalogoDeFaixa() {
        return catalogoDeFaixa;
    }

    public void setCatalogoDeFaixa(List<FaixaMusical> catalogoDeFaixa) {
        this.catalogoDeFaixa = catalogoDeFaixa;
    }
}
