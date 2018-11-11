package course;

import java.io.File;
import java.util.Scanner;

public class Program16 {
	public static void main(String[] args) {
		Scanner mostrar = new Scanner(System.in);
		
		System.out.println("Enter a Folder Path: ");
		String strPath = mostrar.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES");
		for(File file : files) {
			System.out.println(file);
		}
		
		boolean sucess = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory Created Successfull: " + sucess);
		mostrar.close();
	}
}