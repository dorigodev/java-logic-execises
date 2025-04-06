package exercises;

import java.util.Scanner;

/*Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.*/
public class exercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        System.out.println("O Sucessor de " + number + " é " + (number+1));
        System.out.println("O Antecessor de " + number + " é " + (number-1));

    }
}
