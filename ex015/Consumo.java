package ex015;

import java.util.Scanner;

public class Consumo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X;
        float Y, valorTotal;

        X = sc.nextInt();
        Y = sc.nextFloat();

        valorTotal = X / Y;

        System.out.printf("%.3f km/l", valorTotal);
    }
}
