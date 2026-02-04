package aula03;

import java.util.Scanner;

public class imcIf {
    static void main() {
        Scanner sc = new Scanner(System.in);

        IO.println("Digite o seu nome:");
        String nome = sc.next();

        IO.println("Digite a sua idade:");
        int idade = Integer.parseInt(sc.next());

        IO.println("Digite o seu peso:");
        float peso = Float.parseFloat(sc.next());

        IO.println("Digite a sua altura em metros:");
        float altura = Float.parseFloat(sc.next());

        float imc = peso / (altura * altura);
        IO.println("Certo, então seu nome é: " + nome);
        IO.println("Você tem: " + idade + " anos");
        IO.println("Sua altura é: " + altura + "M");
        IO.println("E você pesa: " + peso + "Kg");
        IO.println();
        IO.println("Com essas informações, posso dizer que seu IMC é: " + imc);


        if (imc < 18.5){
            IO.println("Você está abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            IO.println("Você está no peso normal");
        } else if (imc >= 25 && imc <= 29.9) {
            IO.println("Você está com sobrepeso");
        } else if (imc >= 30 && imc <= 34.9) {
            IO.println("Você está com obesidade grau I");
        } else if (imc >= 35 && imc <= 39.9){
            IO.println("Você está com obesidade grau II");
        } else{
            IO.println("Você está com obesidade grau III");
        }
    }
}
