package Methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,541,54,51,51,5,15,5);
        fun();
        mul(5, 5, "Mohit","Mehra");
    }
    static void mul(int a,int b,String ...v){
        
    }
    static void fun(int ...a){
        System.out.println(Arrays.toString(a));
    }
}
