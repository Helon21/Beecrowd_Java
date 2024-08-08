package ex006;

import java.util.Scanner;

public class Media1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double A, B, MEDIA;

        A = sc.nextDouble();
        B = sc.nextDouble();
        sc.close();

        MEDIA = (A >= 0 && B >= 0 && A <= 10.0 && B <= 10.0) ? (A * 3.5 + B * 7.5) / 11 : errorDefault();

        System.out.printf("MEDIA = %.5f\n", MEDIA);

    }

    private static double errorDefault(){
        System.out.println("Erro: os valores tem que ser maiores do que 0 e menores do que 10");
        return -1;
    }
}
