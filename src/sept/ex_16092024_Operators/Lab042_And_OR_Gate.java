package sept.ex_16092024_Operators;

public class Lab042_And_OR_Gate {
    public static void main(String[] args) {
        // OR gate -> || -> only false||false return false

        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||true);
        System.out.println(false||false);

        // And gate && // only true&&true returns true

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
    }
}
