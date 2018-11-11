package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entityExercicios.Company;

public class Exercicio04 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner mostrar = new Scanner(System.in);

		List<Company> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = mostrar.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ": ");
			System.out.print("Id: ");
			int id = mostrar.nextInt();
			System.out.print("Name: ");
			mostrar.nextLine();
			String name = mostrar.nextLine();
			System.out.print("Salary: ");
			double salary = mostrar.nextDouble();
			list.add(new Company(id, name, salary));
		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = mostrar.nextInt();
		
		Company comp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (comp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = mostrar.nextDouble();
			comp.increaseSalary(percentage);
		}
		
		// PART 3 - LISTING EMPLOYEES:
		
		System.out.println();
		System.out.println("List of employees:");
		for (Company imp : list) {
			System.out.println(imp);
		}
				
		mostrar.close(); 
	}
}