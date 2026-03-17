public abstract class Personagem {
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;


    public Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public Personagem() {
    }


    public void atacar() {

    }
    public void receberDano(int dano) {}
    public String mostrarStatus() {
        return "Nome: " + nome + " | Vida: " + vida + " | Ataque: " + ataque + " | Defesa: " + defesa;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int dano) {
        this.vida = dano;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
}
