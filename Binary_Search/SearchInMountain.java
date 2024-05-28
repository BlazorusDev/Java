package Binary_Search;
// https://leetcode.com/problems/find-in-mountain-array/description/
public class SearchInMountain {
    public static void main(String[] args) {
        
    }

    int search(int[] arr,int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = binarySearch(arr, target,0,peak)
    }

    public int peakIndexInMountainArray(int[] mountainArr) {
        int start = 0;
        int end = mountainArr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(mountainArr[mid] > mountainArr[mid+1]){
                end = mid;
            } else{
                start = mid + 1;
            }
        }
        return start;
    }
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
