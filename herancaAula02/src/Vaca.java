public class Vaca extends Animal {

    public Vaca(String nome, String cor, Double peso) {
        super(nome, cor, peso);
    }

public Vaca(){}


    @Override
    public void fazerSom() {
        super.fazerSom();
        IO.println("Muuuhh");
    }
}
