package Strings;

public class Main {
    public static void main(String[] args) {
        String a = "Mohit";
        String b = "Mohit";

        System.out.println(a.equals(b));
        System.out.println(a == b);

        String name = new String("Hello");
        String name1 = new String("Hello");


        System.out.println(name.equals(name1)); // Check value only
        System.out.println(name == name1); // check refernce variable
        System.out.println(a.charAt(4));
    }
}
