package Oct.ex_14102024_Abstraction;

public class Lab149 {

}

interface I3{
    default void start(){
        System.out.println("Body! DM");
    }
    void stop();
    void car();
    // only one is possible second is possible bt using default.


    static void ss(){
        System.out.println("Static can also body in interface");
    }
}

abstract class AA{
    void f1(){
        System.out.println("Concrete method");
    }
    abstract void f2();
    // both are possible

    static void f4(){
        System.out.println("Yes");
    }
}


