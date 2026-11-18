package manzano.lista03;

import java.util.Scanner;

public class ExercicioL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double areaTotal = 0;
        String resposta = "sim";

        while (resposta.equalsIgnoreCase("sim")) {

            System.out.print("Nome do cômodo: ");
            String comodo = sc.next();

            System.out.print("Largura: ");
            double largura = sc.nextDouble();

            System.out.print("Comprimento: ");
            double comprimento = sc.nextDouble();

            double area = largura * comprimento;

            System.out.println("Área de " + comodo + ": " + area);

            areaTotal += area;

            System.out.print("Deseja adicionar outro cômodo? ");
            resposta = sc.next();
        }

        System.out.println("Área total: " + areaTotal);
    }
}
