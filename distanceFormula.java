
/*
Andre Emery
9/14/2019
distanceFormla
finds distance between two input points
variables: x1, x2, y1, y2, distancesquared, distance
*/
import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.*;
public class distanceFormula
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the x coordinate of your first point");
        double x1 = scan.nextDouble();
        System.out.println("Enter the y coordinate of your first point");
        double y1 = scan.nextDouble();
        System.out.println("Enter the x coordinate of your second point");
        double x2 = scan.nextDouble();
        System.out.println("Enter the y coordinate of your first point");
        double y2 = scan.nextDouble();
        
        double distancesquared = Math.pow((x1-x2),2) + Math.pow((y1-y2),2);
        double distance = Math.sqrt(distancesquared);
        
        DecimalFormat yote = new DecimalFormat("0.###");
        
        System.out.println("The distance between your two points,\n(" +
        yote.format(x1) + "," + yote.format(y1) + ") and (" +
        yote.format(x2) + "," + yote.format(y2) + "),\nis " +
        yote.format(distance));
    }
}
