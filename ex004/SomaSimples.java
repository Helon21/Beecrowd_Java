package ex004;

import java.util.Scanner;

public class SomaSimples {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, SOMA;

        A = sc.nextInt();
        B = sc.nextInt();
        sc.close();

        SOMA = A + B;

        System.out.println("SOMA = " + SOMA);

    }
}
