
/*
Andre Emery
9/14/2019
nameOrder
places both of our names in alphabetical order
variables: myname, yourname, count
*/
import java.util.Scanner;

public class nameOrder
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String myname = "Andre";
        System.out.println("Print your name, capitalized.");
        String yourname = scan.next();
        
        for (int count=0; count<myname.length(); count++)
        {
            if (myname.charAt(count)<yourname.charAt(count))
            {
                System.out.println("Your name is after my name");
                System.out.println(myname + "\n" + yourname);
                count=5;
            } 
            else
            {
                System.out.println("Your name is before my name");
                System.out.println(yourname + "\n" + myname);
                count=5;
            }
        }
    }
}
