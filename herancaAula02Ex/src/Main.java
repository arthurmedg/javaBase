//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Torta torta = new Torta();
    torta.setNome("Torta Gostosa Incrível do Thurzin");
    torta.setCor("Marrom");
    torta.setPeso(2.0);

    IO.println(torta.getNome());
    IO.println(torta.getCor());
    IO.println(torta.getPeso());
    torta.cobertura();
    torta.massa();

        IO.println("");
        IO.println("------------------------");
        IO.println("");

    Bolo bolo = new Bolo();
    bolo.setNome("Bolo Maravilhoso Saboroso do Tutux");
    bolo.setCor("Rosa");
    bolo.setPeso(3.0);

    IO.println(bolo.getNome());
    IO.println(bolo.getCor());
    IO.println(bolo.getPeso());
    bolo.cobertura();
    bolo.massa();





    }
}