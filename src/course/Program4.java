package course;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner mostrar = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter Product Data: ");
		System.out.print("Name: ");
		product.name = mostrar.nextLine();
		System.out.print("Price: ");
		product.price = mostrar.nextDouble();
		System.out.print("Quantity in Stock: ");
		product.quantity = mostrar.nextInt();
		
		System.out.println();
		System.out.println("Product Data: " + product);
		
		System.out.println();
		System.out.println("Enter the Number of Products to be Added in Stock: ");
		int quantity = mostrar.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated Data: " + product);
		
		System.out.println();
		System.out.println("Enter the Number of Products to be Removed from Stock: ");
		quantity = mostrar.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated Data: " + product);
		mostrar.close();
	}
}