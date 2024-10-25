package Oct.ex_25102024_Arrays;

import java.util.Scanner;

public class Lab195_RightTriangle_Arrays_2D {
    public static void main(String[] args) {

        //Print pattern
      // *
      // **
      // ***
      // ****
      // *****
        // 5 - rows , 5- column

        // int n=5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num n=5");
        int n= sc.nextInt();

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*"); // remove ln because we don't want new line(space) here.
            }
            System.out.println(); // for new line

        }



    }
}
