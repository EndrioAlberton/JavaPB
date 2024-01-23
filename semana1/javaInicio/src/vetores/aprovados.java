package vetores;

import java.util.Scanner;

public class aprovados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão apresentados? ");
        int N = sc.nextInt();

        sc.nextLine(); // Limpar o buffer

        String[] nomes = new String[N];
        double[] notas1 = new double[N];
        double[] notas2 = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "º aluno:");
            nomes[i] = sc.nextLine();
            notas1[i] = sc.nextDouble();
            notas2[i] = sc.nextDouble();
            sc.nextLine(); // Limpar o buffer
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < N; i++) {
            double media = (notas1[i] + notas2[i]) / 2.0;
            if (media >= 6.0) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}
