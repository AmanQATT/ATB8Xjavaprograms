package Tasks.ex_27092024;
import java.util.Scanner;

public class Lab003_Print_first_5_even_second_method {
    public static void main(String[] args) {
        //(2)Create a Java program that prints the first 5 even numbers using a do-while loop

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting number to print the Even numbers:");
        int start=sc.nextInt();
        System.out.println("Enter the Last number to print the Even numbers:");
        int End=sc.nextInt();
        int num=start;
        System.out.println("Even Numbers between "+start +" & "+End);
        do {
            if (num % 2 == 0)
                System.out.println(num );
            num++;
        } while (num <=End );
        //}

    }
}
/*  -----Output-------------
Enter the starting number to print the Even numbers:
10
Enter the Last number to print the Even numbers:
20
Even Numbers between 10 & 20
10
12
14
16
18
20
 */


