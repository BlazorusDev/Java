package linear_search;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,78,87894,5484,1,101,1502,100};
        int target = 100;
        int ans = linearSearch(nums, target);
        int ansvalue = linearSearchValue(nums, target);
        System.out.println(ans+" "+ ansvalue);
    }
    // Search in the array
    static int linearSearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
    static int linearSearchValue(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for (int element : arr) {
            if(element == target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
}
