package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		char resp;
		
		Locale.setDefault(Locale.US);
		Scanner mostrar = new Scanner(System.in);
		
		do {
			System.out.print("Enter a Number: ");
			double n = mostrar.nextDouble();
			double sq = Math.sqrt(n);
			
			System.out.printf("Square Root: %.3f\n", sq);
			
			System.out.print("Repeat (Y/N)? ");
			resp = mostrar.next().charAt(0);
		}while(resp != 'n');
		
		mostrar.close();
	}
}