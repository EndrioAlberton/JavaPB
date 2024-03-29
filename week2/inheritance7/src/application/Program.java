package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Shape;
import entities.Rectangle;
import entities.Circle;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Digite o número de formas: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Dados da Forma #" + i + ":");
			System.out.print("Retângulo ou Círculo (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
			Color color = Color.valueOf(sc.next());
			if (ch == 'r') {
			    System.out.print("Largura: ");
				double width = sc.nextDouble();
			    System.out.print("Altura: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			}
			else {
			    System.out.print("Raio: ");
			    double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("ÁREAS DAS FORMAS:");
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		sc.close();
	}
}