package vetores;

import java.util.Scanner;

public class negativos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? (máximo = 10): ");
        int N = sc.nextInt();

        int[] numeros = new int[N];
        int countNegativos = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();
            numeros[i] = numero;
            if (numero < 0) {
                countNegativos++;
            }
        }

        System.out.println("NÚMEROS NEGATIVOS:");

        if (countNegativos > 0) {
            for (int i = 0; i < N; i++) {
                if (numeros[i] < 0) {
                    System.out.println(numeros[i]);
                }
            }
        } else {
            System.out.println("Nenhum número negativo foi digitado.");
        }

        sc.close();
    }
}
