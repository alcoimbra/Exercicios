package model.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner mostrar = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		System.out.println("Enter Rental Data: ");
		System.out.print("Car Model: ");
		String carModel = mostrar.nextLine();
		
		System.out.print("PickUp (DD/MM/YYYY HH:SS): ");
		Date start = sdf.parse(mostrar.nextLine());
		
		System.out.print("Return (DD/MM/YYYY): ");
		Date finish = sdf.parse(mostrar.nextLine());
		
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
		
		System.out.print("Enter Price Per Hour: ");
		double pricePerHour = mostrar.nextDouble();
		
		System.out.print("Enter Price per Day: ");
		double pricePerDay = mostrar.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
		
		rentalService.processInvoice(cr);
		
		System.out.println("INVOICE: ");
		System.out.println("Basic Payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Total Payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));
		mostrar.close();
	}
}