package sept.ex_18092024_Type_Castings;

public class Lab053_increment_decrement {
    public static void main(String[] args) {
        // increment (++) / decrement(--)operators
        // TYPE- Pre and Post

        //pre - increment - ++operand
        //value is incremented first then stored in the result.
        int a=10;
        int b=++a; // a=a+1
        //  | a |output(b)
        //  | 10|
        //  | 11| 11
        System.out.println(b);
        System.out.println(a);

        //and

        int a1=10;
        System.out.println(++a1);
        System.out.println(a1);

        //Post increment++
        //Print first and then increase
        int b1=10;
        System.out.println(b1++);
        System.out.println(b1);

    }
}
