package swingExamples;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorText 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Color & Text");
		frame.setLayout(null);
		frame.setSize(500, 500);
		frame.setVisible(true);	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		
		JLabel title = new JLabel("Color Example...");
		title.setBounds(80, 30, 250, 50);
		frame.add(title);
		title.setForeground(new Color(150, 55 , 128)); //0-255 (Red, Green, Blue)
		title.setFont(new Font("Times New Roman", Font.BOLD,25));
		
		JButton button1 = new JButton("Button-1");
		button1.setBounds(100, 100, 120, 50);
		frame.add(button1);
		button1.setForeground(new Color(255, 0 , 0));
		button1.setFont(new Font("Verdana", Font.ITALIC, 18));
		button1.setBackground(new Color(128, 255, 255));
		
		//first event
		button1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				JFrame f2 = new JFrame("Frame-2");
				
				JLabel title = new JLabel("Button-1");
				title.setBounds(80, 30, 250, 50);
				f2.add(title);
				title.setForeground(new Color(150, 55 , 128));
				title.setFont(new Font("Times New Roman", Font.BOLD, 25));
				
				f2.setLayout(null);
				f2.setSize(300, 300);
				f2.setVisible(true);
			}
		});
		
		JButton button2 = new JButton("Button-2");
		button2.setBounds(100, 200, 120, 50);
		frame.add(button2);
		button2.setForeground(new Color(0, 0, 255));
		button2.setFont(new Font("Sitka Text", Font.BOLD, 18));
		button2.setBackground(new Color(255, 128, 255));
		button2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				JFrame f3 = new JFrame();
				
				JLabel title = new JLabel("Button-2");
				title.setBounds(80, 30, 250, 50);
				f3.add(title);
				title.setForeground(new Color(150, 55 , 128));
				title.setFont(new Font("Times New Roman", Font.BOLD, 25));
			
				f3.setLayout(null);
				f3.setSize(300, 300);
				f3.setVisible(true);
			}
		});
	}
}
