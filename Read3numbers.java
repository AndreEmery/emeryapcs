/*
Andre Emery
9/14/2019
read3numbers
finds the average of three numbers
variables: num1, num2, avg
*/
import java.util.Scanner;
import java.text.DecimalFormat;
public class Read3numbers
{
   public static void main (String[] args)
   {
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Enter 3 numbas");
       
       double num1 = scan.nextDouble();
       double num2 = scan.nextDouble();
       double num3 = scan.nextDouble();
       double avg = (num1 + num2 + num3)/3;
       
       DecimalFormat yote = new DecimalFormat ("0.###");
       
       System.out.println ("The average of " + num1 + ", " + num2
       + ",and " + num3 + " is " + yote.format(avg));
    }
}
