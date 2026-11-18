package manzano.lista03;

public class ExercicioG {
    public static void main(String[] args) {

        int anterior = 0;
        int atual = 1;
        int i = 1;

        while (i <= 15) {

            System.out.println(atual);

            int proximo = anterior + atual;

            anterior = atual;
            atual = proximo;

            i++;
        }
    }
}
