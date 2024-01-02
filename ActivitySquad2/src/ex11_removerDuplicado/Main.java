package ex11_removerDuplicado;

// 11. Desenvolva um programa que remova os elementos duplicados de um vetor.

import java.util.ArrayList;
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

        int[] vetorSemDuplicatas = removerDuplicatas(vetor);

        System.out.println("Vetor sem elementos duplicados:");
        for (int num : vetorSemDuplicatas) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    private static int getInteiro(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Valor inválido. Digite um número:");
            scanner.next();
        }
        return scanner.nextInt();
    }

    // Função para remover elementos duplicados de um vetor
    private static int[] removerDuplicatas(int[] vetor) {
        ArrayList<Integer> listaSemDuplicatas = new ArrayList<>();

        for (int elemento : vetor) {
            // Adiciona o elemento à lista se ainda não estiver presente
            if (!listaSemDuplicatas.contains(elemento)) {
                listaSemDuplicatas.add(elemento);
            }
        }

        // Converter ArrayList de volta para um array de inteiros
        int[] resultado = new int[listaSemDuplicatas.size()];
        for (int i = 0; i < listaSemDuplicatas.size(); i++) {
            resultado[i] = listaSemDuplicatas.get(i);
        }

        return resultado;
    }
}


