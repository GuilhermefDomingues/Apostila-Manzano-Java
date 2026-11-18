package manzano.lista01;

import java.util.Scanner;

public class ExercicioL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int resultado = (a * a) + (b * b) + (c * c);

        System.out.println("Resultado: " + resultado);
    }
}
