void main() {

//  menu
  Scanner sc = new Scanner(System.in);

  Personagem jogador1 = null;
  Personagem jogador2 = null;

//  Jogador 1
  IO.println("Escolha o seu personagem, jogador 1:");
  IO.println("1 - Guerreiro (A: 50, HP: 150: D: 30)");
  IO.println("2 - Mago (A: 80, HP: 150: D: 20) Habilidade Especial: Fraqueza (Anula a defesa do oponente na rodada utilizada.)");
  IO.println("3 - Arqueiro: (A: 40, HP: 150: D: 20) Habilidade Especial: Velocidade Extra (Joga um dado, até cair um número ímpar, \n    para cada número par, o ataque é usado uma vez na rodada utilizada. Caso não caia nenhum número par, o ataque não fará nada neste turno.");

  int escolha1 = 0;
  boolean escolhaValida = false;

  while (!escolhaValida) { // !(not) - inverte o valor de um booleano

    IO.print("Digite o número do personagem desejado: ");

    if (sc.hasNextInt()) { // hasNextInt - para ver se o usuário digitou um número
      escolha1 = sc.nextInt();

      if (escolha1 >= 1 && escolha1 <= 3) {
        escolhaValida = true;

        IO.print("Digite o nome do seu personagem: ");
        String nome = sc.next();

        switch(escolha1) {
          case 1:
            IO.println("");
            IO.println("*Guerreiro selecionado*");
            IO.println("");
            jogador1 = new Guerreiro(nome, 150, 50, 30);
            IO.println("- Certo, então esse é o seu Guerreiro: " + jogador1.mostrarStatus());
            IO.println("---------------------------------");
            break;
          case 2:
            IO.println("");
            IO.println("*Mago selecionado*");
            IO.println("");
            jogador1 = new Mago(nome, 150, 80, 20);
            IO.println("- Certo, então esse é o seu Mago: " + jogador1.mostrarStatus());
            IO.println("---------------------------------");
            break;
          case 3:
            IO.println("");
            IO.println("*Arqueiro selecionado*");
            IO.println("");
            jogador1 = new Arqueiro(nome, 150, 40, 20);
            IO.print("- Certo, então esse é o seu Arqueiro: " + jogador1.mostrarStatus());
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
  IO.println("Escolha o seu personagem, jogador 2:");
  IO.println("1 - Guerreiro (A: 50, HP: 150: D: 30)");
  IO.println("2 - Mago (A: 80, HP: 150: D: 20) Habilidade Especial: Fraqueza (Anula a defesa do oponente na rodada utilizada.)");
  IO.println("3 - Arqueiro: (A: 40, HP: 150: D: 20) Habilidade Especial: Velocidade Extra (Joga um dado, até cair um número ímpar, \n    para cada número par, o ataque é usado uma vez na rodada utilizada. Caso não caia nenhum número par, o ataque não fará nada neste turno.");

  int escolha2 = 0;
  escolhaValida = false;

  while (!escolhaValida) { // !(not) - inverte o valor de um booleano
    IO.print("Digite o número do personagem desejado: ");

    if (sc.hasNextInt()) { // hasNextInt - para ver se o usuário digitou um número
      escolha2 = sc.nextInt();

      if (escolha2 >= 1 && escolha2 <= 3) {
        escolhaValida = true;

        IO.print("Digite o nome do seu personagem: ");
        String nome = sc.next();

        switch(escolha2) {
          case 1:
            IO.println("");
            IO.println("*Guerreiro selecionado*");
            jogador2 = new Guerreiro(nome, 150, 50, 30);
            IO.println("");
            IO.println("- Certo, então esse é o seu Guerreiro: " + jogador2.mostrarStatus());
            IO.println("---------------------------------");
            break;
          case 2:
            IO.println("");
            IO.println("*Mago selecionado*");
            jogador2 = new Mago(nome, 150, 80, 20);
            IO.println("");
            IO.println("- Certo, então esse é o seu Mago: " + jogador2.mostrarStatus());
            IO.println("---------------------------------");
            break;
          case 3:
            IO.println("");
            IO.println("*Arqueiro selecionado*");
            jogador2 = new Arqueiro(nome, 150, 40, 20);
            IO.println("");
            IO.print("- Certo, então esse é o seu Arqueiro: " + jogador2.mostrarStatus());
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

  IO.println("");
  IO.println("=== BATALHA INICIADA ===");
  IO.println(jogador1.getNome() + " vs " + jogador2.getNome());
  IO.println("");


//  jogador1.atacar(jogador2);

  jogador1.usarHabilidade(jogador1);









}
