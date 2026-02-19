public class Vaca {

    public String nome;
    private String leite;
    protected int filhos;

    // Construtor vazio
    public Vaca(){

    }

    // Construtor com argumentos
    public Vaca(String nome, String leite, int filhos) {
        this.nome = nome;
        this.leite = leite;
        this.filhos = filhos;

    }

    // toString()
    @Override
    public String toString() {
        return "Vaca{" +
                "nome='" + nome + '\'' +
                ", leite='" + leite + '\'' +
                ", filhos=" + filhos +
                '}';
    }

    public void mugir(){
        IO.println("Muuuuuuuuuuuhh");
    }

    public int bezerros(){
        filhos = filhos + filhos;
        return filhos;
    }

}
