package ex021;

import java.util.Scanner;

public class IdadeEmDias {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idadeEmDias, ano, mes;

        idadeEmDias = sc.nextInt();

        ano = idadeEmDias / 365;
        idadeEmDias = idadeEmDias % 365;

        mes = idadeEmDias / 30;
        idadeEmDias = idadeEmDias % 30;

        sc.close();

        System.out.printf("%d ano(s)\n", ano);
        System.out.printf("%d mes(es)\n", mes);
        System.out.printf("%d dia(s)\n", idadeEmDias);
    }
}
