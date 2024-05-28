package Assignment.Functions;

// Define a method to find out if a number is prime or not.

public class PrimeOrNot {
    public static void main(String[] args) {
        // System.out.println(isPrime1(5));
        // System.out.println(isPrime2(13));
        System.out.println(isPrime3(13));
    }
    static boolean isPrime1(int n){
        // Simple Method
        
        // Corner Case
        if(n <= 1){
            return false;
        }

        // Check from 2 to n
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    static boolean isPrime2(int n){
        // Improved Method
        
        // Corner Case
        if(n <= 1){
            return false;
        }

        // Check from 2 to n/2
        for (int i = 2; i < n / 2; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    static boolean isPrime3(int n){
        // Optimzized Method
        
        // Corner Case
        if(n <= 1){
            return false;
        }

        // Check from 2 to sqrt(2)
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
