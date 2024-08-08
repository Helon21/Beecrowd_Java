package ex012;

import java.util.Scanner;

public class Esfera {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double PI = 3.14159;

        double raio, volume;

        raio = sc.nextDouble();
        sc.close();

        volume = (4.0/3) * PI * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f", volume);
    }
}