package exercises;

import java.util.Scanner;

/*
*  13 - Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa
*  e se ela é maior ou menor de idade. */
public class exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();
        String resultado = (idade >= 18) ? "Você é maior de idade" : "Você é menor de idade";
        System.out.println("O seu nome é " + nome + " e "  + resultado);
    }
}
