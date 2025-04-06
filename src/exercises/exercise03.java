package exercises;
/*
* Faça um algoritmo que leia dois valores inteiros A e B,
* se os valores de A e B forem iguais, deverá somar os dois valores,
* caso contrário devera multiplicar A por B.  Ao final de qualquer um dos cálculos deve-se atribuir o
* resultado a uma variável C e
 * imprimir seu valor na tela.
*/


import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digit fist number: ");
        int A = sc.nextInt();

        System.out.println("Digit second number: ");
        int B = sc.nextInt();

        int C;
        if (A == B) {
            System.out.println("Os dois valores são iguais e a soma deles é: ");
            System.out.println(A + B);
        } else {
            C = A * B;
            System.out.println("Os dois valores não são iguais e a multiplicacao deles é:");
            System.out.println(C);
        }

    }
}
