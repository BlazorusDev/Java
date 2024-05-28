package Methods;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
    //    sum(); 
    //    int ans = sum2(); 
    //    System.out.println(ans);
    int sum3 = sum3(15, 5);
    System.out.println(sum3);
    }

    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. 1 : ");
        int num1 = in.nextInt();
        System.out.print("ENter no 2 : ");
        int num2 = in.nextInt();
        int sum = num1 + num2 ;
        return sum;
    }
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. 1 : ");
        int num1 = in.nextInt();
        System.out.print("ENter no 2 : ");
        int num2 = in.nextInt();
        int sum = num1 + num2 ;
        System.out.println("Sum is " + sum);
    }
}
