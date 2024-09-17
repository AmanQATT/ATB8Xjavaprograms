package Tasks.ex_13092024;

public class Lab02 {
    public static void main(String[] args) {

       // Prepare a small calculator, which supports +, - , , / and %(?) - Modulus operator
        //double a = 34;
       // double b = 10;
        //Print - a+b, a-b, ab, a/b, a%b all the outputs.

        // variables
        double a =34;
        double b = 10;

        // Calculation part
        double addition = a+b;
        double subtraction = a-b;
        double multiplication = a*b;
        double division = a/b;
        double remainder = a%b;

        //printing output
        System.out.printf("%f * %f = %f", a,b,a*b);
        System.out.println();
        System.out.printf("%f + %f = %f", a, b, a+b);
        System.out.println();
        System.out.printf("%f - %f = %f", a,b,a-b);
        System.out.println();
        System.out.printf("%f / %f = %f", a, b, a/b);
        System.out.println();
        System.out.printf("%f modulus %f = %f", a, b, a%b);

    }
}
