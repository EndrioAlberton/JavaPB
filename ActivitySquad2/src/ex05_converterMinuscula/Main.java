package ex05_converterMinuscula;

import java.util.Scanner;

// 5. Escreva um programa que converta uma string para letras minúsculas.

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string:");
        String input = scanner.nextLine();

        if (input.trim().isEmpty()) {
            System.out.println(" A string está vazia. Por favor, digite uma string válida.");
        } else {
            String lowercaseString = input.toLowerCase();
            System.out.println("String em letras minúsculas: " + lowercaseString);
        }

        scanner.close();
    }
}
