package application;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class Main {

	public static void main(String[] args) {

		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("Minha carta");
		p.print("Minha carta");

		System.out.println();
		ConcreteScanner s = new ConcreteScanner("2003");
		s.processDoc("Meu e-mail");
		System.out.println("Resultado do scaneamento: " + s.scan());
		
		System.out.println();
		ComboDevice c = new ComboDevice("2081");
		c.processDoc("Minha dissertação");
		c.print("Minha dissertação");
		System.out.println("Resultado do scaneamento: " + c.scan());
	}
}
