package Exercicios;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner mostrar = new Scanner(System.in);
		
		System.out.print("How many Lines: ");
		int n = mostrar.nextInt();
		
		System.out.print("How many Coluns: ");
		int m = mostrar.nextInt();
		
		int[][] mat = new int[n][m];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = mostrar.nextInt();
			}
		}
		
		int x = mostrar.nextInt();
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == x) {
					System.out.print("Position " + i + ", " + j + ": ");
					
					if(j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					
					if(i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					
					if(j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					
					if(i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}	
			}
		}
		
		mostrar.close();
	}
}