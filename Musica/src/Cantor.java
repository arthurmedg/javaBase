public class Cantor {
    private int idCantor;
    private String nome;
    private String nacionalidade;
    private String estiloMusical;
    private int numeroDeFaixasGravadas;

//  construtor
    public Cantor(int idCantor, String nome, String nacionalidade, String estiloMusical) {
        this.idCantor = idCantor;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.estiloMusical = estiloMusical;
        this.numeroDeFaixasGravadas = 0;
    }

    @Override
    public String toString() {
        return "Cantor{" +
                "idCantor=" + idCantor +
                ", nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", estiloMusical='" + estiloMusical + '\'' +
                ", numeroDeFaixasGravadas=" + numeroDeFaixasGravadas +
                '}';
    }

    //    metodos
    public void cantarFaixa(){
        IO.println("Cantando lalala...");
    }

    public void registrarFaixa(FaixaMusical faixa) {
        numeroDeFaixasGravadas++;
        System.out.println("Faixa registrada pelo cantor " + nome + ": " + faixa.getInfoFaixaMusical());
    }

    public void atualizarEstilo(String novoEstilo) {
        this.estiloMusical = novoEstilo;
        System.out.println("Estilo musical atualizado para: " + novoEstilo);
    }

    public String getInfoCantor() {
        return "Cantor: " + nome + " | Nacionalidade: " + nacionalidade + " | Estilo: " + estiloMusical;
    }


//    getter e setter
    public int getIdCantor() {
        return idCantor;
    }

    public void setIdCantor(int idCantor) {
        this.idCantor = idCantor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getEstiloMusical() {
        return estiloMusical;
    }

    public void setEstiloMusical(String estiloMusical) {
        this.estiloMusical = estiloMusical;
    }

    public int getNumeroDeFaixasGravadas() {
        return numeroDeFaixasGravadas;
    }

    public void setNumeroDeFaixasGravadas(int numeroDeFaixasGravadas) {
        this.numeroDeFaixasGravadas = numeroDeFaixasGravadas;
    }
}
