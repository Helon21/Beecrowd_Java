package ex013;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double PI = 3.14159;

        double A, B, C, areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        sc.close();

        areaTrianguloRetangulo = (A * C) / 2;
        areaCirculo = PI * Math.pow(C, 2);
        areaTrapezio = (A + B) * C / 2;
        areaQuadrado = Math.pow(B, 2);
        areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f\n", areaTrianguloRetangulo);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);
    }
}
