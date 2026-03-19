//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//  Mago mago = new Mago("teste", 10, 10, 10);

//  System.out.println(mago.mostrarStatus());
//  IO.println(mago.atacar(40, 10, 70));


//  menu
  Scanner sc = new Scanner(System.in);

//  Jogador 1
  IO.println("Escolha o seu personagem, jogador 1:");
  IO.println("1 - Guerreiro (A: 50, HP: 150: D: 30)");
  IO.println("2 - Mago (A: 80, HP: 150: D: 20) Habilidade Especial: Fraqueza (Anula a defesa do oponente na rodada utilizada.)");
  IO.println("3 - Arqueiro: (A: 40, HP: 150: D: 20) Habilidade Especial: Velocidade Extra (Joga um dado, até cair um número ímpar, \n    para cada número par, o ataque é usado uma vez na rodada utilizada. Caso não caia nenhum número par, o ataque não fará nada neste turno.");
  int jogador1 = 0;

  boolean escolhaValida = false;

  while (!escolhaValida) { // !(not) - inverte o valor de um booleano
    IO.print("Digite o número do personagem desejado: ");

    if (sc.hasNextInt()) { // hasNextInt - para ver se o usuário digitou um número
      jogador1 = sc.nextInt();

      if (jogador1 >= 1 && jogador1 <= 3) {
        escolhaValida = true;

        switch(jogador1) {
          case 1:
            IO.println("");
            IO.println("*Guerreiro selecionado*");
            IO.println("");
            IO.print("- Digite o nome do seu Guerreiro: ");
            String guerreiroNome = sc.next();
            Guerreiro guerreiro = new Guerreiro(guerreiroNome, 150, 50, 30);
            IO.println("");
            IO.println("- Certo, então esse é o seu Guerreiro: " + guerreiro.mostrarStatus());
            IO.println("---------------------------------");
            break;
          case 2:
            IO.println("");
            IO.println("*Mago selecionado*");
            IO.println("");
            IO.print("Digite o nome do seu Mago: ");
            String magoNome = sc.next();
            Mago mago = new Mago(magoNome, 150, 80, 20);
            IO.println("");
            IO.println("- Certo, então esse é o seu Mago: " + mago.mostrarStatus());
            IO.println("---------------------------------");
            break;
          case 3:
            IO.println("");
            IO.println("*Arqueiro selecionado*");
            IO.println("");
            IO.print("Digite o nome do seu Arqueiro: ");
            String arqueiroNome = sc.next();
            Arqueiro arqueiro = new Arqueiro(arqueiroNome, 150, 40, 20);
            IO.println("");
            IO.print("- Certo, então esse é o seu Arqueiro: " + arqueiro.mostrarStatus());
            IO.println("---------------------------------");
            break;

          default:
            IO.println("Opção inválida!");

        }

      } else {
        System.out.println("Erro: Digite um número entre 1 e 3!");
      }

    }else {
      System.out.println("Erro: Digite apenas números!");
      sc.next();
    }
  }

//  IO.println(jogador1);

// Jogador 2
  int jogador2 = 0;

  boolean escolhaValida2 = false;

  while (!escolhaValida2) { // !(not) - inverte o valor de um booleano
    IO.print("Digite o número do personagem desejado: ");

    if (sc.hasNextInt()) { // hasNextInt - para ver se o usuário digitou um número
      jogador2 = sc.nextInt();

      if (jogador2 >= 1 && jogador2 <= 3) {
        escolhaValida = true;

        switch(jogador2) {
          case 1:
            IO.println("");
            IO.println("*Guerreiro selecionado*");
            IO.println("");
            IO.print("- Digite o nome do seu Guerreiro: ");
            String guerreiroNome = sc.next();
            Guerreiro guerreiro2 = new Guerreiro(guerreiroNome, 150, 50, 30);
            IO.println("");
            IO.println("- Certo, então esse é o seu Guerreiro: " + guerreiro2.mostrarStatus());
            IO.println("---------------------------------");
            break;
          case 2:
            IO.println("");
            IO.println("*Mago selecionado*");
            IO.println("");
            IO.print("Digite o nome do seu Mago: ");
            String magoNome = sc.next();
            Mago mago2 = new Mago(magoNome, 150, 80, 20);
            IO.println("");
            IO.println("- Certo, então esse é o seu Mago: " + mago2.mostrarStatus());
            IO.println("---------------------------------");
            break;
          case 3:
            IO.println("");
            IO.println("*Arqueiro selecionado*");
            IO.println("");
            IO.print("Digite o nome do seu Arqueiro: ");
            String arqueiroNome = sc.next();
            Arqueiro arqueiro2 = new Arqueiro(arqueiroNome, 150, 40, 20);
            IO.println("");
            IO.print("- Certo, então esse é o seu Arqueiro: " + arqueiro2.mostrarStatus());
            IO.println("---------------------------------");
            break;

          default:
            IO.println("Opção inválida!");

        }

      } else {
        System.out.println("Erro: Digite um número entre 1 e 3!");
      }

    }else {
      System.out.println("Erro: Digite apenas números!");
      sc.next();
    }
  }



}
