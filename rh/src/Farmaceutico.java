public class Farmaceutico extends Funcionario{

    private String numCrf;

    public Farmaceutico(String nome, double salario, String rg, String numCrf) {
        super(nome, salario, rg);
        this.numCrf = numCrf;
    }

    public Farmaceutico() {
    }

    @Override
    public double calcularSalario(double valor) {
        return valor - (valor * 0.15);
    }

    public String getNumCrf() {
        return numCrf;
    }

    public void setNumCrf(String numCrf) {
        this.numCrf = numCrf;
    }
}
