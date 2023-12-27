package javaInicio;

import java.util.Scanner;

public class SegundoApp {

    public static void main(String[] args) {
        
        double pi = 3.14159, raio, area;  
                
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o valor do raio: ");
        raio = sc.nextDouble();
        area =  pi * (raio * raio);
        System.out.printf("Area = %.4f\n", area); 
        
        sc.close();
    }
}
