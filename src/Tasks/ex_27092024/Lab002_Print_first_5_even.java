package Tasks.ex_27092024;
import java.util.Scanner;

public class Lab002_Print_first_5_even {
    public static void main(String[] args) {
        //(2)Create a Java program that prints the first 5 even numbers using a do-while loop.

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting number to print the 5 Even numbers:");
        int start=sc.nextInt();
        int num=start;
        System.out.println("Five Even Numbers are:");
        do {
            if (num % 2 == 0)
                System.out.println(num );
            num++;
        } while (num <(start+10) );
        //}

    }
}
/*
-----Output----------
Enter the starting number to print the 5 Even numbers:
6
Five Even Numbers are:
6
8
10
12
14

 */


