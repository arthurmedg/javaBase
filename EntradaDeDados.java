package aula02;

import java.util.Scanner;

public class EntradaDeDados {

    static void main() {
        Scanner sc = new Scanner(System.in);
        
        IO.println("Digite o seu nome");
        String nome = sc.next();
        IO.println(nome);

        IO.println("Digite a sua idade");
        int idade = Integer.parseInt(sc.next());
        IO.println(idade);

        IO.println("Digite a sua peso");
        float peso = Float.parseFloat(sc.next());
        IO.println(peso);


        IO.println("Digite a sua altura");
        float altura = Float.parseFloat(sc.next());
        IO.println(altura);

        float imc = (peso / (altura * altura));
        IO.print("Seu IMC é: ");
        IO.print(imc);

}
}
