package exercises;

import java.util.Scanner;

/*
* 22 - Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem,
*  sabendo que o carro faz 12km com um litro. Deve-se fornecer ao usuário
*  o tempo que será gasto na viagem a sua velocidade média,
* distância percorrida e a quantidade de litros utilizados para fazer a viagem.

Fórmula: distância = tempo x velocidade.

            litros usados = distância / 12.*/
public class exercise24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tempo em Horas: ");
        double tempo = sc.nextDouble();
        System.out.println("Digite a velocidade media em KM/h: ");
        double velocidade = sc.nextDouble();

        double distancia = tempo * velocidade;
        double litrosUsados = distancia / 12;

        System.out.println("Tempo de viagem: " + tempo + " horas");
        System.out.println("Velocidade média: " + velocidade + " km/h");
        System.out.println("Distancia: " + distancia + " km");
        System.out.printf("Litros de combustível usados: %.2f L%n", litrosUsados);



    }
}
