package exercises;

/*
* Faça um algoritmo para receber um número
* qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
*
* */

import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {
        System.out.println("Digit a number:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
        if (number > 0) {
            System.out.println(number + " is positive");
        } else {
            System.out.println(number + " is negative");
        }
    }
}
