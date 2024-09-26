package sept.ex_25092024_Loops;

import java.util.Scanner;

public class Lab114_take_user_input {
    public static void main(String[] args) {
        // How to take a user input.

        Scanner sc = new Scanner(System.in);// new object
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println(num);

        System.out.println("Enter the string:");
        String name = sc.next();
        System.out.println(name);
    }
}
