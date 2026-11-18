package manzano.lista01;

import java.util.Scanner;

public class ExercicioB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Temperatura em Fahrenheit: ");
        double f = sc.nextDouble();

        double c = (f - 32) * 5 / 9;

        System.out.println("Celsius: " + c);
    }
}
