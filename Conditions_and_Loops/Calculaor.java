package Conditions_and_Loops;

import java.util.Scanner;

public class Calculaor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take the input from user until user press x or X
        int ans = 0;
        while(true){
            System.out.print("Enter the Operator :- ");
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print("Enter Two Numbers :- ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if (op == '+'){
                    ans = num1 + num2;
                }
                if (op == '*'){
                    ans = num1 * num2;
                }
                if (op == '-'){
                    ans = num1 - num2;
                }
                if (op == '%'){
                    ans = num1 % num2;
                }
                if (op == '/'){
                    if(num2 != 0){
                        ans = num1 - num2;
                    }
                }
            }
            else if (op == 'x' || op == 'X'){
                break;
            } else{
                System.out.println("Invalid Operator");
            }
            System.out.println(ans);
        }
        
    }
}
