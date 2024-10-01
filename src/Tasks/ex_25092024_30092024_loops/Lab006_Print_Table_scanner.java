package Tasks.ex_25092024_30092024_loops;

import java.util.Scanner;

public class Lab006_Print_Table_scanner {
    public static void main(String[] args) {
        //(1)Table of number n = 10, print table with For or while.

        //By for loop

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();

        System.out.println("Multiply of Table");
        for (int i = 1; i <=10 ; i++) {
            System.out.println(n + "x" +i + "=" +(n*i));
        }

        //By While Loop

//        int n=10;
//        int i=1;
//
//        System.out.println("Multiply of Table" + n + "Using while loop");
//        while(i<=10){
//            System.out.println(n + "x" +i + "=" +(n*i));
//            i++;
  //      }
    }
}
