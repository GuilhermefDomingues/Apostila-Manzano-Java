package manzano.lista02;

import java.util.Scanner;

public class ExercicioE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("A deve ser diferente de zero.");
        } else {
            double delta = (b * b) - (4 * a * c);

            if (delta < 0) {
                System.out.println("Não existem raízes reais.");
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("X1: " + x1);
                System.out.println("X2: " + x2);
            }
        }
    }
}
