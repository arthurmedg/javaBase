public class Produtor {
    private int idProdutor;
    private String nome;
    private String especialidade;
    private int anosDeExperiencia;
    private int numeroDeFaixasProduzidas;
    private String certificados;



    public Produtor(int idProdutor, String nome, String especialidade, int anosDeExperiencia, int numeroDeFaixasProduzidas, String certificados) {
        this.idProdutor = idProdutor;
        this.nome = nome;
        this.especialidade = especialidade;
        this.anosDeExperiencia = anosDeExperiencia;
        this.numeroDeFaixasProduzidas = 0;
        this.certificados = certificados;
    }

    //    metodos
    public void produzirFaixa(FaixaMusical faixa) {
        IO.println("Produtor " + nome + "está produzindo a faixa: " + faixa.getInfoFaixaMusical());
        numeroDeFaixasProduzidas++;
    }

    public String getInfoProdutor() {
        return "Produtor: " + nome + " | Especialidade: " + especialidade +
                " | Experiência: " + anosDeExperiencia + " anos | Certificações: " + certificados;
    }


//    getter e setter
    public int getIdProdutor() {
        return idProdutor;
    }

    public void setIdProdutor(int idProdutor) {
        this.idProdutor = idProdutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getAnosDeExperiencia() {
        return anosDeExperiencia;
    }

    public void setAnosDeExperiencia(int anosDeExperiencia) {
        this.anosDeExperiencia = anosDeExperiencia;
    }

    public int getNumeroDeFaixasProduzidas() {
        return numeroDeFaixasProduzidas;
    }

    public void setNumeroDeFaixasProduzidas(int numeroDeFaixasProduzidas) {
        this.numeroDeFaixasProduzidas = numeroDeFaixasProduzidas;
    }

    public String getCertificados() {
        return certificados;
    }

    public void setCertificados(String certificados) {
        this.certificados = certificados;
    }
}
