package manzano.lista04;

public class ExercicioB {
    public static void main(String[] args) {

        int numero = 1;
        int soma = 0;

        do {
            if (numero % 2 == 0) {
                soma += numero;
            }

            numero++;
        } while (numero <= 500);

        System.out.println("Soma: " + soma);
    }
}
