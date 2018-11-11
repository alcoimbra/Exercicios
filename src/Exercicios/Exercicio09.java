package Exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entityExercicios.Client;
import entityExercicios.Order;
import entityExercicios.OrderItem;
import entityExercicios.Product;
import enums.OrderStatus;

public class Exercicio09 {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner mostrar = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter Cliente Data: ");
		System.out.print("Name: ");
		String name = mostrar.nextLine();
		
		System.out.print("E-mail: ");
		String email = mostrar.next();
		
		System.out.print("Birth Date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(mostrar.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter Order Data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(mostrar.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.println("How many items to this order? ");
		int n = mostrar.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data: ");
			System.out.print("Product Name: ");
			mostrar.nextLine();
			String productName = mostrar.nextLine();
			
			System.out.print("Product Price: ");
			double productPrice = mostrar.nextDouble();
			
			Product product = new Product(productName,productPrice);
			
			System.out.print("Quantity: ");
			int productQuantity = mostrar.nextInt();
			
			OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
			
			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY: ");
		System.out.println(order);
		
		mostrar.close();
	}
}