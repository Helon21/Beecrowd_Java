package ex009;

import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroFuncionario, horasTrabalhadas;
        double valorPorHora, salario;

        numeroFuncionario = sc.nextInt();
        horasTrabalhadas = sc.nextInt();
        valorPorHora = sc.nextDouble();
        sc.close();

        salario = valorPorHora * horasTrabalhadas;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}
