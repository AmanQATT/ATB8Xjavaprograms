package Tasks.ex_27092024;
import java.util.Scanner;

public class Lab001_while_do_while {
    public static void main(String[] args) {
       //(1) Give me example of while vs do while loop in Lab ex.

        Scanner sc=new Scanner((System.in));
        System.out.println("Enter Number :");
        int i=sc.nextInt();
        // ..........while loop Example..........
        int num=0;
        while ((num>=i)) {
            System.out.println("while loop :");//condition fails exit the loop.output is not generated
            System.out.println(num);
            num++;
        }
        // ..........do while loop Example..........

        do{
            System.out.println("do while loop block :");
            System.out.println(num);
            num++;
        }while (num>=i);        //0>5 Condition fails, but statement executes
    }
}

/*   ----output---------
Enter Number :
6
do while loop block :
0
 */


