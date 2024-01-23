package vetores;

import java.util.Scanner;

public class somaVetores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int N = sc.nextInt();

        int[] vetorA = new int[N];
        int[] vetorB = new int[N];
        int[] vetorS = new int[N];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < N; i++) {
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < N; i++) {
            vetorB[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < N; i++) {
        	vetorS[i] = vetorA[i] + vetorB[i];
            System.out.println(vetorS[i]);
        }

        sc.close();
    }
}
