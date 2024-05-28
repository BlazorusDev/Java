package Conditions_and_Loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }

        int num = 1;
        while (num <= 5){
            System.out.println(num);
            num++;
        }
        int n = 1;
        do{
            System.out.println(n);
            n++;
        } while(n <= 5);

    }
}
