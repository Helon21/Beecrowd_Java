package ex017;

import java.util.Scanner;

public class Distancia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int km, minutos;

        km = sc.nextInt();
        sc.close();

        minutos = km * 2;

        System.out.printf("%d minutos\n", minutos);
    }
}
