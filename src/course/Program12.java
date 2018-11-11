package course;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program12 {
	public static void main(String[] args) {
		File file = new File("c:\\temp\\in.txt");
		Scanner mostrar = null;
		
		try {
			mostrar = new Scanner(file);
			
			while(mostrar.hasNextLine()) {
				System.out.println(mostrar.nextLine());
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}finally {
			if(mostrar != null) {
				mostrar.close();
			}
		}
	}
}