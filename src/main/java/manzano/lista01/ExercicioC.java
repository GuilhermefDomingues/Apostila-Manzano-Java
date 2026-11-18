package manzano.lista01;

import java.util.Scanner;

public class ExercicioC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Raio: ");
        double raio = sc.nextDouble();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        double volume = Math.PI * raio * raio * altura;

        System.out.println("Volume: " + volume);
    }
}
