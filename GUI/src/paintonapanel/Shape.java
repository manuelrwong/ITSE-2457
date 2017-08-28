package paintonapanel;

/**
 * Represents a shape that contains an x coordinate, a y coordinate, and a horizontal movement.
 * 
 * @author Qi Wang
 * @version 1.0
 */
public class Shape {
	
	/**
	 * x coordinate of next location
	 */
	private int x;
	
	/**
	 * y coordinate of next location
	 */
	private int y;
	
	/**
	 * The increment of x coordinate
	 */
	private int xIncerement;
	
	/**
	 * Constructs a default shape.
	 */
	public Shape(){
		this(20,20, 20);
	}
	
	/**
	 * Constructs a shape with x coordinate, a y coordinate, and a horizontal movement.
	 * @param x The x coordinate of this shape
	 * @param y The y coordinate of this shape
	 * @param xIncrement The horizontal movement of this shape
	 */
	public Shape(int x, int y, int xIncrement){
		this.x = x;
		this.y = y;
		this.xIncerement = xIncrement;
	}

	/**
	 * Returns the x coordinate of this shape.
	 * @return A value specifying the x coordinate of this shape 
	 */
	public int getX() {
		return this.x;
	}

	/**
	 * Changes the x coordinate of this shape.
	 * @param x A value of a specific x coordinate
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Returns the y coordinate of this shape.
	 * @return A value of a specific y coordinate
	 */
	public int getY() {
		return this.y;
	}

	/**
	 * Changes the y coordinate of this shape.
	 * @param y A value of a specific y coordinate
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Returns the horizontal movement of this shape.
	 * @return The horizontal movement of this shape
	 */
	public int getxIncerement() {
		return xIncerement;
	}

	/**
	 * Changes the horizontal movement of this shape.
	 * @param xIncerement A value of a specific horizontal movement
	 */
	public void setxIncerement(int xIncerement) {
		this.xIncerement = xIncerement;
	}
}
