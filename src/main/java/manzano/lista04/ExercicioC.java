package manzano.lista04;

public class ExercicioC {
    public static void main(String[] args) {

        int numero = 1;

        do {
            if (numero % 4 == 0) {
                System.out.println(numero);
            }

            numero++;
        } while (numero < 200);
    }
}
