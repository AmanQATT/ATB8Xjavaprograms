package Oct.ex_21102024_Wrapper;

public class Lab174_Handle_Exception {
    public static void main(String[] args) {

        int c= 0;
        try {
            c = 10 / c;
            String s1 = null;
            s1.trim();
            System.out.println(c);
        } catch (ArithmeticException | NullPointerException e) {  // you can also use Exception in place of ArithmeticException
                                            //but if you know about arithmeticException then you use that.
            //throw new RuntimeException(e);
            System.out.println(e.getMessage()); // (divide)/ by zero
            System.out.println(e); //java.lang.ArithmeticException: / by zero
        }

        System.out.println("End");
    }
}