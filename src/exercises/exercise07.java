package exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
*Faça um algoritmo que leia três valores inteiros diferentes
*  e imprima na tela os valores em ordem decrescente.
* */
public class exercise07 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Digite primeiro valor: ");
        int value = input.nextInt();
        list.add(value);

        System.out.println("Digite segundo valor: ");
        value = input.nextInt();
        list.add(value);

        System.out.println("Digite terceiro valor: ");
        value = input.nextInt();
        list.add(value);
        System.out.println(list);
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

    }
}
