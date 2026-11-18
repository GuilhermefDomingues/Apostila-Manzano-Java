package manzano.lista02;

import java.util.Scanner;

public class ExercicioJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if (numero >= 1 && numero <= 9) {
            System.out.println("O valor está na faixa permitida");
        } else {
            System.out.println("O valor está fora da faixa permitida");
        }
    }
}
