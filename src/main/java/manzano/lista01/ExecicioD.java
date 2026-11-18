package manzano.lista01;

import java.util.Scanner;

public class ExecicioD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tempo da viagem: ");
        double tempo = sc.nextDouble();

        System.out.print("Velocidade média: ");
        double velocidade = sc.nextDouble();

        double distancia = tempo * velocidade;
        double litrosUsados = distancia / 12;

        System.out.println("Velocidade: " + velocidade);
        System.out.println("Tempo: " + tempo);
        System.out.println("Distância: " + distancia);
        System.out.println("Litros usados: " + litrosUsados);
    }
}
