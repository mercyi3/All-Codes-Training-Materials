package swingExamples;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class AddingImage extends JFrame
{
    public AddingImage() 
    {
        setSize(600,600);
        setVisible(true);
        setLayout(new BorderLayout());

        JLabel background=new JLabel(new ImageIcon("C:\\Users\\HP-PC\\eclipse-workspace\\Innovative\\src\\swingExamples\\image.jpeg"));   
        add(background);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]) 
    {
        new AddingImage();
    }
}