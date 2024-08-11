package ex020;

import java.util.Scanner;

public class ConversaoTempo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int qtdeHoras, qtdeMinutos, totalSegundos;

        totalSegundos = sc.nextInt();

        qtdeHoras = totalSegundos / 3600;
        totalSegundos = totalSegundos % 3600;

        qtdeMinutos = totalSegundos / 60;
        totalSegundos = totalSegundos % 60;

        sc.close();

        System.out.printf("%d:%d:%d\n", qtdeHoras, qtdeMinutos, totalSegundos);
    }
}