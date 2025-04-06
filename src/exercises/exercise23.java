package exercises;
/*
* 21 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor.
* As informações fornecidas serão: valor da hora aula,
* número de aulas lecionadas no mês e percentual de desconto do INSS.
* Imprima na tela o salário líquido final.

 */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class exercise23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da hora aula: ");
        BigDecimal valorHoraAula = new BigDecimal(sc.nextLine());
        System.out.println("Digite o numero de aulas lecionadas: ");
        BigDecimal aulas = new BigDecimal(sc.nextLine());
        System.out.println("Digite o percentual de desconto do INSS: ");
        BigDecimal desconto = new BigDecimal(sc.nextLine());

        BigDecimal valorBruto = valorHoraAula.multiply(aulas);
        BigDecimal valorDesconto = desconto.divide(new BigDecimal(100), 4, RoundingMode.HALF_UP).multiply(valorBruto);
        BigDecimal resultado = valorBruto.subtract(valorDesconto);
        resultado = resultado.setScale(2, RoundingMode.HALF_UP);
        System.out.println("O Professor vai ganhar " + resultado + " reais liquido");


    }
}
