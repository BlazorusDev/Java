package Binary_Search;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {1,5,7,9,10,11,15,20,89,100};
        int[] arr2 = {1000,50,40,9,5};
        int target = 5;
        int ans = orderAgnosticBS(arr, target);
        int ans2 = orderAgnosticBS(arr2, target);
        System.out.println(ans);
        System.out.println(ans2);
    }
    static int orderAgnosticBS(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            // int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                } else if(target > arr[mid]){
                    start = mid + 1;
                }
            } else{
                if(target > arr[mid]){
                    end = mid - 1;
                } else if(target < arr[mid]){
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
