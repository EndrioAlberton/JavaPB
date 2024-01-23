package vetores;

import java.util.Scanner;

public class alturas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão listadas? ");
        int N = sc.nextInt();

        String[] nomes = new String[N];
        int[] idades = new int[N];
        double[] alturas = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Dados da " + (i + 1) + "ª pessoa:");
            System.out.print("Nome: ");
            sc.nextLine(); // Limpar o buffer do teclado
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        double somaDasAlturas = 0;
        int contadorMenosDe16Anos = 0;

        for (int i = 0; i < N; i++) {
            somaDasAlturas += alturas[i];
            if (idades[i] < 16) {
                contadorMenosDe16Anos++;
            }
        }

        double mediaDasAlturas = somaDasAlturas / N;
        double percentualMenosDe16Anos = (double) contadorMenosDe16Anos * 100 / N;

        System.out.printf("Altura média: %.2f%n", mediaDasAlturas);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentualMenosDe16Anos);

        for (int i = 0; i < N; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}
