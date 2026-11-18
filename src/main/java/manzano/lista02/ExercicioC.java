package manzano.lista02;

import java.util.Scanner;

public class ExercicioC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;

        if (media >= 5) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno não aprovado");
        }

        System.out.println("Média: " + media);
    }
}
