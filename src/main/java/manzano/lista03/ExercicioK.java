package manzano.lista03;

public class ExercicioK {
    public static void main(String[] args) {

        int numero = 1;

        while (numero <= 10) {

            if (numero % 2 != 0) {

                int i = 1;
                long fatorial = 1;

                while (i <= numero) {
                    fatorial *= i;
                    i++;
                }

                System.out.println(numero + "! = " + fatorial);
            }

            numero++;
        }
    }
}
