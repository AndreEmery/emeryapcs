/*
Andre Emery
9/14/2019
read2numbers
performs 6 different mathematical operations on 2 numbers
variables: num1, num2, sum, difference, product, quotient, remainder, exp
*/
import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.*;
public class Read2numbers
{
   public static void main (String[] args)
   {
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Enter 2 numbas");
       
       double num1 = scan.nextDouble();
       double num2 = scan.nextDouble();
       double sum = num1+num2;
       double difference = num1-num2;
       double product = num1*num2;
       double quotient = num1/num2;
       double remainder = num1%num2;
       double exp = Math.pow(num1,num2);
       
       DecimalFormat yote = new DecimalFormat ("0.###");
       
       System.out.println (
       "Input 1: " + yote.format(num1) +
       "\nInput 2: " + yote.format(num2) +
       "\nSum: " + yote.format(sum) +
       "\nDifference: " + yote.format(difference) +
       "\nProduct: " + yote.format(product) +
       "\nQuotient: " + yote.format(quotient) +
       "\nRemainder: " + yote.format(remainder) +
       "\nTo the power of: " + yote.format(exp));
    }
}
