package Tutorial;

import java.awt.Color;              //JLabels
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
	public static void main(String[] args) {
		// creating JLabels
		
		ImageIcon image=new ImageIcon("single-icon-0.jpg");
		
		JLabel label=new JLabel(); //create a label
		label.setText("USER ID");//set a text to the label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);// set text left, right, center of Imageicon
		label.setVerticalTextPosition(JLabel.TOP);//set text top,bottom or center of image icon
		label.setForeground(new Color(0x00FF00));//set font color of the text
		label.setFont(new Font("MV Boli",Font.PLAIN,20));//set font of the text...font family and font size
		label.setIconTextGap(8);//set gap of text to image
		label.setBackground(Color.yellow);//set background color
		label.setOpaque(true);//display background color
		label.setVerticalAlignment(JLabel.CENTER);// set the vertical position of icon+text within the label
		label.setHorizontalAlignment(JLabel.CENTER);//set the horizontal position of icon+text within the label
		label.setBounds(25, 50, 250, 250);
		
		
		
		
		
		
	JFrame frame=new JFrame();//creates a frame
	frame.setVisible(true); // make frame visible
	frame.setSize(500, 500); // x and y dimensions of the frame
	frame.setLayout(null);// have to set the bounds of the labels now.
	frame.setTitle("My First Frame");//set the title for the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
    frame.setResizable(true);// prevents the frame from being resized
    frame.getContentPane().setBackground(Color.gray);
    frame.add(label);
    //frame.pack(); //resize the frame to accommodate all the components ..but get rid of frame layout and size.
}
}