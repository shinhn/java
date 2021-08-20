package interface2_main;

import interface2_interface.*;

public class MainClass {
	public static void main(String[] args) {
		Toy robot = new ToyRobot();
		Toy airplane = new ToyAirplane();
		
		Toy toys[] = {robot, airplane};
		
		for(int i=0;i<toys.length;i++)
		{
			toys[i].walk();
			toys[i].run();
		}
	}
}
