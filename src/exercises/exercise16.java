package exercises;

import java.util.Scanner;

public class exercise16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor pro primeiro lado do Triangulo: ");
        double valorA = sc.nextDouble();
        System.out.println("Digite o valor pro segundo  lado do Triangulo: ");
        double valorB = sc.nextDouble();
        System.out.println("Digite o valor pro terceiro lado do Triangulo: ");
        double valorC = sc.nextDouble();

        if (valorA == valorB && valorB == valorC) {
            System.out.println("Triângulo equilátero");
        } else if ((valorA == valorB && valorA != valorC) ||
                (valorA == valorC && valorA != valorB) ||
                (valorB == valorC && valorB != valorA)) {
            System.out.println("Triângulo isósceles");
        } else {
            System.out.println("Triângulo escaleno");
        }
    }
}
