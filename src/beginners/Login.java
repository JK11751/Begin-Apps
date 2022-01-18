package beginners;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Login {

	public static void main(String[] args) {
	
		JFrame frame=new JFrame();
		JLabel login=new JLabel();
		JLabel userid=new JLabel();
		JLabel passwd=new JLabel();
		final JTextField usertxt=new JTextField();
		final JPasswordField pass=new JPasswordField();
		JButton log=new JButton();
		JButton reset=new JButton();
		
		login.setText("LOGIN SYSTEM");
		login.setBounds(200, 20, 200, 70);
		login.setFont(new Font("Tahoma",Font.BOLD,24));
		
		
		userid.setText("User ID");
		userid.setBounds(40, 100, 150, 70);
		userid.setFont(new Font("Tahoma",Font.BOLD,24));
		
		
		passwd.setText("Password");
		passwd.setBounds(40, 170, 150, 70);
		passwd.setFont(new Font("Tahoma",Font.BOLD,24));
		
		
		
		usertxt.setBounds(200, 100, 200, 50);
		usertxt.setFont(new Font("Tahoma",Font.BOLD,24));
		usertxt.setBorder(new LineBorder(new Color(0,0,0),3));
		
		
		pass.setBounds(200, 170, 200 , 50);
		pass.setFont(new Font("Tahoma",Font.BOLD,24));
		pass.setBorder(new LineBorder(new Color(0,0,0),3));
		
		log.setText("Login");
		log.setBounds(180, 250, 100, 40);
		log.setFont(new Font("Tahoma",Font.BOLD,20));
		log.setFocusable(false);
		log.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
			}
				
					
				
			
			
		});
		
		reset.setText("Reset");
		reset.setBounds(310, 250, 100, 40);
		reset.setFont(new Font("Tahoma",Font.BOLD,20));
		reset.setFocusable(false);
		reset.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pass.setText(null);
				usertxt.setText(null);
			}
			
		});
		
		
		frame.setBounds(0, 0, 700, 500);
	    frame.setVisible(true);
	    frame.setLayout(null);
	    frame.setResizable(false);
	    frame.getContentPane().setBackground(Color.gray);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.add(login);
	    frame.add(pass);
	    frame.add(usertxt);
	    frame.add(userid);
	    frame.add(passwd);
	    frame.add(log);
	    frame.add(reset);
	    
	   
	    
	    
	    
	}

}
