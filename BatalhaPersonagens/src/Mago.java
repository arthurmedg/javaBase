public class Mago extends Personagem{
    public Mago(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    public Mago() {
    }


    public void atacar(int ataque) {
        ataque = ataque + 10;
    }

    public void receberDano(int dano, int vida, int defesa) {
        vida = vida - (dano - defesa);
    }

    public void lancarMagia(){

    }
}
