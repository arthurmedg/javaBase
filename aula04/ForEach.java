package aula04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForEach {
    static void main() {

//        List<Integer> numeros = new ArrayList();
////
//        numeros.add(5);
//        numeros.add(2);
//        numeros.add(3);


//      Utilize o forEach para imprimir os numeros impares e pares

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
