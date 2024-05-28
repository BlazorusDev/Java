package Methods;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        // String mess = greet();
        // System.out.println(mess);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:- ");
        String name = in.nextLine();
        String a = myGreet(name);
        System.out.println(a);
    }
    static String myGreet(String name) {
        String Messgae = "Hello "+ name;
        return Messgae;
    }
    static String greet(){
        String greeting = "Hello";
        return greeting;
    }

}
