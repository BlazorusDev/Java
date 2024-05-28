package Methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
       System.out.print("Enter no. 1 : ");
       int num1 = in.nextInt();
       System.out.print("ENter no 2 : ");
       int num2 = in.nextInt();
       int sum = num1 + num2 ;
       System.out.print("Sum is " + sum);
    }
}
