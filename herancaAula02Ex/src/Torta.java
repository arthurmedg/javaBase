public class Torta extends Doce{
    public Torta(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }
    
    public Torta(){}


    @Override
    public void cobertura() {
        super.cobertura();
        IO.println("Chocolate");;
    }

    @Override
    public void massa() {
        super.massa();
        IO.println("Branca");
    }
}
