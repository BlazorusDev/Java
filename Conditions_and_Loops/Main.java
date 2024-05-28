package Conditions_and_Loops;

public class Main {
    public static void main(String[] args) {
        int salary = 240000;
        if(salary < 100000){
            salary = salary + 20000;
        }
        else if(salary == 240000 ){
            salary = salary + 0;
        }
        else{
            salary = salary + 10000;
        }
        System.out.println(salary);
    }
}
