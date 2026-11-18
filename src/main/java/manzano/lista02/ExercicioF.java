package manzano.lista02;

import java.util.Scanner;

public class ExercicioF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int aux;

        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }

        if (a > c) {
            aux = a;
            a = c;
            c = aux;
        }

        if (b > c) {
            aux = b;
            b = c;
            c = aux;
        }

        System.out.println(a + " " + b + " " + c);
    }
}
