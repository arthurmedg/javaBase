package AtvdSistemaPagamentosDigitais.SistemadePagamentosDigitais.src;

import java.time.LocalDateTime;
import java.util.Scanner;

public abstract class Pagamento {
    private double valor;
    private String status;
    private LocalDateTime dataHoraPagamento;


    public Pagamento(double valor, String status, LocalDateTime dataHoraPagamento) {
        this.valor = valor;
        this.status = status;
        this.dataHoraPagamento = dataHoraPagamento;
    }

//    Scanner sc = new Scanner(System.in);

//    public double pagamento(){
//        IO.print("Valor do pagamento: ");
//        double valorPagamento = sc.nextDouble();
//        return valorPagamento;
//    }

    @Override
    public String toString() {
        return "Pagamento: " +
                "valor = " + getValor() +
                " | status = " + getStatus() +
                " | horário do pagamento = " + getDataHoraPagamento();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getDataHoraPagamento() {
        return dataHoraPagamento;
    }

    public void setDataHoraPagamento(LocalDateTime dataHoraPagamento) {
        this.dataHoraPagamento = dataHoraPagamento;
    }
}
