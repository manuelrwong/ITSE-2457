package paintonapanel;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.Timer;

/**
 * Represents a graphical user interface where a dog object can be made and displayed. 
 * @author Qi Wang
 * @version 1.0
 */
public class ShapePanel extends JPanel {
	
	/**
	 * A timer of this panel
	 */
	private Timer timer;
	
	/**
	 * A reference to a shape
	 */
	private Shape shape;
	
	public ShapePanel(){
		this.setBackground(Color.ORANGE);
		this.setPreferredSize(new Dimension(300, 300));
		this.timer = new Timer(20, new ShapeActionListener(this));
		this.shape = new Shape(20, 20, 20);
		this.timer.start();
	}
	

	/**
	 * Paints a few shapes.
	 * @param g A reference to a graphics object
	 */
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(new Color(27,58,160));
		//g.fillOval(this.x, this.y, 30, 30);
		g.fillOval(this.shape.getX(), this.shape.getY(), 30, 30);
		//g.setColor(new Color(27,255,160));
		//g.fillOval(100, 100, 100, 100);
		
		if(this.shape.getX()  < 0 || this.shape.getX() > this.getWidth()){
			//this.xIncerement = -this.xIncerement; // change moving direction
			this.shape.setxIncerement(-this.shape.getxIncerement());
		}
		
		//this.x = this.x + this.xIncerement;
		this.shape.setX(this.shape.getX() + this.shape.getxIncerement());		
	}
}
