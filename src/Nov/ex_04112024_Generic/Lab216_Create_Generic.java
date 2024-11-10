package Nov.ex_04112024_Generic;

public class Lab216_Create_Generic {
    public static void main(String[] args) {


        //Generics

        temp(12);
        temp(true);
        temp("pramod");
        // but in generic support all.
    }

    // T -> Reference -> it can be anything
    public static<T> void temp(T a){
        System.out.println(a);
    }
}
