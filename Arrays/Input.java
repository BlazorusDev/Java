package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 24;
        arr[1] = 45;
        arr[2] = 55;
        arr[3] = 11;
        arr[4] = 645;
        // System.out.println(arr[2]);

        //input using for loop
        // for(int i = 0;i < arr.length;i++){
        //     arr[1] = in.nextInt();
        // }
        for(int i = 0; i < arr.length;i++){
            System.out.println(arr[i]);
        }

        for(int num: arr){
            System.out.println(num);
        }
        System.out.println(Arrays.toString(arr));

        String[] str = new String[4];
        for(int i=0;i<str.length;i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        str[1] = "Mohit";
        System.out.println(Arrays.toString(str));
    }
}
