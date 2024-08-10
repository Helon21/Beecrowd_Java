package ex018;

import java.util.Scanner;

public class GastoCombustivel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tempoViagem, velocidadeMedia;
        double qtdeLitros;

        tempoViagem = sc.nextInt();
        velocidadeMedia = sc.nextInt();

        qtdeLitros = (tempoViagem * velocidadeMedia) / 12.0;

        System.out.printf("%.3f\n", qtdeLitros);
    }
}