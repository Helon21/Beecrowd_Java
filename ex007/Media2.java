package ex007;

import java.util.Scanner;

public class Media2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double A, B, C, MEDIA;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        sc.close();

        if(A >= 0 && A <= 10.0 && B >= 0 && B <= 10.0 && C >= 0 && C <= 10.0) {
            MEDIA = ((A * 2) + (B * 3) + (C * 5)) / 10;
            System.out.printf("MEDIA = %.1f", MEDIA);
        } else {
            System.out.println("Erro: os valores tem que ser maiores do que 0 e menores do que 10");
        }
    }
}
