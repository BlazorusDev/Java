package Sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10,4,3,5,1,0};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void bubble(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last resp index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than previous item
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if you did not swap for i 
            if (!swapped){
                break;
            }
        }
    }
}
