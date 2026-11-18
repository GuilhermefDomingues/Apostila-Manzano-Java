package manzano.lista02;

import java.util.Scanner;

public class ExercicioH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int maior = a;
        int menor = a;

        if (b > maior) maior = b;
        if (c > maior) maior = c;
        if (d > maior) maior = d;
        if (e > maior) maior = e;

        if (b < menor) menor = b;
        if (c < menor) menor = c;
        if (d < menor) menor = d;
        if (e < menor) menor = e;

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
