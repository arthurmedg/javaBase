public class Cachorro extends Animal {

    public Cachorro(String nome, String cor, Double peso) {
        super(nome, cor, peso);
    }

    public Cachorro(){}

    @Override
    public void fazerSom() {
        super.fazerSom();
        IO.println("Auau");
    }
}
