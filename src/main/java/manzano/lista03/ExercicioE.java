package manzano.lista03;

public class ExercicioE {
    public static void main(String[] args) {

        int expoente = 0;
        long resultado = 1;

        while (expoente <= 15) {

            System.out.println("3 ^ " + expoente + " = " + resultado);

            resultado *= 3;
            expoente++;
        }
    }
}
