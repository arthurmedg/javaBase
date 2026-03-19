package aula03;

import java.util.Scanner;

public class ifElseExc {
    static void main() {
        Scanner sc = new Scanner(System.in);

        IO.println("Digite a sua primeira nota");
        float nota = Float.parseFloat(sc.next());
        IO.println("Digite a sua segunda nota");
        float nota1 = Float.parseFloat(sc.next());
        IO.println("Digite a sua terceira nota");
        float nota2 = Float.parseFloat(sc.next());

        float media = (nota + nota1 + nota2) / 3;
        IO.println("Sua média é: " + media);

        if (media < 4){
            IO.println("Reprovado!");
        } else if (media <= 6) {
            IO.println("Recuperação!");
        }else {
            IO.println("Aprovado!");
        }

    }
}
