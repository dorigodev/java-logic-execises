package exercises;
/*
* Faça um algoritmo que leia dois valores inteiros A e B,
*  se os valores de A e B forem iguais, deverá somar os dois valores,
 * */


import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args) {
        System.out.println("Digit fist number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println("Digit second number: ");
        int number2 = sc.nextInt();
        if (number == number2) {
            System.out.println("Os dois valores são iguais e a soma deles é: ");
            System.out.println(number + number2);
        } else {
            System.out.println("Os dois valores não são iguais");
        }

    }
}
