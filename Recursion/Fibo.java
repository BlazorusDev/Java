package Recursion;

public class Fibo {
    public static void main(String[] args) {
        // System.out.println(f(7));
        // for (int i = 0; i < 11; i++) {
        //     System.out.println(fibo(i));
        // }
        System.out.println(fibo(50));
    }

    static int fibo(int n){
        return (int) ((Math.pow(((1 + Math.sqrt(5)) / 2),n)) / Math.sqrt(5));
    }


    static int f(int n){
        if(n<2){
            return n;
        }
        return f(n-1) + f(n-2);
    }
}
