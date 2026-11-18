package manzano.lista03;

import java.util.Scanner;

public class ExercicioI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidade = 1;
        long somaFatoriais = 0;

        while (quantidade <= 15) {

            System.out.print("Digite um número: ");
            int numero = sc.nextInt();

            int i = 1;
            long fatorial = 1;

            while (i <= numero) {
                fatorial *= i;
                i++;
            }

            somaFatoriais += fatorial;
            quantidade++;
        }

        System.out.println("Soma dos fatoriais: " + somaFatoriais);
    }
}
