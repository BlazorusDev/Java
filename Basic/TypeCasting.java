package Basic;

import java.util.Scanner;
 
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int num = input.nextInt();
        // System.out.println(num);

        int num = (int)(67.54f);
        System.out.println(num);

        // int a = 257;
        // byte b = (byte)(a);
        // System.out.println(b);

        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = a * b / c;
        System.out.println(d);

        int number = 'A';
        System.out.println(number);
    }
}
