package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class RobotMenu {
	
	private ArrayList<Robot> robots;
	private Scanner s;

	public static void main(String[] args) {
		
		int x = 0;
		RobotMenu rm = new RobotMenu ();
		do {
			x = rm.startMenu();
			rm.processInput(x);

	} while (x != 6);
	}

	public RobotMenu () {
		s = new Scanner(System.in);
		robots = new ArrayList<Robot>();
	}

	public int startMenu () {
		System.out.println("Welcome to the robot menu!");
		System.out.println("1. Create a robot");
		System.out.println("2. Display the list of available robots");
		System.out.println("3. Move a robot");
		System.out.println("4. Rotate a robot");
		System.out.println("5. Compute the distance between two robots");
		System.out.println("6. Exit");
		int selection = s.nextInt();
		while (selection < 1 || selection > 6) {
			System.out.println("Invalid input.  Please enter another choice: ");
			selection = s.nextInt();
		}
		return selection;
	}
	
	public void processInput (int selection) {
		
		if (selection == 1) {
			createRobot();
		}
		else if (selection == 2) {
			displayRobot();
		}
		else if (selection == 3) {
			displayRobot();
			Robot r = selectRobot ();
			r.move();
			System.out.println("This is " + r.getName() + "'s new state:");
			System.out.println(r);
		}
		else if (selection == 4) {
			displayRobot ();
			Robot r = selectRobot ();
			System.out.println("Enter in an amount to rotate " + r.getName() + " (90 for right rotation -90 for left rotation): ");
			int rot = s.nextInt();
			r.rotate(rot);
			System.out.println("This is " + r.getName() + "'s new state:");
			System.out.println(r);			
		}
		else if (selection == 5) {
			displayRobot ();
			Robot r = selectRobot ();
			System.out.println("Select the second robot:");
			Robot t = selectRobot ();
			int[] pos = {t.getXpos(), t.getYpos()};
			double dist = r.determineDist(pos);
			System.out.println("The distance between these two robots is " + dist);
		}
		
	}
	
	private void displayRobot () {
		for (int i = 0; i < robots.size(); i++) {
			System.out.println((i+1) + ".) " + robots.get(i));
		}
	}
	
	private Robot selectRobot () {
		System.out.println("Please select a Robot:");
		int selection = s.nextInt();
		while (selection < 1 || selection > robots.size()) {
			System.out.println("Invalid input.  Please input another one: ");
			selection = s.nextInt();
		}
		return robots.get(selection - 1);
	}
	
	private void createRobot () {
		System.out.println("Please enter the name of your Robot:");
		String name = s.next();
		System.out.println("Please enter " + name + "'s speed:");
		int speed = s.nextInt();
		System.out.println("Please enter " + name + "'s initial X position:");
		int x = s.nextInt();
		System.out.println("Please enter " + name + "'s initial Y position:");
		int y = s.nextInt();
		int[] pos = {x, y};
		System.out.println("Please enter " + name + "'s initial orientation in degrees(0, 90, 180, 270):");
		int orient = s.nextInt();
		robots.add(new Robot (name, speed, pos, orient));
	}

}