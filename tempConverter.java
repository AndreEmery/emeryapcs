

/*
Andre Emery
9/14/2019
tempConverter
converts fahrenheit to celsius
variables: Fahr, Cels
*/
import java.util.Scanner;
import java.text.DecimalFormat;
public class tempConverter
{
    public static void main (String[] args)
    {
        System.out.println("Enter the temperature in Fahrenheit/n"
        +"to convert to Celsius");
        Scanner scan = new Scanner(System.in);
        
        double Fahr = scan.nextDouble(); //asks for the temperature
        double Cels = (Fahr-32)*5/9;
        
        DecimalFormat yote = new DecimalFormat ("0.###");
        //prints temperature
        System.out.println("Fahrenheit temperature: " + yote.format(Fahr));
        System.out.println("Celsius equivalent: " + yote.format(Cels));
    }
}
