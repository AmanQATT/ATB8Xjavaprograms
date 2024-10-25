package Tasks.ex_25102024;

import java.util.Scanner;

public class LeftTriangle_star_Pattern_2D {
    public static void main(String[] args) {

//        Left Triangle Star Pattern
// *****
// ****
// ***
// **
// *
        // int n=5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows = ");
        int n = sc.nextInt();

        for (int r = n; r >= 1; r--) {
            for (int j = 1; j <= r; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
