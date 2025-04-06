package exercises;

import java.util.Scanner;

/*
* Faça um algoritmo que leia três notas obtidas por um aluno,
* e imprima na tela a média das notas
* */
public class exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a nota nota: ");
        double nota3 = sc.nextDouble();
        double media = (nota+nota2+nota3)/3;
        System.out.println("a média do aluno é " + media);
    }
}
