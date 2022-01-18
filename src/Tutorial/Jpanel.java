package Tutorial;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jpanel {
	
		public static void main(String[] args) {
			
			JLabel label=new JLabel();
			label.setText("User name");
			
			JPanel jpanel=new JPanel();
			jpanel.setBackground(Color.red);
			jpanel.setBounds(0, 0, 250, 250);
			jpanel.setLayout(new BorderLayout());
			
			JPanel panel=new JPanel();
			panel.setBackground(Color.blue);
			panel.setBounds(250, 0, 250, 250);
	
	JFrame frame=new JFrame();//creates a frame
	
	frame.setVisible(true); // make frame visible
	frame.setSize(750, 750); // x and y dimensions of the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
    frame.setResizable(false);// prevents the frame from being resized
    frame.setLayout(null);
    jpanel.add(label);
    frame.add(jpanel);
    frame.add(panel);
}
}