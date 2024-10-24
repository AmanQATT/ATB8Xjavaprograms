package Oct.ex_21102024_Wrapper;

public class Lab172 {
    public static void main(String[] args) {

        // UnChecked exception
        int a=10;
        int c =a/0; //ArithmeticException -terminate program
        System.out.println(c); // not run
        System.out.println("End"); // not run
    }
}
