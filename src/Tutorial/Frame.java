package Tutorial;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame extends JFrame implements ActionListener {
	
	JButton button;
	
	Frame(){
		
		button=new JButton();
		button.setBounds(200, 100, 100, 50);
		button.addActionListener(this);
		
		this.setVisible(true); // make frame visible
		this.setLayout(null);
		this.setSize(500, 500); // x and y dimensions of the frame
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
	    this.add(button);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("YOO");
		}
		
	}

}
