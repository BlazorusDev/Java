package Assignment.Arrays;

public class maxSubArrayQuestion {
    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    static int maxSubArray(int[] nums) {
        int sum=0;
        int maximum=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            sum+= nums[i];
            if(sum>maximum){
                maximum = sum;
            }
            if(sum<0){ //if sum is negative
                sum=0;
            }
        }
        return maximum;
    }
}
