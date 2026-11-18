package manzano.lista01;

import java.util.Scanner;

public class ExercicioG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println("A + B = " + (a + b));
        System.out.println("A * B = " + (a * b));

        System.out.println("A + C = " + (a + c));
        System.out.println("A * C = " + (a * c));

        System.out.println("A + D = " + (a + d));
        System.out.println("A * D = " + (a * d));

        System.out.println("B + C = " + (b + c));
        System.out.println("B * C = " + (b * c));

        System.out.println("B + D = " + (b + d));
        System.out.println("B * D = " + (b * d));

        System.out.println("C + D = " + (c + d));
        System.out.println("C * D = " + (c * d));
    }
}
