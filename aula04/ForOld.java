package aula04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class For {
    static void main() {
//        1° inicia a variavel
//        2° condição
//        3° alteração da variavel

////        mostra todos os numeros pares de 0 a 10
//        for (int i = 0; i <= 10; i += 2) {
//            IO.println("O valor de i é: " + i);
//        }
//
////        mostra todos os numeros impares de 0 a 10
//        for (int i = 1; i <= 10; i += 2) {
//            IO.println("O valor de i é: " + i);





//            WHILE

//        }
//        int i = 1;
//        while(i < 11){
//            IO.println("O que vai acontecer? " + i);
//            i++;
//        }
//        mostrar todos os numeros pares de 1 a 10
//        int i = 0;

//        while(i <= 10){
//            IO.println(i);
//            i += 2;
//        }
//
////        mostrar todos os numeros impares de 1 a 10
////        int i = 1;
//
//        while(i <= 10){
//            IO.println(i);
//            i += 2;
//        }



//        ARRAY

//        List<String> nomes = new ArrayList();
//
//        nomes.add("Arthur");
//        nomes.add("Medina");
//        nomes.add("Gonçalves");
//
//        IO.println(nomes);
//        IO.println(nomes.get(2));


//        crie outra classe
//        solicitar entrada um numero qualquer
//        na array e depois mostrar

//        List<Integer> numeros = new ArrayList();
//        Scanner sc = new Scanner(System.in);
//
//        IO.println("Digite um número:");
//        int num = sc.nextInt();
//
//        numeros.add(num);
//
//        IO.println("Seu número: " + numeros);





//        List<Integer> numeros = new ArrayList();
//
//        numeros.add(5);
//        numeros.add(2);
//        numeros.add(3);

//        for (int i = 0; i < 5; i++) {
//        }
//
//        for (int num : numeros) {
//            IO.println(num);
//        }

//        Utilize o forEach para imprimir os numeros impares e pares

//        for (int num : numeros) {
//            IO.println(num);;
//        }



//        Solicite 2 números ao usuário adicione em uma lista e sempre
//        mostre a soma dos números

        Scanner sc = new Scanner(System.in);

        IO.println("Digite o primeiro número: ");
        int num1 = Integer.parseInt(sc.next());
        IO.println("Digite o segundo número: ");
        int num2 = Integer.parseInt(sc.next());

        List<Integer> numeros = new ArrayList();
        numeros.add(num1);
        numeros.add(num2);

        IO.println(numeros.get(0) + numeros.get(1));


    }
}
