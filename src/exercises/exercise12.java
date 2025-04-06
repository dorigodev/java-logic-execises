package exercises;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/*
*  Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago,
*  conforme a escolha da forma de pagamento pelo comprador
*  e imprima na tela o valor final do produto a ser pago.
*  Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
   Tabela de Código de Condições de Pagamento

    1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
    2 - À Vista no cartão de crédito, recebe 10% de desconto
    3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
    4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%*/
public class exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        BigDecimal price = new BigDecimal(sc.next());
        System.out.println("Qual forma de pagamento você gostaria de utilizar?");
        System.out.println("1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto");
        System.out.println("2 - À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                BigDecimal percentual = new BigDecimal("0.15");
                BigDecimal desconto = price.multiply(percentual);
                BigDecimal valorfinal = price.subtract(desconto).setScale(2, RoundingMode.HALF_EVEN);
                System.out.println("Você recebeu 15% de desconto, e o valor final ficou em " + valorfinal);
                break;
                case 2:
                    BigDecimal percentual2 = new BigDecimal("0.10");
                    BigDecimal desconto2 = price.multiply(percentual2);
                    BigDecimal valorfinal2 = price.subtract(desconto2).setScale(2, RoundingMode.HALF_EVEN);
                    System.out.println("Você recebeu 10% de desconto, e o valor final ficou em " + valorfinal2);
                    break;
                    case 3:
                        System.out.println("Você não recebeu nenhum desconto, e o valor final ficou em " + price);
                        break;
                        case 4:
                            BigDecimal percentual3 = new BigDecimal("0.10");
                            BigDecimal acrescimo = price.multiply(percentual3);
                            BigDecimal valorfinal3 = price.add(acrescimo).setScale(2, RoundingMode.HALF_EVEN);
                            System.out.println("O Valor final terá um acrescimo de 10% de juros, e ficou em " + valorfinal3);
                            break;
        }

    }
}
