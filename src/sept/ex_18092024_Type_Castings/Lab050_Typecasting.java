package sept.ex_18092024_Type_Castings;

public class Lab050_Typecasting {
    public static void main(String[] args) {
        //Type Casting
        // widening - implicit,explicit - lossless
        //Narrowing -  implicit,explicit(with data type) , loss

        //widening
        byte b=10;
        int a=b; // valid -  implicit casting-JVM
        int a1 = (int)b; // valid - explicit casting-Jvm not shown.
        // not shown to you
        System.out.println(a1);

        //Narrowing
        int val = 300;
        //byte b1=val; // invalid implicit casting-JVM never allow
        byte b2 = (byte)val; // valid explicit casting-loss of data
        System.out.println(b2);
    }
}
