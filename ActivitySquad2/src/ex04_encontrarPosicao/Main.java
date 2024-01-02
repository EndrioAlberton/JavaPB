package ex04_encontrarPosicao;

import java.util.Scanner;
import java.util.ArrayList;

// 4. Implemente um programa que encontre a posição de um elemento específico em um vetor.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho da lista");
        int tamanho = getInteiro(scanner);

        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Informe os números da lista");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o número #" + (i + 1)+": ");
            lista.add(getInteiro(scanner));
        }

        System.out.println("Informe o número a ser buscado");
        int elemento = getInteiro(scanner);

        // indexOf procura a primeira ocorrência do elemento
        int posicao = lista.indexOf(elemento);

        if (posicao == -1) { // indexOf retorna -1 caso o elemento não seja encontrado
            System.out.println("Elemento não encontrado. Encerrando programa;");
        } else {
            System.out.println("Elemento está na posição " + posicao + " do vetor");
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

}

