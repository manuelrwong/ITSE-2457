package doggui.copy;

import javax.swing.JFrame;

/**
 * Represents a graphical user interface where a dog object can be made. 
 * @author Qi Wang
 * @version 1.0
 */
public class DogFrame extends JFrame{
	/**
	 * Constructs a frame where a dog name, a dog type can be entered to make a dog object.
	 * @param title A reference to the title of this frame
	 */
	public DogFrame(String title){
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//add a dog panel
		//DogPanel panelOfDog = new DogPanel();
		//DogPanelWithListenerAsInnerClass panelOfDog = new DogPanelWithListenerAsInnerClass();
		//DogPanelWithListenerAsAnonymousClass panelOfDog = new DogPanelWithListenerAsAnonymousClass();
		DogPanelWithListenerAsSelfClass panelOfDog = new DogPanelWithListenerAsSelfClass();
		this.getContentPane().add(panelOfDog);
		
		
		//Not resizable
		this.setResizable(false);
		//cause the window /frame to be sized to fit the preferred size and layouts of its subcomponents
		this.pack();
		this.setVisible(true);
	}
}
