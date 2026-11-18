package manzano.lista01;

import java.util.Scanner;

public class ExercicioM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int soma = a + b + c;
        int resultado = soma * soma;

        System.out.println("Resultado: " + resultado);
    }
}
