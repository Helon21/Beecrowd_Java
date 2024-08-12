package ex024;

import java.util.Scanner;

public class FormulaBhaskara {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c, raiz1, raiz2, delta;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        sc.close();

        delta = Math.sqrt(Math.pow(b, 2) - (4 * a * c));

        if (a > 0 && delta > 0) {
            raiz1 = (-b + delta) / (2 * a);
            raiz2 = (-b - delta) / (2 * a);

            System.out.printf("R1 = %.5f\n", raiz1);
            System.out.printf("R2 = %.5f\n", raiz2);
        } else {
            System.out.println("Impossivel calcular");
        }
    }
}