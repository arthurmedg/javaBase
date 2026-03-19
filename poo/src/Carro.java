public class Carro {
    private String modelo;
    private int velocidade;

    public void Acelerar(){
        IO.println("Vruummm");

    }

    public Carro(String modelo, int velocidade) {
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public Carro() {
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }
}
