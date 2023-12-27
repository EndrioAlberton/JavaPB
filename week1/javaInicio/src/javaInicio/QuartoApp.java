package javaInicio;

import java.util.Scanner;

public class QuartoApp {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero, horas;
	    double valorHora, salario;

	    System.out.println("Informe o numero do funcionario: ");
	    numero = sc.nextInt();
	    System.out.println("Informe as horas de trabalho: ");
	    horas = sc.nextInt();
	    System.out.println("Informe o valor da hora: ");
	    valorHora = sc.nextDouble();

	    salario = valorHora * horas;

	    System.out.println("Numero do funcionario = " + numero);
	    System.out.printf("Salario = R$ %.2f%n", salario);
		
		sc.close();
	}

}
