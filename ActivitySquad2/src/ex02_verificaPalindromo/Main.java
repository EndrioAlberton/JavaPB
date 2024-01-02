package ex02_verificaPalindromo;

import java.util.Scanner;

// 2.Crie um programa que determine se uma string é um palíndromo, ignorando espaços em branco e diferenciação entre maiúsculas e minúsculas.

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma palavra: ");
        String palavra = scanner.nextLine();

        if (ePalindromo(palavra)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        scanner.close();
    }

    private static boolean ePalindromo(String palavra) {
        // Removendo espaços e convertendo para minúsculas
        palavra = palavra.replaceAll("\\s+", "").toLowerCase();
        
        int tamanho = palavra.length();
        for (int i = 0; i < tamanho / 2; i++) {
            // Verifica caracteres opostos para determinar se é palíndromo
            if (palavra.charAt(i) == palavra.charAt(tamanho - i - 1)) {
                return true;
            }
        }
        return false;
    }
}

