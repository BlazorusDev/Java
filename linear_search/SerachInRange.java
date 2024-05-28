package linear_search;

public class SerachInRange {
    public static void main(String[] args) {
        int[] arr = {15,15,45,1,21,5,12,10};
        int target = 1;
        System.out.println(linearSearch(arr,target, 1, 3)); 
    }
    static int linearSearch(int[] arr,int target,int start,int end){
        if(arr.length == 0){
            return -1;
        }
        for (int i = start; i < end; i++) {
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
