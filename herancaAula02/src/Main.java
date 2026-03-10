import javax.security.auth.callback.CallbackHandler;

public class Main {
    public static void main(String[] args) {
        
        Vaca vaca = new Vaca();
        vaca.setNome("Odete");
        vaca.setCor("Pretinha");
        vaca.setPeso(450.0);

        IO.println(vaca.getNome());
        IO.println(vaca.getCor());
        IO.println(vaca.getPeso());
        vaca.fazerSom();


        Gato gato = new Gato();
        gato.setNome("Frajola");
        gato.setCor("Laranja");
        gato.setPeso(5.0);
        gato.fazerSom();

        IO.println(gato.getNome());
        IO.println(gato.getCor());
        IO.println(gato.getPeso());
        gato.fazerSom();
        
        
        Cachorro dog = new Cachorro();
        dog.setNome("Neguinha");
        dog.setCor("Preta");
        dog.setPeso(20.0);
        dog.fazerSom();

        IO.println(dog.getNome());
        IO.println(dog.getCor());
        IO.println(dog.getPeso());
        dog.fazerSom();

    }
}