package Exercicios;

import java.util.Locale;
import java.util.Scanner;

import entityExercicios.Students;

public class Exercicio03 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner mostrar = new Scanner(System.in);
		
		System.out.print("How many Rooms will be rented? ");
		int room = mostrar.nextInt();
		Students[] stud = new Students[room];
		
		for(int i = 0; i < stud.length; i++) {
			mostrar.nextLine();
			System.out.println("Rent #" + i);
			System.out.print("Name: ");
			String name = mostrar.nextLine();
			
			System.out.print("E-mail: ");
			String email = mostrar.nextLine();
			
			System.out.print("Room: ");
			int numberRoom = mostrar.nextInt();
			stud[i] = new Students(name, email, numberRoom);
		}
		
		System.out.println("Busy Rooms: ");
		for(int i = 0; i < stud.length; i++) {
			if(stud[i] != null) {
				System.out.println(stud[i].getNumberRoom() + ": " + stud[i].getName() + ", " + stud[i].getEmail());
			}
		}
		mostrar.close();
	}
}