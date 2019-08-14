
/*
Andre Emery
9/14/2019
marvsPassword
tests marv's password
variables: code
*/
import java.util.Scanner;
public class marvsPassword
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey Marv, you can pop your code in here.");
        
        int code = scan.nextInt();
        if (code/1000==8 && code<10000 && code>999)
        {
            System.out.println("This code will get you into that club");
        }
        else
        {
            System.out.println("Try reading the directions for the code again");
        }
    }
        
}
