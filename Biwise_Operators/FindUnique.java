package Biwise_Operators;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 3, 4, 2, 6, 4 };
        System.out.println(unique(arr));
    }

    public static int unique(int[] arr) {
        int ans = 0;
        for (int i : arr) {
            ans ^= i;
        }
        return ans;
    }
}
