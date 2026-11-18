package manzano.lista02;

import java.util.Scanner;

public class ExercicioG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (a % 2 == 0 && a % 3 == 0)
            System.out.println(a);

        if (b % 2 == 0 && b % 3 == 0)
            System.out.println(b);

        if (c % 2 == 0 && c % 3 == 0)
            System.out.println(c);

        if (d % 2 == 0 && d % 3 == 0)
            System.out.println(d);
    }
}
