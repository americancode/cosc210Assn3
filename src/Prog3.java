import java.util.*;
/**
 * COSC 210-001 Assignment 3
 * Prog3.java
 * 
 * This program computes the movement of a robot by asking the 
 * user for the robot's name and then asks for the direction of 
 * movements and how many units the user would like to move. The 
 * Program then prints the robot's name along with the current x,y 
 * coordinate and the total distance traveled
 * 
 * @author Nathaniel Churchill
 *
 */
public class Prog3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//ask the user for a nam and instantiate a robot object
		System.out.print("Please enter the name of the robot: ");
		String rName = in.nextLine();
		System.out.println();
		Robot robotOne = new Robot(rName);
		//ask the user what direction to move and prime the loop
		System.out.print("What direction would you like to move "
				+ "this robot? (x/y/q): ");
		String direction = in.next();
		System.out.println();
		
		int tempDistance = 0;
		//Sentinel loop with q as sentinel
		while (!direction.equalsIgnoreCase("q")){
			System.out.println("Distance?: ");
			tempDistance = in.nextInt();
			
			if(direction.equalsIgnoreCase("x")){
				robotOne.moveX(tempDistance);
			}else if(direction.equalsIgnoreCase("y")){
				robotOne.moveY(tempDistance);
			}
			
			System.out.print("What direction would you like to move "
					+ "this robot? (x/y/q): ");
			direction = in.next();
		}
		//output
		System.out.printf("%s is now at position (%d, %d) and traveled a total of %d units."
				,robotOne.getName(), robotOne.getXPosition(), 
				robotOne.getYPosition(), robotOne.distanceTraveled() );

	}

}
