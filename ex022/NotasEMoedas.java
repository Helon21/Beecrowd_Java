package ex022;

import java.util.Scanner;

public class NotasEMoedas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float dinheiroTotal;

        dinheiroTotal = sc.nextFloat();
        sc.close();

        System.out.println("NOTAS:");
        System.out.printf("%.0f nota(s) de R$ 100.00\n", Math.floor(dinheiroTotal / 100));
        dinheiroTotal = dinheiroTotal % 100;
        System.out.printf("%.0f nota(s) de R$ 50.00\n", Math.floor(dinheiroTotal / 50));
        dinheiroTotal = dinheiroTotal % 50;
        System.out.printf("%.0f nota(s) de R$ 20.00\n", Math.floor(dinheiroTotal / 20));
        dinheiroTotal = dinheiroTotal % 20;
        System.out.printf("%.0f nota(s) de R$ 10.00\n", Math.floor(dinheiroTotal / 10));
        dinheiroTotal = dinheiroTotal % 10;
        System.out.printf("%.0f nota(s) de R$ 5.00\n", Math.floor(dinheiroTotal / 5));
        dinheiroTotal = dinheiroTotal % 5;
        System.out.printf("%.0f nota(s) de R$ 2.00\n", Math.floor(dinheiroTotal / 2));
        dinheiroTotal = dinheiroTotal % 2;
        System.out.println("MOEDAS:");
        System.out.printf("%.0f moeda(s) de R$ 1.00\n", Math.floor(dinheiroTotal));
        dinheiroTotal = dinheiroTotal % 1;
        System.out.printf("%.0f moeda(s) de R$ 0.50\n", Math.floor(dinheiroTotal / 0.50));
        dinheiroTotal = (float) (dinheiroTotal % 0.50);
        System.out.printf("%.0f moeda(s) de R$ 0.25\n", Math.floor(dinheiroTotal / 0.25));
        dinheiroTotal = (float) (dinheiroTotal % 0.25);
        System.out.printf("%.0f moeda(s) de R$ 0.10\n", Math.floor(dinheiroTotal / 0.10));
        dinheiroTotal = (float) (dinheiroTotal % 0.10);
        System.out.printf("%.0f moeda(s) de R$ 0.05\n", Math.floor(dinheiroTotal / 0.05));
        dinheiroTotal = (float) (dinheiroTotal % 0.05);
        System.out.printf("%d moeda(s) de R$ 0.01\n", Math.round(dinheiroTotal / 0.01));
    }
}
