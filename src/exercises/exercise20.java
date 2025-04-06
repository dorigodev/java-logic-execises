package exercises;

import java.util.Scanner;

public class exercise20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = scanner.nextInt();
        for (int i = 0; i < 11; i++) {
            System.out.println(i + " x " + num + " = " + (i * num));
        }
    }
}
