package exercises;
/*
* 18 - Francisco tem 1,50m e cresce 2 centímetros por ano,
*  enquanto Sara tem 1,10m e cresce 3 centímetros por ano.
*  Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários
*  para que Sara seja maior que Francisco.*/

import java.math.BigDecimal;
import java.math.RoundingMode;

public class exercise18 {
    public static void main(String[] args) {
        int tamanhoFranciscoEmCentimetros = 150;
        int tamanhoSaraEmCentimetros = 110;
        int contador = 0;

        while(tamanhoSaraEmCentimetros < tamanhoFranciscoEmCentimetros) {
            tamanhoSaraEmCentimetros+=3;
            tamanhoFranciscoEmCentimetros+=2;
            contador++;
        }

        System.out.println("Foi preciso de " + contador + " anos");

    }
}
