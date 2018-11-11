package ProblemaDoDiamante.application;

import ProblemaDoDiamante.device.ComboDevice;
import ProblemaDoDiamante.device.ConcretePrinter;
import ProblemaDoDiamante.device.ConcreteScanner;

public class Program {
	public static void main(String[] args) {
		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("My Letter");
		p.print("My Letter");
		
		System.out.println();
		ConcreteScanner s = new ConcreteScanner("2003");
		s.processDoc("My Email");
		System.out.println("Scan Result: " + s.scan());
		
		System.out.println();
		ComboDevice c = new ComboDevice("2081");
		c.processDoc("My Dissertation");
		c.print("My Dissertation");
		System.out.println("Scan Result: " + c.scan());
	}
}