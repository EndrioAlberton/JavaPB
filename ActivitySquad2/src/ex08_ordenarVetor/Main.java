package ex08_ordenarVetor;

// 8. Elabore um programa que ordene um vetor em ordem decrescente.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor:");
        int tamanho = getInteiro(scanner);

        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o elemento #" + (i + 1) + ": ");
            vetor[i] = getInteiro(scanner);
        }

        bubbleSortDecrescente(vetor);

        System.out.println("Vetor ordenado em ordem decrescente:");
        for (int num : vetor) {
            System.out.print(num + " ");
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

    private static void bubbleSortDecrescente(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] < vetor[j + 1]) {
                    // Troca os elementos se estiverem fora de ordem (decrescente)
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }
}
