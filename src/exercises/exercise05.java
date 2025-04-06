package exercises;

import java.util.Scanner;

/*
* Faça um algoritmo que leia o valor do
* salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse */
public class exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salário minimo atual: ");
        float sal = sc.nextFloat();

        System.out.println("Digite o seu salário atual: ");
        float se = sc.nextFloat();
        float resultado = Math.round(se/sal);

        System.out.println("Você ganha aproximadamente: " + resultado + " salários minimos");
    }
}
