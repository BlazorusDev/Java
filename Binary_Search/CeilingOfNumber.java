package Binary_Search;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {1,5,7,9,10,11,15,20,89,100};
        int target = 8;
        System.out.println(Ceiling(arr, target));
    }
    static int Ceiling(int[] arr,int target){
        if(target > arr[arr.length - 1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if( target > arr[mid]){
                start = mid + 1;
            } else{
                return mid;
            }
        }
        return start;
    }
}
