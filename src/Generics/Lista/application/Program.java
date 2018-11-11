package Generics.Lista.application;

import java.util.Scanner;

import Generics.Lista.services.PrintService;

public class Program {
	public static void main(String[] args) {
		Scanner mostrar = new Scanner(System.in);
		
		PrintService ps = new PrintService();
		
		System.out.print("How many Values? ");
		int n = mostrar.nextInt();
		
		for(int i = 0; i < n; i++) {
			int value = mostrar.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("First: " + ps.first());
		
		mostrar.close();
	}
}