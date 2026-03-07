public class EngenheiroDeSom {
    private int idEngenheiroDeSom;
    private String nome;
    private String especialidade;
    private int anosDeExperiencia;
    private int numeroDeFaixasProduzidas;
    private String certificoes;


    public EngenheiroDeSom(int idEngenheiroDeSom, String nome, String especialidade, int anosDeExperiencia, int numeroDeFaixasProduzidas, String certificoes) {
        this.idEngenheiroDeSom = idEngenheiroDeSom;
        this.nome = nome;
        this.especialidade = especialidade;
        this.anosDeExperiencia = anosDeExperiencia;
        this.numeroDeFaixasProduzidas = numeroDeFaixasProduzidas;
        this.certificoes = certificoes;
    }

    @Override
    public String toString() {
        return "EngenheiroDeSom{" +
                "idEngenheiroDeSom=" + idEngenheiroDeSom +
                ", nome='" + nome + '\'' +
                ", especialidade='" + especialidade + '\'' +
                ", anosDeExperiencia=" + anosDeExperiencia +
                ", numeroDeFaixasProduzidas=" + numeroDeFaixasProduzidas +
                ", certificoes='" + certificoes + '\'' +
                '}';
    }

    //    metodos
    public void mixarFaixa() {
        IO.println("Faixa mixada...");
    }

    public void masterizarFaixa() {
        IO.println("Faixa masterizada...");
    }

    public void adicionarCertificado(String novoCertificado) {
        certificoes += ", " + novoCertificado;
        System.out.println("Novo certificado registrado: " + novoCertificado);
    }

    public String getInfoEngenheiroDeSom() {
        return "Nome: " + nome + " | Especialidade: " + especialidade + " | Anos de Experiência: " + anosDeExperiencia + " | Número de faixas produzidas: " + numeroDeFaixasProduzidas + " | Certificações: " + certificoes;
    }


//    getter e setter
    public int getIdEngenheiroDeSom() {
        return idEngenheiroDeSom;
    }

    public void setIdEngenheiroDeSom(int idEngenheiroDeSom) {
        this.idEngenheiroDeSom = idEngenheiroDeSom;
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

    public String getCertificoes() {
        return certificoes;
    }

    public void setCertificoes(String certificoes) {
        this.certificoes = certificoes;
    }
}
