package manzano.lista01;

import java.util.Scanner;

public class ExercicioK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cotação do dólar: ");
        double cotacao = sc.nextDouble();

        System.out.print("Quantidade de reais: ");
        double reais = sc.nextDouble();

        double dolares = reais / cotacao;

        System.out.println("Valor em dólares: " + dolares);
    }
}
