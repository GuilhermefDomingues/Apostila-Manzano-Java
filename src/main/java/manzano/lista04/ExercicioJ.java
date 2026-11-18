package manzano.lista04;

import java.util.Scanner;

public class ExercicioJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dividendo: ");
        int dividendo = sc.nextInt();

        System.out.print("Divisor: ");
        int divisor = sc.nextInt();

        int resto = dividendo;
        int quociente = 0;

        do {
            resto -= divisor;
            quociente++;
        } while (resto >= divisor);

        System.out.println("Quociente: " + quociente);
        System.out.println("Resto: " + resto);
    }
}
