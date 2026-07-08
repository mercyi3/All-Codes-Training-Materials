package swingExamples;

import java.awt.event.*;
import javax.swing.*;

public class ComponentsEvent implements ActionListener
{
	JFrame f;
	public ComponentsEvent()
	{
		f=new JFrame("My Frame");
 		
 		f.setLayout(null);
 		f.setSize(300,600);
 		f.setVisible(true);
 		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		
 		JTextArea area=new JTextArea();
 		area.setBounds(10, 40, 200, 50);
 		f.add(area);
 		
 		JCheckBox jcb =new JCheckBox("java");
 		f.add(jcb);
 		jcb.setBounds(10, 100, 80, 30);
 		
 		jcb=new JCheckBox("python");
 		f.add(jcb);
 		jcb.setBounds(90, 100, 80, 30);
 		
 		JRadioButton rb =new JRadioButton("male");
 		f.add(rb);
 		rb.setBounds(10, 150, 90, 30);
 		
 		JRadioButton rb2=new JRadioButton("female");
 		f.add(rb2);
 		rb2.setBounds(100, 150, 90, 30);
 		
 		ButtonGroup group = new ButtonGroup();
 		group.add(rb);
 		group.add(rb2);
 		
 		String name[]= {"Luffy","Tae","JK","Kakashi","Zoro"};
 		JComboBox jc =new JComboBox(name);
 		f.add(jc);
 		jc.setBounds(10, 250, 90, 30);
 		
 		DefaultListModel<String> item = new DefaultListModel<>();
 		item.addElement("item1");
 		item.addElement("item2");
 		item.addElement("item3");
 		item.addElement("item4");
 		
 		JList<String>list=new JList<>(item);
 		list.setBounds(10,350,75,75);
 		f.add(list);
 		
 		JButton f1=new JButton("submit");
 		f1.setBounds(10, 450, 90, 30);
 		f1.addActionListener(this);
 		f.add(f1);
	}
	public void actionPerformed(ActionEvent e) 
 	{ 
// 		JFrame f1=new JFrame("My Frame2");
// 		f1.setLayout(null);
// 		f1.setSize(300,400);
// 		f1.setVisible(true);
 		
 		JLabel jt=new JLabel("Thank You");
 		f.add(jt);
 		jt.setBounds(100, 520, 70, 30);
 		System.out.println("thank you");
 	}
 	public static void main(String args[])
 	{
 		new ComponentsEvent();
 	}

}
