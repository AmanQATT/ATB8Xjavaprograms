package Oct.ex_14102024_Abstraction.realex;

public class Lab145 {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.loan50K();  // son will completely hide the father loan.
        s1.loan25K();

       // Father f= new Father(); // Not possible
    }
}
