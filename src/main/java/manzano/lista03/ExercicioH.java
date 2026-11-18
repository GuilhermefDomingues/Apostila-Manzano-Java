package manzano.lista03;

public class ExercicioH {
    public static void main(String[] args) {

        int casa = 1;
        double graos = 1;
        double total = 0;

        while (casa <= 64) {

            total += graos;
            graos *= 2;

            casa++;
        }

        System.out.println("Total de grãos: " + total);
    }
}
