
/*
Andre Emery
9/14/2019
secondsConverter
converts seconds to a more simplified form with hours, minutes, and remainder seconds
variables: totalsec, final hours, leftoversec, finalmin, finalsec
*/
import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.*;
public class secondsConverter
{
    public static void main (String[] args)
    {
        System.out.println("Enter your time in seconds");
        Scanner scan = new Scanner(System.in);
        int totalsec = scan.nextInt();
        
        int finalhours = totalsec/3600; // Rounds down to the nearest hour
        int leftoversec = totalsec%3600; // Remainder of seconds not in a whole hour
        
        int finalmin = leftoversec/60; // Remaining seconds to minutes
        int finalsec = leftoversec%60; // Remaining remaining seconds not simplified
        
        DecimalFormat yote = new DecimalFormat("0.###");
        
        System.out.println(totalsec + " seconds is equivalent to\n" +
        finalhours + "h " + finalmin + "m " + finalsec + "s");
    }
}
