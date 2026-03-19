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


//    public void habilidadeEspecial(Personagem) {
//        if Personagem ==
//    }



    public void atacar(Personagem alvo) {
        IO.println(this.getNome() + " atacou " + alvo.getNome());
        alvo.receberDano(this.ataque);
    }

    public void usarHabilidade (Personagem alvo) {
    }

    public void receberDano (int danoRecebido){
        int danoReal = danoRecebido - this.defesa;

        if (danoReal < 0) {
            danoReal = 0;
        }

        this.vida -= danoReal;

        if (this.vida < 0){
            this.vida = 0;
        }

        IO.println(this.nome + " recebeu " + danoReal + " de dano");
        IO.println("vida atual: " + this.vida);
    }



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
