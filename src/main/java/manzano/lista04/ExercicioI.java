package manzano.lista04;

import java.util.Scanner;

public class ExercicioI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int maior = numero;
        int menor = numero;

        String resposta;

        do {
            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }

            System.out.print("Deseja continuar? ");
            resposta = sc.next();

            if (resposta.equalsIgnoreCase("sim")) {
                System.out.print("Digite outro número: ");
                numero = sc.nextInt();
            }

        } while (resposta.equalsIgnoreCase("sim"));

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
