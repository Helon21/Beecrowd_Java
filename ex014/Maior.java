package ex014;

import java.util.Scanner;

public class Maior {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, maiorAB;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        maiorAB = (a + b + Math.abs(a-b)) / 2;

        if(maiorAB > c) {
            System.out.printf("%d eh o maior\n", maiorAB);
        } else {
            System.out.printf("%d eh o maior\n", c);
        }
    }
}