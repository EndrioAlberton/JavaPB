package ex12_verificaNumero;

// 12.Crie um programa que determine se um número é positivo, negativo ou zero.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = getInteiro(scanner);

        verificarNumero(numero);

        scanner.close();
    }

    private static int getInteiro(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Valor inválido, digite um número.");
            scanner.next(); 
        }
        return scanner.nextInt();
    }

    private static void verificarNumero(int numero) {
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
    }
}



