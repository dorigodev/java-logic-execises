package exercises;
/*
* Faça um algoritmo que leia dois valores booleanos (lógicos)
* e determine se ambos são VERDADEIRO ou FALSO.*/

import java.util.Scanner;

public class exercise07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor booleano ( true ou false) : ");
        boolean bool1 = sc.nextBoolean();

        System.out.println("Digite outro valor boleano: (true ou false) : ");
        boolean bool2 = sc.nextBoolean();

        if (bool1 & bool2){
            System.out.println("Os valores são iguais e verdadeiros");
        } else if (!bool1 && !bool2) {
            System.out.println("Os valores são iguais e falsos");
        } else {
            System.out.println("Os valores não são iguais");
        }


    }
}
