package Tutorial;

import java.awt.Color;                         //JFrame

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	MyFrame(){
   	 
   	this.setVisible(true); // make frame visible
	this.setSize(420, 420); // x and y dimensions of the frame
	this.setTitle("My First Frame");//set the title for the frame
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
    this.setResizable(false);// prevents the frame from being resized        
    ImageIcon image=new ImageIcon("file path of the image");// this create the image 
    this.setIconImage(image.getImage());// change the icon of the frame
    this.getContentPane().setBackground(Color.gray);

	}
	public static void main(String[] args) {
		//MyFrame myframe=new MyFrame();
		new MyFrame(); // works same as above line 
}
}