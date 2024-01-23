package javaInicio;

import java.util.Scanner;

public class TerceiroApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, dif;

		System.out.println("Primeiro numero: ");
	    A = sc.nextInt();
		System.out.println("Segundo numero: ");
	    B = sc.nextInt();
		System.out.println("Terceiro numero: ");
	    C = sc.nextInt();
		System.out.println("Quarto numero: ");
	    D = sc.nextInt();

	    dif = A * B - C * D;

	    System.out.println("Diferenca = " + dif);	
		
		sc.close();
	}
}
