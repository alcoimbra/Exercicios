package course;

import java.util.Locale;
import java.util.Scanner;

import entities.Product2;

public class Program6 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner mostrar = new Scanner(System.in);
		
		int n = mostrar.nextInt();
		Product2[] vect = new Product2[n];
		
		for(int i = 0; i < vect.length; i++) {
			mostrar.nextLine();
			String name = mostrar.nextLine();
			double price = mostrar.nextDouble();
			vect[i] = new Product2(name, price);
		}
		
		double sum = 0.0;
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = (sum / vect.length);
		System.out.printf("AVERAGE PRICE: %.2f\n", avg);
		mostrar.close();
	}
}