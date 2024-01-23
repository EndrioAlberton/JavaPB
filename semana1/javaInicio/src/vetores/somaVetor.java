package vetores;

import java.util.Scanner;

public class somaVetor{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int N = sc.nextInt();

        double[] numeros = new double[N];
        double soma = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextDouble();
            soma += numeros[i];
        }

        System.out.print("VALORES = ");
        for (double numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        System.out.printf("SOMA = %.2f%n", soma);

        if (N > 0) {
            double media = soma / N;
            System.out.printf("MEDIA = %.2f%n", media);
        } else {
            System.out.println("Não é possível calcular a média, nenhum número foi digitado.");
        }

        sc.close();
    }
}
