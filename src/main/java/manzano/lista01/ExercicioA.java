package manzano.lista01;

import java.util.Scanner;

public class ExercicioA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Temperatura em Celsius: ");
        double c = sc.nextDouble();

        double f = (9 * c + 160) / 5;

        System.out.println("Fahrenheit: " + f);
    }
}