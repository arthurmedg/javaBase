package AtvdSistemaPagamentosDigitais.SistemadePagamentosDigitais.src;

import AtvdSistemaPagamentosDigitais.SistemadePagamentosDigitais.src.Pagamento;

import java.time.LocalDateTime;

public class Pix extends Pagamento {
    public Pix(double valor, String status, LocalDateTime dataHoraPagamento) {
        super(valor, status, dataHoraPagamento);
    }
}
