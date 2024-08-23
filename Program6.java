import java.util.Scanner;
import java.lang.Math;
class Test{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        double pi = 3.14159;
        
        System.out.print("Type in the radius of the circle: ");

        double radius = myScanner.nextDouble();
        double diameter = Math.round((radius * 2) * 1000) / 1000.0;
        double area = Math.round((pi * (radius * radius) * 1000)) / 1000.0;
        double circum = Math.round((pi * diameter) * 1000) / 1000.0;

        System.out.println("The radius of the circle is: " + radius);
        System.out.println("The diameter of the circle is: " + diameter);
        System.out.println("The area of the circle is: " + area);
        System.out.println("The circumference radius of the circle is: " + circum);
    }
}


//Paste console output below:
/*
Type in the radius of the circle: 3.712
The radius of the circle is: 3.712
The diameter of the circle is: 7.424
The area of the circle is: 43.288
The circumference radius of the circle is: 23.323
*/
