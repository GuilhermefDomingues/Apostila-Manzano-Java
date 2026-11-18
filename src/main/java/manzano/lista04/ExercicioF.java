package manzano.lista04;

import java.util.Scanner;

public class ExercicioF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        int quantidade = 0;
        double numero;

        do {
            System.out.print("Digite um número: ");
            numero = sc.nextDouble();

            if (numero >= 0) {
                soma += numero;
                quantidade++;
            }

        } while (numero >= 0);

        if (quantidade > 0) {
            double media = soma / quantidade;

            System.out.println("Soma: " + soma);
            System.out.println("Média: " + media);
            System.out.println("Quantidade: " + quantidade);
        } else {
            System.out.println("Nenhum valor positivo informado.");
        }
    }
}
