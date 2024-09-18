package Tasks.ex_18092024;

public class Lab01 {
    public static void main(String[] args) {
        //Q(1)Give some another example of Widening.
        //with Implicit and Explicit, Narrowing with implicit and explicit.

        //widening
        byte c=20;
        int a=c; // valid -  implicit casting-JVM
        int a2 = (int)c; // valid - explicit casting-Jvm not shown.
        // not shown to you
        System.out.println(a2);

        //Narrowing
        int d = 300;
        //byte b1=val; // invalid implicit casting-JVM
        byte d2 = (byte)d; // invalid explicit casting-loss of data
        System.out.println(d2);


    }
}
