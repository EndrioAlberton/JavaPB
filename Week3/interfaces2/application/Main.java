package application;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;

public class Main {

	public static void main(String[] args) {

		AbstractShape s1 = new Circle(Color.PRETO, 2.0);
		AbstractShape s2 = new Rectangle(Color.BRANCO, 3.0, 4.0);
		
		System.out.println("Cor do circulo: " + s1.getColor());
		System.out.println("Area do circulo: " + String.format("%.3f", s1.area()));
		System.out.println("Cor do retangulo: " + s2.getColor());
		System.out.println("Area do retangulo: " + String.format("%.3f", s2.area()));
	}
}
