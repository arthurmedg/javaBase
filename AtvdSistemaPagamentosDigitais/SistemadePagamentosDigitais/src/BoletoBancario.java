package AtvdSistemaPagamentosDigitais.SistemadePagamentosDigitais.src;

import java.time.LocalDateTime;

public class BoletoBancario extends Pagamento {
    public BoletoBancario(double valor, String status, LocalDateTime dataHoraPagamento) {
        super(valor, status, dataHoraPagamento);
    }
}
