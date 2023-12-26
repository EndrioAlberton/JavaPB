package vetores;

import java.util.Scanner;

public class dadosPessoas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão apresentados? ");
		int N = sc.nextInt();

		double[] alturas = new double[N];
		char[] generos = new char[N];

		for (int i = 0; i < N; i++) {
			System.out.println("Altura da " + (i + 1) + "ª pessoa:");
			alturas[i] = sc.nextDouble();
			System.out.println("Gênero da " + (i + 1) + "ª pessoa (M/F):");
			generos[i] = sc.next().charAt(0);
		}

		double menorAltura = alturas[0];
		double maiorAltura = alturas[0];
		double somaAlturasMulheres = 0;
		int numHomens = 0;
		int numMulheres = 0;

		for (int i = 0; i < N; i++) {
			if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}
			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			}
			if (generos[i] == 'M') {
				numHomens++;
			} else {
				somaAlturasMulheres += alturas[i];
				numMulheres++;
			}
		}

		double mediaAlturasMulheres = numMulheres > 0 ? somaAlturasMulheres / numMulheres : 0;

		System.out.println("Menor altura = " + menorAltura);
		System.out.println("Maior altura = " + maiorAltura);
		System.out.printf("Média das alturas das mulheres = %.2f%n", mediaAlturasMulheres);
		System.out.println("Número de homens = " + numHomens);

		sc.close();
	}
}
