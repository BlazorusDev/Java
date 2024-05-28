package Biwise_Operators;

public class NoOfDigit {
    public static void main(String[] args) {
        int n = 34678;
        int b = 10;
        int ans = (int) (Math.log(n) / Math.log(b));
        System.out.println(ans);
    }

}
