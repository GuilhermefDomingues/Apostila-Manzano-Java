package manzano.lista03;

public class ExercicioC {
    public static void main(String[] args) {

        int i = 1;
        int soma = 0;

        while (i <= 500) {

            if (i % 2 == 0) {
                soma += i;
            }

            i++;
        }

        System.out.println("Soma dos pares: " + soma);
    }
}
