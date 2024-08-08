package ex002;

import java.util.Scanner;

public class ExtremamenteBasico {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B;

        A = sc.nextInt();
        B = sc.nextInt();
        sc.close();

        int X = A + B;

        System.out.println("X = " + X);

    }

}
