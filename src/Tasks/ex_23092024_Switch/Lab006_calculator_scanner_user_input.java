package Tasks.ex_23092024_Switch;
import java.util.Scanner;

public class Lab006_calculator_scanner_user_input {
    public static void main(String[] args) {
        //(2)Write a program that takes an integer input (1-12) and prints the name of the corresponding month using a switch statement.
        //     Input  - 12
        // Out - Dec

        Scanner scanner = new Scanner(System.in);
        //Variable declaration
        double num1;
        double num2;
        String operations;
        // User input
        System.out.println("Enter the first number: ");
        num1 = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        num2 = scanner.nextDouble();
        System.out.println("Enter operation (+, -, *, /, %): ");
        operations = scanner.next();
        //performing operation based on user input
        switch (operations){
            case "+":
                System.out.println(num1 + " + " + num2 + " = " +(num1+num2));
                break;
            case "-":
                System.out.println(num1 + " - " + num2 + " = " +(num1-num2));
                break;
            case "*":
                System.out.println(num1 + " * " + num2 + " = " +(num1*num2));
                break;
            case "/":
                if(num2 != 0)
                    System.out.println(num1 + " / " + num2 + " = " +(num1/num2));
                else
                    System.out.println("Error: Division by 0 is not allowed");
                break;
            case "%":
                if(num2 != 0)
                    System.out.println(num1 + " % " + num2 + " = " +(num1%num2));
                else
                    System.out.println("Error: Modulus by 0 is not allowed");
                break;
            default:
                System.out.println("Error: Enter valid input");
                break;


        }

    }
}
