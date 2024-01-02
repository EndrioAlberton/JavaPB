package ex01_mediaGeometrica;

import java.util.Scanner;

// 1.Desenvolva um programa que calcule a média geométrica de uma lista de números.

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho = 0;

        System.out.print("Informe a quantidade de números: ");
        tamanho = getInteiro(scanner);

        double[] numeros = new double[tamanho];
        
        // Recebendo os valores e armazenando no array
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Informe o " + (i + 1) + "º número: ");
            numeros[i] = getDouble(scanner);
        }

        //Calculando a média geométrica
        double produto = 1;
        for (double numero : numeros) {
            produto *= numero;
        }

        double mediaGeometrica = Math.pow(produto, 1.0 / tamanho);

        System.out.println("Média geométrica = " + mediaGeometrica);

        scanner.close();
    }

    //Metodo verifica double e inteiro
    private static double getDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Valor inválido, digite um número.");
            scanner.next(); 
        }
        return scanner.nextDouble();
    }

    private static int getInteiro(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Valor inválido, digite um número.");
            scanner.next(); 
        }
        return scanner.nextInt();
    }
}

