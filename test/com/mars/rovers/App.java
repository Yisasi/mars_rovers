package com.mars.rovers;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("instruccions.txt");
		String limite="";
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);
			
			String line = br.readLine();
			int cont=0;
			
			while(line != null) {				
				cont++;
				if(cont==1) {
					limite=line;
				}
				else if(cont%2==0) {}
				else if(cont%2!=0) {}
				System.out.println(line);
				line = br.readLine();	
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		} catch (IOException e) {
			System.out.println("IOException");
		}
		
//		Scanner input;
//		try {
//			input = new Scanner(file);
//			while (input.hasNextLine()) {
//				String line = input.nextLine();
//				System.out.println(line);
//			}
//			input.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		finally {
//			
//		}
		

	}
	


}
