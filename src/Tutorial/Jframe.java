package Tutorial;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Jframe {
	public static void main(String[] args) {
		
		JFrame frame=new JFrame();//creates a frame
		frame.setVisible(true); // make frame visible
		frame.setSize(420, 420); // x and y dimensions of the frame
		frame.setTitle("My First Frame");//set the title for the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setResizable(false);// prevents the frame from being resized
        
        //how to change the java logo to your own logo? >>>
        
        ImageIcon image=new ImageIcon("single-icon-0.jpg");// this create the image 
        frame.setIconImage(image.getImage());// change the icon of the frame
        //change the background color
        frame.getContentPane().setBackground(Color.gray);//for default colors
        //else for advanced colors based on rgba and hexa
       // frame.getContentPane().setBackground(new Color("color value"));
        
        /* there are two different ways of creating frames namely:
    	 * 1. Create an instance of a frame and give it a name as shown above
    	 * 2. You can use a JFrame as a parent class to a child class
    	 *
    	 * public class MyFrame extends JFrame{
    	 * 
    	 * MyFrame(){
    	 * 
    	this.setVisible(true); // make frame visible
		this.setSize(420, 420); // x and y dimensions of the frame
		this.setTitle("My First Frame");//set the title for the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        this.setResizable(false);// prevents the frame from being resized        
        ImageIcon image=new ImageIcon("file path of the image");// this create the image 
        this.setIconImage(image.getImage());// change the icon of the frame
        this.getContentPane().setBackground(Color.gray)
    	 * 
    	 *     	 */
	
	
	
	}


	}


