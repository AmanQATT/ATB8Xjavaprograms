package sept.ex_13092024_user_defined_and_constants_Literals;

public class Lab028_simple_calculator {
    public static void main(String[] args) {
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
