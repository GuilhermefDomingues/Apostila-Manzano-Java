package manzano.lista03;

import java.util.Scanner;

public class ExercicioF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Base: ");
        int base = sc.nextInt();

        System.out.print("Expoente: ");
        int expoente = sc.nextInt();

        int i = 0;
        long resultado = 1;

        while (i < expoente) {
            resultado *= base;
            i++;
        }

        System.out.println("Resultado: " + resultado);
    }
}
