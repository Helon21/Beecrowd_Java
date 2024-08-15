package ex026;

import java.util.Scanner;

public class Lanche {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigo, qtdeItem;

        codigo = sc.nextInt();
        qtdeItem = sc.nextInt();


        switch (codigo){
            case 1:
                System.out.printf("Total: R$ %.2f\n", qtdeItem * 4.00);
                break;
            case 2:
                System.out.printf("Total: R$ %.2f\n", qtdeItem * 4.50);
                break;
            case 3:
                System.out.printf("Total: R$ %.2f\n", qtdeItem * 5.00);
                break;
            case 4:
                System.out.printf("Total: R$ %.2f\n", qtdeItem * 2.00);
                break;
            case 5:
                System.out.printf("Total: R$ %.2f\n", qtdeItem * 1.50);
                break;
        }
    }
}
