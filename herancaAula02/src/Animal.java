public class Animal {
    private String Nome;
    private String Cor;
    private Double Peso;

    public Animal(String nome, String cor, Double peso) {
        Nome = nome;
        Cor = cor;
        Peso = peso;
    }


    //    metodo
    public void fazerSom(){
    }

    public Animal() {
    }



    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public Double getPeso() {
        return Peso;
    }

    public void setPeso(Double peso) {
        Peso = peso;
    }
}
