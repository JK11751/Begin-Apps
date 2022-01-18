import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class TryAndCatchException {
	public static void main(String[] args) {
	
	try {
	int number1; // first number to add 
	 int number2; // second number to add 
	 int result; // sum of number1 and number2
	 number1=Integer.parseInt(JOptionPane.showInputDialog("Enter the First Number"));
	 number2=Integer.parseInt(JOptionPane.showInputDialog("Enter the Second Number"));
	 result = number1 / number2; // divide two numbers
	JOptionPane.showMessageDialog(null, "number1 = "+ number1 +" number2= "+ number2 + "answer= "+ result);
	
	}
	catch(ArithmeticException e) {
        System.out.println( "Division by zero");
	}
	catch(InputMismatchException e) {
		System.out.println("Enter correct input");
	}
	catch(NumberFormatException e) {
	 System.out.println("Enter correct number format");
	
 }
	catch(Exception e) { // default catch error statement. used if if you don't want to specify the type of the error to catch
		
} 
	finally {
		System.out.println("This will always be printed ");
		}
	System.out.println("baba");
	
}
} 