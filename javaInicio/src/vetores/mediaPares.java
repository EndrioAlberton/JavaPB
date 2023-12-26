package vetores;

import java.util.Scanner;

public class mediaPares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int N = sc.nextInt();

        int[] vetor = new int[N];
        int somaPares = 0;
        int quantidadePares = 0;

        System.out.println("Digite os números do vetor:");
        for (int i = 0; i < N; i++) {
            vetor[i] = sc.nextInt();
            if (vetor[i] % 2 == 0) {
                somaPares += vetor[i];
                quantidadePares++;
            }
        }

        if (quantidadePares > 0) {
            double mediaPares = (double) somaPares / quantidadePares;
            System.out.printf("MEDIA DOS PARES = %.1f%n", mediaPares);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }

        sc.close();
    }
}