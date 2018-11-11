package course;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program13 {
	public static FileReader fr = null;
	public static BufferedReader br = null;
	
	public static void main(String[] args) {
		String path = "c:\\temp\\in.txt";
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}finally {
			closedFileReader();
			closedBufferedReader();
		}
	}
	
	public static void closedFileReader() {
		try {
			if(br != null) {
				br.close();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void closedBufferedReader() {
		try {
			if(fr != null) {
				fr.close();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}