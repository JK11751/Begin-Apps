
import java.util.Scanner; // program uses class Scanner
import java.util.Locale;
public class BPIH1E5B
{
 // main method begins execution of Java application
 public static void main( String args[] )
 {
 // create Scanner to obtain input from command window
 @SuppressWarnings("resource")
Scanner input = new Scanner( System.in );
 Locale tr=new Locale("TR");
 input.useLocale(tr); 
 int number1; // first number to add 
 int number2; // second number to add 
 int sum; // sum of number1 and number2
 System.out.print( "Enter first integer: " ); // prompt
 number1 = input.nextInt(); // read first number from user
 System.out.print( "Enter second integer: " ); // prompt
 number2 = input.nextInt(); // read second number from user
 sum = number1 + number2; // add numbers
 System.out.println("the sum of the two numbers is"+sum); // display sum
 } // end method main
} // end class BPIH1E5