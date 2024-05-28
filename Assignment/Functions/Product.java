package Assignment.Functions;
// Define a method that returns the product of two numbers entered by user.

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First Number :- ");
        int num1 = s.nextInt();
        System.out.println("Enter Second Number :- ");
        int num2 = s.nextInt();
        calPord(num1, num2);
        int product = calPorduct(num1, num2);
        System.out.println("Product is " + product);

    }

    static void calPord(int num1, int num2) {
        System.out.println("Product is " + num1 * num2);
    }
    static int calPorduct(int num1,int num2){
        return num1 * num2;
    }
}
