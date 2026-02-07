package aula04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array {
    static void main() {
        List<String> nomes = new ArrayList();

        nomes.add("Arthur");
        nomes.add("Medina");
        nomes.add("Gonçalves");

        IO.println(nomes);
        IO.println(nomes.get(2));


//        crie outra classe
//        solicitar entrada um numero qualquer
//        na array e depois mostrar

        List<Integer> numeros = new ArrayList();
        Scanner sc = new Scanner(System.in);

        IO.println("Digite um número:");
        int num = sc.nextInt();

        numeros.add(num);

        IO.println("Seu número: " + numeros);
    }
}
