package manzano.lista04;

import java.util.Scanner;

public class ExercicioE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidade = 1;
        long somaFatoriais = 0;

        do {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();

            long fatorial = 1;
            int i = 1;

            do {
                fatorial *= i;
                i++;
            } while (i <= numero);

            somaFatoriais += fatorial;
            quantidade++;

        } while (quantidade <= 15);

        System.out.println("Soma dos fatoriais: " + somaFatoriais);
    }
}
