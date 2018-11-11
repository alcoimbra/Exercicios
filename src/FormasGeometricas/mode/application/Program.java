package FormasGeometricas.mode.application;

import FormasGeometricas.mode.entity.AbstractShape;
import FormasGeometricas.mode.entity.Circle;
import FormasGeometricas.mode.entity.Rectangle;
import FormasGeometricas.mode.enums.Color;

public class Program {
	public static void main(String[] args) {
		AbstractShape s1 = new Circle(Color.BLACK, 2.0);
		AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);
		
		System.out.println("Circle Color: " + s1.getColor());
		System.out.println("Circle Area: " + String.format("%.3f", s1.area()));
		System.out.println("Rectangle Color: " + s2.getColor());
		System.out.println("Rectangle Area: " + String.format("%.3f", s2.area()));
	}
}