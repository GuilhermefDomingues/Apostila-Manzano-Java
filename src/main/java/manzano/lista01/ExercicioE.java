package manzano.lista01;

import java.util.Scanner;

public class ExercicioE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor: ");
        double valor = sc.nextDouble();

        System.out.print("Taxa: ");
        double taxa = sc.nextDouble();

        System.out.print("Tempo: ");
        double tempo = sc.nextDouble();

        double prestacao = valor + (valor * taxa / 100) * tempo;

        System.out.println("Prestação: " + prestacao);
    }
}
