package exercises;

import java.util.Scanner;

/*
* 17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e
* calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
Fórmula: C = (5 * ( F-32) / 9)*/

public class exercise17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor em Fahrenheit: ");
        double valorFahrenheit = sc.nextDouble();
        double valorCelcius = (5*(valorFahrenheit - 32))/9;
        System.out.println("Valor do fahrenheit: " + valorFahrenheit);
        System.out.println("Valor do celcius: " + valorCelcius);
    }
}
