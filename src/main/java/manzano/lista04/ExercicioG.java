package manzano.lista04;

public class ExercicioG {
    public static void main(String[] args) {

        int numero = 1;

        do {

            if (numero % 2 != 0) {

                int i = 1;
                long fatorial = 1;

                do {
                    fatorial *= i;
                    i++;
                } while (i <= numero);

                System.out.println(numero + "! = " + fatorial);
            }

            numero++;

        } while (numero <= 10);
    }
}
