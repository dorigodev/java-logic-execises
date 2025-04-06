package exercises;

import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor A: ");
        String valorA = sc.nextLine();

        System.out.println("Digite o valor B: ");
        String valorB = sc.nextLine();

        var temp = valorA;
        valorA = valorB;
        valorB = temp;

        System.out.println("O valor A: " + valorA);
        System.out.println("O valor B: " + valorB);

    }
}
