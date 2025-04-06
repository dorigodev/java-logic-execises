package exercises;
import java.util.Scanner;

/*
*   Faça um algoritmo que leia quatro notas obtidas por um aluno,
*   calcule a média das nota obtidas, imprima na tela o nome do aluno e
*   se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado
*   sua média final deve ser maior ou igual a 7.
*/
public class exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Nome do aluno");
        String nome = sc.nextLine();

        System.out.println("Digite a primeira nota do aluno");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota do aluno");
        double nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota do aluno");
        double nota3 = sc.nextDouble();

        System.out.println("Digite a quarta nota do aluno");
        double nota4 = sc.nextDouble();
        double resultado = (nota1+nota2+nota3+nota4)/4;

        if (resultado >= 7.00) {
            System.out.println("O Aluno " + nome + " obteve uma média de  "+ resultado +  " e foi aprovado!");
        } else{
            System.out.println("O Aluno " + nome + " obteve uma média de  "+ resultado +  " e foi reprovado!");
        }

    }
}
