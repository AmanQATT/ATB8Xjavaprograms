package Oct.ex_21102024_Wrapper;

public class Lab174 {
    public static void main(String[] args) {

// multiple try catch allowed
        int c = 0;
        try {
            c = 10 / c;
            System.out.println(c);
        } catch (ArithmeticException e) {  // you can also use Exception in place of ArithmeticException
            //but if you know about arithmeticException then you use that.
            //throw new RuntimeException(e);
            System.out.println(e); //java.lang.ArithmeticException: / by zero
        }

        try {
            String s1 = null;
            s1.trim();
        } catch ( NullPointerException e) {
          // throw new RuntimeException(e);
            System.out.println(e); //java.lang.NullPointerException: Cannot invoke "String.trim()" because "s1" is null.

        }

        System.out.println("End");
    }
}
