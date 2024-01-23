package javaInicio;

import java.util.Scanner;

public class QuintaApp {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cod1, cod2, qtde1, qtde2;
        double precoUnitario1, precoUnitario2, total;

        System.out.print("Digite o código do primeiro produto: ");
        cod1 = sc.nextInt();
        System.out.print("Digite a quantidade do primeiro produto: ");
        qtde1 = sc.nextInt();
        System.out.print("Digite o preço unitário do primeiro produto: ");
        precoUnitario1 = sc.nextDouble();
        
        System.out.print("Digite o código do segundo produto: ");
        cod2 = sc.nextInt();
        System.out.print("Digite a quantidade do segundo produto: ");
        qtde2 = sc.nextInt();
        System.out.print("Digite o preço unitário do segundo produto: ");
        precoUnitario2 = sc.nextDouble();

        total = precoUnitario1 * qtde1 + precoUnitario2 * qtde2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
        
        sc.close();
    }

}
