import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Scanner3 {

	public static void main(String[] args) { // main method begins execution of Java application
		
		 // create Scanner to obtain input from command window
		 @SuppressWarnings("resource")
		 Scanner input = new Scanner( System.in );
		 Locale tr=new Locale("TR");
		 input.useLocale(tr); 
		 int number1; // first number to add 
		 int number2; // second number to add 
		 int sum; // sum of number1 and number2
		 number1=Integer.parseInt(JOptionPane.showInputDialog("Enter the First Number"));
		 number2=Integer.parseInt(JOptionPane.showInputDialog("Enter the Second Number"));
		 sum = number1 + number2; // add numbers
		JOptionPane.showMessageDialog(null, "number1 = "+ number1 +" number2= "+ number2 + "sum= "+sum);
		 } // end method main
		} // end cla}


