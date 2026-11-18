package manzano.lista01;

import java.util.Scanner;

public class ExercicioH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double comprimento = sc.nextDouble();
        double largura = sc.nextDouble();
        double altura = sc.nextDouble();

        double volume = comprimento * largura * altura;

        System.out.println("Volume: " + volume);
    }
}
