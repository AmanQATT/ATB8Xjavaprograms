package Tasks.ex_20092024;

import java.util.Scanner;

public class Lab004_FizzBuzz_test {
    public static void main(String[] args) {

       // FizzBuzz Test:

       // Write a program that prints numbers from 1 to 100(n). However, for multiples of 3,
        //        print "Fizz" instead of the number, and for multiples of 5, print "Buzz."
      //  For numbers that are multiples of both 3 and 5, print "FizzBuzz."

       // Logic Building

       //step 1-
       //input -> int n -> n=100 - Scanner class
       //output -> String -> Fizz,Buzz and FizzBuzz - SOP

        //step 2-
        //Rough Logic
        //i -> multiple of 3 -> modules - i%3 == 0 -> Fizz
        //i -> multiple of 5 -> modules - i%5 == 0 -> Buzz
        //i -> multiple of 3,5 -> modules - i%3 && i%5 == 0 -> FizzBuzz
        // nothing matches -> print i

        //Step 3: Real Logic

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number n=100");   // Scanner just for reference not compulsory.
        int n = sc.nextInt();


        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                    System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
