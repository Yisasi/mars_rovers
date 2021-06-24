package com.mars.rovers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("instruccions.txt");
		String limite="";
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);
			
			String line = br.readLine();
			int cont=0;
			HashMap<String, String> robots = new HashMap<String, String>();
			String lastkey="";
			while(line != null) {				
				cont++;
				if(cont==1) {
					limite=line;
				}
				else if(cont%2==0) {
					lastkey=line;
					robots.put(line, "");
				}
				else if(cont%2!=0) {
					robots.put(lastkey, line);
				}
				line = br.readLine();	
			}
			
			for(String robot: robots.keySet()) {
				String[] arr =robot.split(" ");
				Robot rover = new Robot (Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), arr[2]);
				rover.moveRobot(robots.get(robot), limite);
				System.out.println(rover);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		} catch (IOException e) {
			System.out.println("IOException");
		}

		

	}

}
