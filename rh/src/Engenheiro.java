public class Engenheiro extends Funcionario {

    private String numCrea;

    public Engenheiro(String nome, double salario, String rg, String numCrea) {
        super(nome, salario, rg);
        this.numCrea = numCrea;
    }

    public Engenheiro() {}

    @Override
    public double calcularSalario(double valor) {
        return valor - (valor * 0.27);
    }

    public String getNumCrea() {
        return numCrea;
    }

    public void setNumCrea(String numCrea) {
        this.numCrea = numCrea;
    }
}
