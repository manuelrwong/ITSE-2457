package paintonapanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

/**
 * An action event listener.
 * @author Qi Wang
 * @version 1.0
 */
public class ShapeActionListener implements ActionListener{
	
	/**
	 * A reference to a panel that contains an event source
	 */
	private JPanel panel;
	
	
	/**
	 * Constructs an action listener with a reference to a panel that contains event sources.
	 * @param panel A reference to a panel that contains event sources
	 */
	public ShapeActionListener(JPanel panel){
		this.panel = panel;
	}
	/**
	 * Invoked when an action event occurs
	 * @param e A reference to an action event object
	 */
	public void actionPerformed(ActionEvent e){
		if(this.panel instanceof ShapePanel){
			// repaint by calling paintComponent method of ShapePanel
			this.panel.repaint();
		}
		
	}
	
}
