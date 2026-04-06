import AtvdSistemaPagamentosDigitais.SistemadePagamentosDigitais.src.Pix;

void main() {
    Scanner sc = new Scanner(System.in);

    int escolhaPagamento = 0;

    while (escolhaPagamento != 1 && escolhaPagamento != 2 && escolhaPagamento != 3) {
        IO.println("1 - Boleto Bancário");
        IO.println("2 - Cartao de Crédito");
        IO.println("3 - Pix");
        IO.print("Selecione a forma de pagamento: ");
        if (sc.hasNextInt() && escolhaPagamento <= 3 && escolhaPagamento >= 1) {
            escolhaPagamento = Integer.parseInt((sc.next()));
            escolhaPagamento = sc.nextInt();

            if (escolhaPagamento == 1) {
                IO.println("Boleto Bancário selecionado");
//                Pix pix = new Pix(0, "Pendente", LocalDateTime.now());
                IO.print("Valor do pagamento: ");
                double valorPagamento = sc.nextDouble();
                IO.println("Status Pagamento: Pendente");
                int statusPagamento = 0;
                while (statusPagamento != 1) {
                    IO.println("Quando o pagamento for realizado, por favor, digitar '1'");
                    if (sc.hasNextInt() && sc.nextInt() == 1) {
                        Pix pix = new Pix(valorPagamento, "Pago", LocalDateTime.now());
                        pix.toString();
                    }
                    IO.println("Erro: Por favor, digitar apenas o número solicitado!");
                    sc.next();
                }


            } else if (escolhaPagamento == 2) {
                IO.println("Cartão de Crédito selecionado");
            } else if (escolhaPagamento == 3) {
                IO.println("Pix selecionado");
            }

        }
        IO.println("Erro: Por favor, digitar apenas o número de uma opção!");
        sc.next();
    }
//    } IO.println("Por favor, digitar apenas o número de uma opção!");

    }

//    IO.println("Qual a forma de pagamento?");
//    IO.println("1 - Boleto Bancário");
//    IO.println("2 - Cartao de Crédito");
//    IO.println("3 - Pix");
//    int escolhaPagamento = Integer.parseInt((sc.next()));
//
//
//    if (escolhaPagamento == 1) {
//        IO.println("Boleto Bancário selecionado");
//    } else if (escolhaPagamento == 2) {
//        IO.println("Cartão de Crédito selecionado");
//    } else if (escolhaPagamento == 3) {
//        IO.println("Pix selecionado");
//    }
//    IO.println(escolhaPagamento);
//
//}