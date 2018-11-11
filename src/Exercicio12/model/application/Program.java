package Exercicio12.model.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Exercicio12.model.entity.Contract;
import Exercicio12.model.entity.Installment;
import Exercicio12.model.service.ContractService;
import Exercicio12.model.service.PayPalService;

public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner mostrar = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter Contract Data: ");
		System.out.print("Number: ");
		int number = mostrar.nextInt();
		
		System.out.print("Date (DD/MM/YYYY): ");
		Date date = sdf.parse(mostrar.next());
		
		System.out.print("Contract Value: ");
		double totalValue = mostrar.nextDouble();
		
		Contract contract = new Contract(number, date, totalValue);
		
		System.out.print("Enter Number of Installments: ");
		int n = mostrar.nextInt();
		
		ContractService contractService = new ContractService(new PayPalService());
		contractService.processContract(contract, n);
		
		System.out.println("Installments: ");
		for(Installment x : contract.getInstallments()) {
			System.out.println(x);
		}
		
		mostrar.close();
	}
}