package DefaultMethods.application;

import java.util.Locale;
import java.util.Scanner;

import DefaultMethods.service.BrazilInterestService;
import DefaultMethods.service.InterestService;
import DefaultMethods.service.UsaInterestService;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner mostrar = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = mostrar.nextDouble();
		
		System.out.print("Months: ");
		int months = mostrar.nextInt();
		
		InterestService is = new BrazilInterestService(2.0);
		double payment = is.payment(amount, months);
		
		System.out.println("Payment After " + months + " months: ");
		System.out.println(String.format("%.2f", payment));
		mostrar.close();
		
		InterestService isUsa = new UsaInterestService(1.0);
		double paymentUsa = isUsa.payment(amount, months);
		
		System.out.println("Payment USA After " + months + " months: ");
		System.out.println(String.format("%.2f", paymentUsa));
	}
}