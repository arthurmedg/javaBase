import java.util.Random;

public class Mago extends Personagem{
    private Random random = new Random();


    public Mago(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    public Mago() {
    }


//    @Override
//    public void usarHabilidade(Personagem alvo){
//        IO.println("Vida atual " + this.getVida());
//        this.setVida(+30);
//        IO.println("Vida atual " + this.getVida());
//    }


    @Override
    public void usarHabilidade(Personagem alvo) {
        super.usarHabilidade(alvo);
        int dado;

        dado = random.nextInt(6) + 1;
        IO.println("Dado: " + dado);

        if (dado % 2 == 0) {
            IO.println("Número par! BOLA DE FOGO!");
            setVida(- 100);
        } else {
            IO.println("Número ímpar! O ataque falhou");
        }
    }
}
