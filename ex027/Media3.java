package ex027;

import java.util.Locale;
import java.util.Scanner;

public class Media3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Locale.setDefault(new Locale("en", "US"));

        float nota1, nota2, nota3, nota4, notaExame, notaFinal, media;

        nota1 = sc.nextFloat();
        nota2 = sc.nextFloat();
        nota3 = sc.nextFloat();
        nota4 = sc.nextFloat();

        media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 4) + (nota4 * 1)) / 10;

        System.out.printf("Media: %.1f\n", media);

        if(media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if(media >= 5.0 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            notaExame = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", notaExame);
            notaFinal = (notaExame + media) / 2;
            if(notaFinal >= 5.0){
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", notaFinal);
        } else {
            System.out.println("Aluno reprovado.");
        }

        sc.close();
    }
}
