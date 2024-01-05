package application;

import java.util.Scanner;
import services.PrintService;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();
        
        System.out.print("Quantos valores? ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            Integer valor = sc.nextInt();
            ps.addValue(valor);
        }

        ps.print();
        Integer x = ps.first();
        System.out.println("Primeiro: " + x);
        
        sc.close();
    }
}
