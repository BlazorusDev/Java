package Binary_Search;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,5,7,9,10,11,15,20,89,100};
        int target = 89;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    // return index
    // return -1 if it does not exist
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            // int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else{
                return mid;
            }
        }
        return -1;
    }
}
