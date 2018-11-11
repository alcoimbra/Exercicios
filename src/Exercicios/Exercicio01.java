package Exercicios;

import java.util.Locale;
import java.util.Scanner;

import entityExercicios.Rectangle;

public class Exercicio01 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner mostrar = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		
		System.out.println("Enter Rectangle Widht and Height: ");
		rect.width = mostrar.nextDouble();
		rect.height = mostrar.nextDouble();
		
		System.out.println(rect.area());
		System.out.println(rect.perimeter());
		mostrar.close();
	}
}