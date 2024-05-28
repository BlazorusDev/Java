package Assignment.Arrays;

public class Stock {
    public static void main(String[] args) {
        int arr[] = {44,30,24,32,35,30,40,38,15};
        System.out.println(maxProfit(arr));
    }
    static int maxProfit(int prices[]){
        int current = prices[0];
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++) {
            int temp = prices[i] - current;
            if(temp < 0) {
                current = prices[i];
            } 
            else {
                maxProfit = Math.max(maxProfit, temp);
            }
        }
        return maxProfit;
    }
}
