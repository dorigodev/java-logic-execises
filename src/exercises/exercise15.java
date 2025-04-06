package exercises;
/*
* 15 - Faça um algoritmo que leia a data em que uma pessoa nasceu,
* imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
* consideração o ano com 365 dias e o mês com 30 dias.
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class exercise15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Digite a data de nascimento: ");
        String dataNascimento = sc.nextLine();

        LocalDate dataNascimentoLocalDate = LocalDate.parse(dataNascimento, dtf);
        LocalDate hoje = LocalDate.now();

        long diasVividos = ChronoUnit.DAYS.between(dataNascimentoLocalDate, hoje);
        long anos = diasVividos / 365;
        long meses = (diasVividos % 365) / 30;
        long dias = (diasVividos % 365) % 30;

        System.out.println("anos: " + anos + " meses: " + meses + " dias: " + dias);
    }
}
