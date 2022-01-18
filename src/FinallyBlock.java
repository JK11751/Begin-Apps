import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FinallyBlock {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
		int number1; // first number to add 
		 int number2; // second number to add 
		 int result; // sum of number1 and number2
		 System.out.println("Enter first number");
		 number1=scanner.nextInt();
		 System.out.println("Enter second number");
		 number2=scanner.nextInt();
		 result = number1 + number2; // divide two numbers
		 System.out.println("number1 = "+ number1 +" number2= "+ number2 + "answer= "+ result);
		
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
		//finally {
			//System.out.println("This will always be printed ");
			//}
	
		finally {// one of the important uses of the finally  block is closing scanners or any open files.//note that the scanner declaration should be outside the try block. 
			scanner.close();
			}
		System.out.println("baba");
		
	}
	 }



