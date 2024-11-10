package Nov.ex_04112024_Generic;

public class Lab216_Generics {
    public static void main(String[] args) {

        //Generics

        //temp(12); // integer not supported
        //temp(true); // true,false not supported
        temp("pramod"); // it supported only string.
        // but in generic support all.

//        Math.max(1,2); // int
//        Math.max(1.3,1.4); // double
//        Math.max(1.33f,2.45f); // float
//        Math.max(23456l,3457l); // long
    }

    public static void temp(String a){
        System.out.println(a);
    }
}
