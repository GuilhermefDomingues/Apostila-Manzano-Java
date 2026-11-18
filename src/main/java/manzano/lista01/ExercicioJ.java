package manzano.lista01;

import java.util.Scanner;

public class ExercicioJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cotação do dólar: ");
        double cotacao = sc.nextDouble();

        System.out.print("Quantidade de dólares: ");
        double dolares = sc.nextDouble();

        double reais = dolares * cotacao;

        System.out.println("Valor em reais: R$ " + reais);
    }
}
