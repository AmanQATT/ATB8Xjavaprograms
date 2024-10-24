package Oct.ex_23102024_Exception;

public class Lab176_Try_Catch_Finally {
    public static void main(String[] args) {

        int a=0;
        try {
            int c=10/a; //ArithmeticException
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage()); // ArithmeticException  ->  / by zero
        } finally {
            System.out.println("I will be always executed"); //I will be always executed
        }
    }
}
