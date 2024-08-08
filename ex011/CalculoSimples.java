package ex011;

import java.util.Scanner;

public class CalculoSimples {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigoPeca, quantidadePecas, codigoPeca2;
        double valorPeca1, valorPeca2, quantidadePecas2, valorTotal;

        codigoPeca = sc.nextInt();
        quantidadePecas = sc.nextInt();
        valorPeca1 = sc.nextDouble();
        codigoPeca2 = sc.nextInt();
        quantidadePecas2 = sc.nextDouble();
        valorPeca2 = sc.nextDouble();
        sc.close();

        valorTotal = (quantidadePecas * valorPeca1) + (quantidadePecas2 * valorPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
    }
}
