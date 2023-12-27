package vetores;

import java.util.Scanner;

public class maiorPosicao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int N = sc.nextInt();

        double[] numeros = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextDouble();
        }

        double maior = numeros[0];
        int posicaoMaior = 0;

        for (int i = 1; i < N; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
                posicaoMaior = i;
            }
        }

        System.out.println("Maior valor = " + maior);
        System.out.println("Posicao maior valor = " + posicaoMaior);

        sc.close();
    }
}
