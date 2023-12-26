package javaInicio;

import java.util.Scanner;

public class SextoApp {
	
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	
	        double A, B, C;
	        final double PI = 3.14159;
	
	        A = sc.nextDouble();
	        B = sc.nextDouble();
	        C = sc.nextDouble();
	
	        double areaTriangulo = (A * C) / 2;
	        System.out.printf("%.3f%n", areaTriangulo);
	
	        double areaCirculo = PI * Math.pow(C, 2);
	        System.out.printf("%.3f%n", areaCirculo);
	
	        double areaTrapezio = ((A + B) * C) / 2;
	        System.out.printf("%.3f%n", areaTrapezio);
	
	        double areaQuadrado = B * B;
	        System.out.printf("%.3f%n", areaQuadrado);
	
	        double areaRetangulo = A * B;
	        System.out.printf("%.3f%n", areaRetangulo);
	
	        sc.close();
	    }
}
