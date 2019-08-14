
/*
Andre Emery
9/14/2019
nametag
generates a nametag that isn't too wide (>14 characters)
variables: first, last, work
*/
import java.util.Scanner;
public class nametag
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String first,last,work;
        
        System.out.println("Input your first name");
        first = scan.next();
        
        System.out.println("Input your last name");
        last = scan.next();
        
        System.out.println("Input your workplace/school");
        work = scan.next();
        
        System.out.println("\nHere is your name tag\n\n" + 
        "~ ~ ~ ~ ~ ~ ~ ~ ~");
        if (first.length()+last.length() > 14)
        {
            System.out.println(first+"\n"+last+"\n"+work);
        }
        else
        {
            System.out.println(first+" "+last+"\n"+work);
        }
    }
}
