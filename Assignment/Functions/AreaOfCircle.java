package Assignment.Functions;
import java.util.Scanner;

// Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter radius :- ");
        int r = s.nextInt();
        double area = Area(r);
        double cir = circumference(r);
        System.out.println("Area is " + area);
        System.out.println("Circumference is " + cir);
    }
    static double Area(int radius){
        double a = Math.PI * (radius * radius);
        return a;
    }
    static double circumference(int radius){
        double c = Math.PI * 2 * radius;
        return c;
    }
}
