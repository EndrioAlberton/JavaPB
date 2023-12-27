package vetores;

import java.util.Scanner;

public class abaixoDaMedia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int N = sc.nextInt();

        double[] vetor = new double[N];
        double soma = 0;

        System.out.println("Digite os números do vetor:");
        for (int i = 0; i < N; i++) {
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }

        double media = soma / N;
        System.out.printf("Media do vetor = %.3f%n", media);

        System.out.println("Elementos abaixo do vetor:");
        for (int i = 0; i < N; i++) {
            if (vetor[i] < media) {
                System.out.printf("%.1f%n", vetor[i]);
            }
        }

        sc.close();
    }
}
