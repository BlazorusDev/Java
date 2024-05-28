package linear_search;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenDigit {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896,1234};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if(even(i)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num) {
        int numOfdigit = digits(num);
        if(numOfdigit % 2 == 0){
            return true;
        }
        return false;
    }
    static int digits(int num){
        int count = 0;
        while(num>0){
            count++;
            num = num /10;
        }
        return count;
    }
    static int digits2(int num){
        return (int)(Math.log10(num) +1);
    }
}
