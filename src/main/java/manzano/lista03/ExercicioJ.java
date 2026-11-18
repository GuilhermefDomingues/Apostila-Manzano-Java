package manzano.lista03;

import java.util.Scanner;

public class ExercicioJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        int quantidade = 0;

        System.out.print("Digite um valor: ");
        double numero = sc.nextDouble();

        while (numero >= 0) {

            soma += numero;
            quantidade++;

            System.out.print("Digite outro valor: ");
            numero = sc.nextDouble();
        }

        if (quantidade > 0) {
            double media = soma / quantidade;

            System.out.println("Soma: " + soma);
            System.out.println("Média: " + media);
            System.out.println("Quantidade: " + quantidade);
        } else {
            System.out.println("Nenhum valor positivo foi informado.");
        }
    }
}
