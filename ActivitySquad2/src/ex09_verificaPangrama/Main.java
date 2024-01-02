package ex09_verificaPangrama;

// 9. Implemente um programa que determine se uma string é umpangrama (contém todas as letras do alfabeto).

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string para verificar se é um pangrama:");
        String texto = scanner.nextLine();

        if (verificarPangrama(texto)) {
            System.out.println("A string é um pangrama.");
        } else {
            System.out.println("A string não é um pangrama.");
        }

        scanner.close();
    }

    private static boolean verificarPangrama(String texto) {
        boolean[] letrasPresentes = new boolean[26]; // Array para armazenar se cada letra está presente
        int index;

        for (int i = 0; i < texto.length(); i++) {
            char ch = texto.charAt(i);
            if ('A' <= ch && ch <= 'Z') {
                index = ch - 'A';
            } else if ('a' <= ch && ch <= 'z') {
                index = ch - 'a';
            } else {
                continue; // Ignora caracteres que não são letras
            }
            letrasPresentes[index] = true;
        }

        // Verifica se todas as letras do alfabeto estão presentes
        for (boolean letraPresente : letrasPresentes) {
            if (!letraPresente) {
                return false;
            }
        }
        return true;
    }
}

