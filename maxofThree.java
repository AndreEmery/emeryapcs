
/*
Andre Emery
9/14/2019
maxofThree
finds the maximum of three numbers
variables: num1, num2, num3, max
*/
import java.util.Scanner;
public class maxofThree
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input 3 unique numbers.");
        int num1 = scan.nextInt(); // number inputs
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int max;
        if (num1>num2) // if else blocks
        {
            if (num1>num3)
            {
                max = num1;
            }
            else
            {
                max = num3;
            }
        }
        else
        {
            if (num2>num3)
            {
                max = num2;
            }
            else
            {
                max = num3;
            }
        }
        System.out.println("The maximum is " + max);
        if (num1>num2 && num1>num3) // and blocks
        {
            max = num1;
        }
        if (num2>num1 && num2>num3)
        {
            max = num2;
        }
        if (num3>num1 && num3>num2)
        {
            max = num3;
        }
        System.out.println("The maximum is " + max);
    }
}
