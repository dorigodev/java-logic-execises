package exercises;

import java.util.Scanner;

/*
* Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
* */
public class exercise06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor");
        double value = sc.nextDouble();
        value = value + (value*0.05);

        System.out.println("o valor acrescido com 5% é: " +value);

    }
}
