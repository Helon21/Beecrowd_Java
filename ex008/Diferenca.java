package ex008;

import java.util.Scanner;

public class Diferenca {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, C, D, DIFERENCA;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        sc.close();

        DIFERENCA = A * B - C * D;

        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}
