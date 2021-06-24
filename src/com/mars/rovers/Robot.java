package com.mars.rovers;
import java.util.HashMap;

public class Robot {
	
	private int x;
	private int y;
	private String orientation;
	
	public Robot(int x, int y, String orientation) {
		super();
		this.x = x;
		this.y = y;
		this.orientation = orientation;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getOrientation() {
		return orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

	@Override
	public String toString() {
		return  x + " " + y + " " + orientation;
	}

	public void moveRobot(String instruccions, String limites) {
		String[] limite = limites.split(" ");
		HashMap<String, String> Lefts = new HashMap<String, String>();
		Lefts.put("N", "O");
		Lefts.put("S", "E");
		Lefts.put("E", "N");
		Lefts.put("O", "S");
		
		HashMap<String, String> right = new HashMap<String, String>();
		right.put("N", "E");
		right.put("E", "S");
		right.put("S", "O");
		right.put("O", "N");
		
        Character[] pasos = instruccions.chars()
                                      .mapToObj(c -> (char) c)
                                      .toArray(Character[]::new);
        for(Character paso: pasos){
                if(paso.equals('M')) {
                	if(this.getOrientation().equals("N")) {
                		if(this.getY()+1<=Integer.parseInt(limite[1])) {
                			this.setY(this.getY()+1);
                		}
                	}
                	else if (this.getOrientation().equals("S")) {
                		if(this.getY()-1>=0) {
                			this.setY(this.getY()-1);
                			}
                	}
                	else if (this.getOrientation().equals("E")) {
                		if(this.getX()+1<=Integer.parseInt(limite[0])) {
                			this.setX(this.getX()+1);
                		}
                	}
                	else if (this.getOrientation().equals("O")) {
                		if(this.getX()-1>=0) {
                			this.setX(this.getX()-1);
                		}
                	}
                }
                else {
                	if(paso.equals('L')) {
                		this.setOrientation(Lefts.get(this.getOrientation()));
                	}
                	else if(paso.equals('R')) {
                		this.setOrientation(right.get(this.getOrientation()));
                	}
                }
        }
	}

}
