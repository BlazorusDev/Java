package Recursion;

public class Main {
    public static void main(String[] args) {
       message(); 
    }
    static void message(){
        System.out.println("Hello world");
        message1();
    }
    static void message1(){
        System.out.println("Hello world");
        message2();
    }
    static void message2(){
        System.out.println("Hello world");
        message4();
    }
    static void message4(){
        System.out.println("Hello world");
    }
}
