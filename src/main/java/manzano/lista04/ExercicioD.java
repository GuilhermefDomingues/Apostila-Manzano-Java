package manzano.lista04;

public class ExercicioD {
    public static void main(String[] args) {

        int casa = 1;
        double graos = 1;
        double total = 0;

        do {
            total += graos;
            graos *= 2;
            casa++;
        } while (casa <= 64);

        System.out.println("Total de grãos: " + total);
    }
}
