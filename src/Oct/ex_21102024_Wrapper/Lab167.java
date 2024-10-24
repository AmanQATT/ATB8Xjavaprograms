package Oct.ex_21102024_Wrapper;

public class Lab167 {
    public static void main(String[] args) {
        // Primitive to wrapper class

        int a=10;
        Integer b=a; // AutoBoxing - int -> Integer
        System.out.println(b);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        Integer a2=42;
        int value = a2;  // Unboxing - Integer -> int
        System.out.println(value);

    }
}
