package ex06_quadradoPerfeito;

import java.util.Scanner;

// 6. Desenvolva um programa que verifique se um número é um quadrado perfeito.

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para verificar se é um quadrado perfeito:");
        int numero = getInteiro(scanner);

        if (verificarQuadradoPerfeito(numero)) {
            System.out.println(numero + " é um quadrado perfeito.");
        } else {
            System.out.println(numero + " não é um quadrado perfeito.");
        }

        scanner.close();
    }

    private static int getInteiro(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Valor inválido, digite um número.");
            scanner.next(); 
        }
        return scanner.nextInt();
    }

    private static boolean verificarQuadradoPerfeito(int numero) {
        // Verifica se a raiz quadrada do número é um número inteiro
        double raizQuadrada = Math.sqrt(numero);
        return raizQuadrada == Math.floor(raizQuadrada);
    }
}
