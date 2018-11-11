package course;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner mostrar = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = mostrar.nextDouble();
		x.b = mostrar.nextDouble();
		x.c = mostrar.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = mostrar.nextDouble();
		y.b = mostrar.nextDouble();
		y.c = mostrar.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f\n", areaX);
		System.out.printf("Triangle Y area: %.4f\n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Large Area: X");
		}else {
			System.out.println("Large Area: Y");
		}
		mostrar.close();
	}
}