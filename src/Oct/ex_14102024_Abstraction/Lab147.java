package Oct.ex_14102024_Abstraction;

public class Lab147 {
    public static void main(String[] args) {
        // Interface

        P p = new P();
        p.f1();

    }
}
class P implements I{

    @Override
    public void f1() {
        System.out.println("P");
    }

    @Override
    public void f2() {

    }

    @Override
    public void f3() {

    }
}

interface I{
    void f1();
    void f2();
    void f3();
}

