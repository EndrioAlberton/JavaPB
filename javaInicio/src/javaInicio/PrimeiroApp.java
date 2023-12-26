package javaInicio;

import java.util.Scanner;

public class PrimeiroApp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int A, B, soma;

		System.out.println("Primeiro numero: ");
		A = sc.nextInt();
		System.out.println("Segundo numero: ");
		B = sc.nextInt();

		soma = A + B;

		System.out.println("SOMA = " + soma);

		sc.close();
		
	}
}
