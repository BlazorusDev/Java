package linear_search;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {15,15,45,1,21,5,12,10};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans; 
    } 
}
