package swingExamples;

import javax.swing.*;

public class CreatingFrame 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Frame");
		
		JLabel name = new JLabel("Name: ");
		name.setBounds(10, 10, 50, 20);
		frame.add(name);
		
		JTextField field = new JTextField();
		field.setBounds(70, 10, 70, 20);
		frame.add(field);
		
		frame.setLayout(null);
		frame.setSize(500, 500);
		frame.setVisible(true);	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
