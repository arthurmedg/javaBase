import java.util.Random;

public class Arqueiro extends Personagem {
    private Random random = new Random();

    public Arqueiro(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    @Override
    public void usarHabilidade(Personagem alvo) {
        IO.println(this.getNome() + " usou Habilidade Especial: VELOCIDADE EXTRA!");

        int ataquesRealizados = 0;
        boolean continuar = true;
        int dado;

        while (continuar) {
            dado = random.nextInt(6) + 1; // Dado de 1 a 6
            IO.println("Dado: " + dado);

            if (dado % 2 == 0) { // Número par
                IO.println("Número par! Atacando novamente!");
                this.atacar(alvo);
                ataquesRealizados++;
            } else { // Número ímpar
                IO.println("Número ímpar! Sequência encerrada.");
                continuar = false;
            }
        }

        if (ataquesRealizados == 0) {
            IO.println("Nenhum ataque extra realizado neste turno.");
        } else {
            IO.println("Total de ataques extras: " + ataquesRealizados);
        }
    }
}