/**
 * COSC210-001 Assignment 3
 * Robot.java
 * 
 * This class is the robot class which stores data about the robot.
 * It also retrieves and sets relevant data based on user input
 * 
 * @author Nathaniel Churchill
 *
 */
public class Robot {
	//Attributes
	private String name;
	private int xCoord;
	private int yCoord;
	private int totalDistance;
	//Constructors
	public Robot(String name) {
		super();
		this.name = name;
		this.xCoord = 0;
		this.yCoord = 0;
	}
	//Getters
	public String getName() {
		return name;
	}
	public int getXPosition(){
		return this.xCoord;
	}
	public int getYPosition(){
		return this.yCoord;
	}
	//Custom Methods
	/**
	 * This method updates the current x coordinate and the total 
	 * distance variable
	 * @param distance  
	 */
	public void moveX(int distance){
		this.xCoord = xCoord + distance;
		this.totalDistance += Math.abs(distance);
	}
	/**
	 * This method updates the current y coordinate and the total
	 * distance variable
	 * @param distance
	 */
	public void moveY(int distance){
		this.yCoord = yCoord + distance;
		this.totalDistance += Math.abs(distance);
	}
	/**
	 * This method returns the total distance traveled
	 * @return totalDistance
	 */
	public int distanceTraveled(){
		return totalDistance;
	}

}
