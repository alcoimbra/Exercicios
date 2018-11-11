package course;

import java.io.File;
import java.util.Scanner;

public class Program17 {
	public static void main(String[] args) {
		Scanner mostrar = new Scanner(System.in);
		
		System.out.println("Enter a File Path: ");
		String strPath = mostrar.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());
		mostrar.close();
	}
}