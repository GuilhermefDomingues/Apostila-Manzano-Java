package manzano.lista02;

import java.util.Scanner;

public class ExercicioL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Sexo (M/F): ");
        String sexo = sc.nextLine();

        if (sexo.equalsIgnoreCase("M")) {
            System.out.println("Ilmo Sr. " + nome);
        } else if (sexo.equalsIgnoreCase("F")) {
            System.out.println("Ilma Sra. " + nome);
        }
    }
}
