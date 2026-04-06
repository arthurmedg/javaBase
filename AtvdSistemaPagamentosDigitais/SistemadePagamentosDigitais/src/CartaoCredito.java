package AtvdSistemaPagamentosDigitais.SistemadePagamentosDigitais.src;

import java.time.LocalDateTime;

public class CartaoCredito extends Pagamento {
    public CartaoCredito(double valor, String status, LocalDateTime dataHoraPagamento) {
        super(valor, status, dataHoraPagamento);
    }
}
