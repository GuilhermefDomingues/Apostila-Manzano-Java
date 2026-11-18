package manzano.lista01;

import java.util.Scanner;

public class ExercicioI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int diferenca = a - b;
        int resultado = diferenca * diferenca;

        System.out.println("Resultado: " + resultado);
    }
}
