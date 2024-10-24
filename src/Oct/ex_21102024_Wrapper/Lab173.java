package Oct.ex_21102024_Wrapper;

public class Lab173 {
    public static void main(String[] args) {

        // UnChecked exception
        // JVm - at the runtime -> terminate program
        System.out.println("Start"); // print
        String s1 = null;
        System.out.println(s1.trim()); //NullPointerException - terminate
        System.out.println("End"); // not print
    }
}
