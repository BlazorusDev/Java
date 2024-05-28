package PatternQuestions;

public class Main {
    public static void main(String[] args) {
        // pattern1(5);
        //  pattern2(4);
        // pattern3(4);
        // pattern4(4);
        // pattern5(4);
        // pattern6(4);
        // pattern7(4);
        // pattern8(4);
        pattern9(4);
    }

    static void pattern1(int n){
        // *
        // **
        // ***
        // ****
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // When one row is printed, we need to add newline
            System.out.println();
        }
    }

    static void pattern2(int n){
        // ****
        // ****
        // ****
        // ****
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            // When one row is printed, we need to add newline
            System.out.println();
        }
    }

    static void pattern3(int n){
        // ****
        // ***
        // **
        // *
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // When one row is printed, we need to add newline
            System.out.println();
        }
    }

    static void pattern4(int n){
        // 1
        // 12
        // 123
        // 1234
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            // When one row is printed, we need to add newline
            System.out.println();
        }
    }

    static void pattern5(int n){
        // *
        // **
        // ***
        // ****
        // ***
        // **
        // *
        for (int row = 0; row < 2 * n; row++) {
            int totalColumnsInRow = row > n ? 2*n - row : row;
            for (int col = 0; col < totalColumnsInRow; col++) {
                System.out.print("* ");
            }
            // When one row is printed, we need to add newline
            System.out.println();
        }
    }

    static void pattern6(int n){
        //    *
        //   * *
        //  * * *
        // * * * *
        //  * * *
        //   * *
        //    *
        for (int row = 0; row < 2 * n; row++) {
            int totalColumnsInRow = row > n ? 2*n - row : row;
            int noOfSpaces = n- totalColumnsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColumnsInRow; col++) {
                System.out.print("* ");
            }
            // When one row is printed, we need to add newline
            System.out.println();
        }
    }
 
    static void pattern7(int n){
        //          1
        //        2 1 2
        //      3 2 1 2 3
        //    4 3 2 1 2 3 4  
        //  5 4 3 2 1 2 3 4 5

        for (int row = 1; row <= n; row++) {
            for (int spaces = 0; spaces <= n-row ; spaces++) {
             System.out.print("  ");   
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col+ " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
 
    static void pattern8(int n){
        //    1
        //   212
        //  32123
        // 4321234
        //  32123
        //   212
        //    1 

        for (int row = 1; row <= 2*n; row++) {
            int totalColumnsInRow = row > n ? 2*n - row : row;
            for (int spaces = 0; spaces <= n-totalColumnsInRow ; spaces++) {
             System.out.print("  ");   
            }
            for (int col = totalColumnsInRow; col >= 1; col--) {
                System.out.print(col+ " ");
            }
            for (int col = 2; col <= totalColumnsInRow; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
        n = 2*n;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                int atEvertIndex = 45454;
                System.out.print(atEvertIndex);
            }
            System.out.println();
        }
    }
}
