package doggui.copy;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Represents a graphical user interface where a dog object can be made and displayed. 
 * @author Qi Wang
 * @version 1.0
 */
public class DogPanelWithListenerAsAnonymousClass extends JPanel {
	
	/**
	 * The label containing instructions on entering a dog name
	 */
	private JLabel name;
	/**
	 * The text field where a dog name can be entered
	 */
	private JTextField nameText;
	/**
	 * The label containing instructions on choosing a dog type
	 */
	private JLabel type;
	/**
	 * The combo box containing instructions on choosing a dog type
	 */
	private JComboBox typeList;
	/**
	 * The text area containing information of a dog
	 */
	private JTextArea info;
	/**
	 * The button used to initiate an action to create a dog
	 */
	private JButton create;
	
	public DogPanelWithListenerAsAnonymousClass(){
		this.setBackground(Color.ORANGE);
		this.setPreferredSize(new Dimension(300, 300));
		
		JPanel inputPanel = new JPanel();
		inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
		
		JPanel namePanel = new JPanel();
		namePanel.setBackground(Color.ORANGE);
		this.name = new JLabel("Enter a name: ");
		this.nameText = new JTextField(10);
		namePanel.add(this.name);
		namePanel.add(this.nameText);
		
		JPanel typePanel = new JPanel();
		typePanel.setBackground(Color.ORANGE);
		this.type = new JLabel("Choose a type: ");
		this.typeList = new JComboBox();
		this.typeList.addItem("Labrador");
		this.typeList.addItem("Yorkshire");
		typePanel.add(this.type);
		typePanel.add(this.typeList);
		
		//add name panel and type panel into input panel
		inputPanel.add(namePanel);
		inputPanel.add(typePanel);
		
		//Add a text area
	    JPanel dogInfoPanel = new JPanel();
	    dogInfoPanel.setBackground(Color.ORANGE);
	    this.info = new JTextArea(10, 20);
	    this.info.setEditable(false);
	    dogInfoPanel.add(this.info);
	    
	    //Add a button
	    JPanel userActionPanel = new JPanel();
	    userActionPanel.setBackground(Color.ORANGE);
	    this.create = new JButton("Create");
	    //Connect this event source to a listener
	    this.create.addActionListener(new ActionListener()
		    {
				/**
				 * Invoked when an action event occurs
				 * @param e A reference to an action event object
				 */
				public void actionPerformed(ActionEvent e){
					// get event source information
					Object source = e.getSource();
						// Get the panel info, so that we can 
						if(source == create){
							final int LABRADOR = 0;
							final int YORKSHIRE = 1;
							switch(typeList.getSelectedIndex()){
								case LABRADOR:
									// make a labrador, and display the dog into in the text area
									info.setText((new Labrador(nameText.getText(), "BROWN")).toString());
									break;
								case YORKSHIRE:
									// make a yorkshire, display the dog into in the text area
									info.setText((new Yorkshire(nameText.getText())).toString());
									break;
							}
							// if the source is the create button, get the dog name, and dog type, and create a dog of 
							// a proper type, and display the dog information in the corresponding text area.
				       }
				}
			} // end 
	    );
	    userActionPanel.add(this.create);
	    
	    //Add into this dog panel
	    this.add(inputPanel);
	    this.add(dogInfoPanel);
	    this.add(userActionPanel);
	}
}
