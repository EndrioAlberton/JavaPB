package vetores;

import java.util.Scanner;

public class maisVelho {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int N = sc.nextInt();

        sc.nextLine(); // Limpar o buffer

        String[] nomes = new String[N];
        int[] idades = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Dados da " + (i + 1) + "ª pessoa:");
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            sc.nextLine(); // Limpar o buffer
        }

        int posicaoMaisVelha = 0;
        int idadeMaisVelha = idades[0];

        for (int i = 1; i < N; i++) {
            if (idades[i] > idadeMaisVelha) {
                idadeMaisVelha = idades[i];
                posicaoMaisVelha = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nomes[posicaoMaisVelha]);

        sc.close();
    }
}
