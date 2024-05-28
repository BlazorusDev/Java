package Assignment.Arrays;

import java.util.Arrays;

public class kthSmallestquestion {
    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 3, 20, 15};
        System.out.println(kthSmallest(arr, 1));
    }
    static int kthSmallest(int[] arr, int k){ 
        Arrays.sort(arr);
        return arr[k-1];
    }
    static int kthLargest(int[] arr, int k){ 
        int n = arr.length;
        Arrays.sort(arr);
        return arr[n-k];
    }
}
