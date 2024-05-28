package Assignment.Functions;

// Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
// Marks        Grade 
// 91-100         AA 
// 81-90          AB 
// 71-80          BB 
// 61-70          BC 
// 51-60          CD 
// 41-50          DD 
// <=40          Fail 

public class Grade {
    public static void main(String[] args) {
        g(20);
        
    }
    static void g(int marks){
        double percentage = (marks /  100.0) * 100;
        switch ((int) percentage / 10) {
            case 9:
                System.out.println("Grade : AA");
                break;
            case 8:
                System.out.println("Grade : AB");
                break;
            case 7:
                System.out.println("Grade : BB");
                break;
            case 6:
                System.out.println("Grade : BC");
                break;
            case 5:
                System.out.println("Grade : CD");
                break;
            case 4:
                System.out.println("Grade : DD");
                break;
        
            default:
                System.out.println("Fail");
                break;
        }
    }
}
