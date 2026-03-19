public class Guerreiro extends Personagem{
    public Guerreiro(String nome, int dano, int ataque, int defesa) {
        super(nome, dano, ataque, defesa);
    }

    public Guerreiro() {
    }

    @Override
    public void usarHabilidade(Personagem alvo) {
        IO.println("Guerreiro tentou usar mágia, porém falhou!");
    }
}
