package ex10_mediaHarmonica;

// 10. Escreva um programa que calcule a média harmônica de uma lista denúmeros.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de números:");
        int tamanho = getInteiro(scanner);

        double[] numeros = new double[tamanho];

        System.out.println("Informe os números:");

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número #" + (i + 1) + ": ");
            numeros[i] = getDouble(scanner);
        }

        double mediaHarmonica = calcularMediaHarmonica(numeros);

        System.out.println("A média harmônica é: " + mediaHarmonica);

        scanner.close();
    }

    private static int getInteiro(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Valor inválido, digite um número:");
            scanner.next(); 
        }
        return scanner.nextInt();
    }

    private static double getDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Valor inválido, digite um número:");
            scanner.next(); 
        }
        return scanner.nextDouble();
    }

    private static double calcularMediaHarmonica(double[] numeros) {
        double somaInversos = 0.0;

        for (double numero : numeros) {
            somaInversos += 1 / numero; // Soma dos inversos dos números
        }

        return numeros.length / somaInversos; // Calcula a média harmônica
    }
}


