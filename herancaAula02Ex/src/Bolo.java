public class Bolo extends Doce{
    public Bolo(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    public Bolo(){}


    @Override
    public void cobertura() {
        super.cobertura();
        IO.println("Morango");;
    }

    @Override
    public void massa() {
        super.massa();
        IO.println("Chocolate");
    }
}
