public class Mago extends Personagem{
    public Mago(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    public Mago() {
    }


    public void lancarMagia(int vida){
        IO.println("Vida atual " + this.getVida());
        this.setVida(vida =+ 30);
        IO.println("Vida atual " + this.getVida());
    }
}
