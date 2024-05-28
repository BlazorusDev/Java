package Assignment.Arrays;
// https://leetcode.com/problems/shuffle-the-array/description/
import java.util.Arrays;

public class ShuffletheArray {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        System.out.println(Arrays.toString(shuffle(nums,2)));
    }
    static int[] shuffle(int[] nums, int n) {
        int ans[] = new int[2*n];
        for(int i=0;i<n;i++){
            ans[i*2] = nums[i];
            ans[i*2+1] = nums[n+i];
        }
        return ans;
    }
}
