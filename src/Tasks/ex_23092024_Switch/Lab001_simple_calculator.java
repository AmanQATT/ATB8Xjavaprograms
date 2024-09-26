package Tasks.ex_23092024_Switch;

public class Lab001_simple_calculator {
    public static void main(String[] args) {
        //(1)Create a simple calculator that performs addition, subtraction, multiplication, and division, modulus based on user input using switch statements.

             //   Inputs :   num 1, num 2, +
              //  Output :  num1+num2 → print information.

        int num1=100;
        int num2=20;
        int choice=1;

        switch (choice){
            // Operation to perform addition
            case 1 :
                int add=num1+num2;
                System.out.println("Addition is  : " + add);
                break;
            // Operation to perform subtraction
            case 2 :
                int sub=num1-num2;
                System.out.println("Subtraction is : " + sub);
                break;
            // Operation to perform multiplication
            case 3 :
                int multiply=num1*num2;
                System.out.println("Multiplication is : " + multiply);
                break;
            // Operation to perform division
            case 4 :
                int divide=num1/num2;
                System.out.println("Division is  : " + divide);
                break;
            // Operation to perform modulus
            case 5:
                int modulo=num1%num2;
                System.out.println("Modulus operation is  : " + modulo);
                break;

            default:
                System.out.println("No operation to perform");
                break;
        }

        System.out.println("End of the switch statement");


    }
}
