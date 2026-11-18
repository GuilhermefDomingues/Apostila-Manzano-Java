package manzano.lista02;

import java.util.Scanner;

public class ExercicioB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if (numero < 0) {
            numero = numero * -1;
        }

        System.out.println(numero);
    }
}
