package ex07_somaAlgarismos;

// 7. Crie um programa que calcule a soma dos dígitos de um número usando um loop.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para calcular a soma dos dígitos:");
        int numero = getInteiro(scanner);

        int somaDigitos = calcularSomaDigitos(numero);

        System.out.println("A soma dos dígitos de " + numero + " é: " + somaDigitos);

        scanner.close();
    }

    private static int getInteiro(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Valor inválido, digite um número.");
            scanner.next(); 
        }
        return scanner.nextInt();
    }

    private static int calcularSomaDigitos(int numero) {
        int soma = 0;

        while (numero != 0) {
            soma += numero % 10; // Obtém o último dígito e adiciona à soma
            numero /= 10; // Remove o último dígito do número
        }

        return soma;
    }
}