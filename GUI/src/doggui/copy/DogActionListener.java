package doggui.copy;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

/**
 * An action event listener.
 * @author Qi Wang
 * @version 1.0
 */
public class DogActionListener implements ActionListener{
	
	/**
	 * A reference to a panel that contains an event source
	 */
	private JPanel panel;
	
	
	/**
	 * Constructs an action listener with a reference to a panel that contains event sources.
	 * @param panel A reference to a panel that contains event sources
	 */
	public DogActionListener(JPanel panel){
		this.panel = panel;
	}
	/**
	 * Invoked when an action event occurs
	 * @param e A reference to an action event object
	 */
	public void actionPerformed(ActionEvent e){
		// get event source information
		Object source = e.getSource();
		if(this.panel instanceof DogPanel){
			DogPanel dogPanel = (DogPanel)this.panel;
			// Get the panel info, so that we can 
			if(source == dogPanel.getCreate()){
				final int LABRADOR = 0;
				final int YORKSHIRE = 1;
				switch(dogPanel.getTypeList().getSelectedIndex()){
					case LABRADOR:
						// make a labrador, and display the dog into in the text area
						dogPanel.getInfo().setText((new Labrador(dogPanel.getNameText().getText(), "BROWN")).toString());
						break;
					case YORKSHIRE:
						// make a yorkshire, display the dog into in the text area
						dogPanel.getInfo().setText((new Yorkshire(dogPanel.getNameText().getText())).toString());
						break;
				}
				// if the source is the create button, get the dog name, and dog type, and create a dog of 
				// a proper type, and display the dog information in the corresponding text area.
			}
		}
		
		
	}
	
}
