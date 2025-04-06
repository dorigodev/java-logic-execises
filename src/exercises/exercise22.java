package exercises;

import java.util.Scanner;

public class exercise22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = scanner.nextInt();
        System.out.println("Digite outro numero: ");
        int num2 = scanner.nextInt();
        int resultado = num / num2 ;
        int resto = num % num2;
        System.out.println("Resultado: " + resultado + " Resto: " + resto);


    }
}
