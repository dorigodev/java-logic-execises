package exercises;

import java.util.Scanner;

/*
* 1 - Faça um algoritmo que leia os valores de A, B, C e
* em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
* */
public class exercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int num01 = input.nextInt();

        System.out.print("Enter a second number: ");
        int num02 = input.nextInt();

        System.out.print("Enter a third number: ");
        int num03 = input.nextInt();
        int soma = num01 + num02;

        System.out.println("A Soma de " + num01 + " + "+ num02 + " é " + soma);
        if (soma > num03) {
            System.out.println(soma + " é maior que " + num03);
        } if (soma < num03) {
            System.out.println(soma + " é menor que " + num03);
        } else {
            System.out.println(soma + "é igual a " + num03);
        }

    }
}
