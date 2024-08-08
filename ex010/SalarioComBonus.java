package ex010;

import java.util.Scanner;

public class SalarioComBonus {

    public static void main(String[] args) {

        final double COMISSAO = 0.15;

        Scanner sc = new Scanner(System.in);

        String nomeVendedor;
        double salarioFixo, vendasEfetuadas, total;

        nomeVendedor = sc.nextLine();
        salarioFixo = sc.nextDouble();
        vendasEfetuadas = sc.nextDouble();
        sc.close();

        total = vendasEfetuadas * COMISSAO + salarioFixo;

        System.out.printf("TOTAL = R$ %.2f\n", total);
    }
}