package Oct.ex_21102024_Wrapper;

public class Lab168 {
    public static void main(String[] args) {

        String num = "10";
        // int a=num; // Non-Primitive -> Primitive - never possible.
        Integer a = Integer.valueOf(num);
        System.out.println(a);
        int a2 = a; //unboxing

        // String to Primitive?
        int a3 = Integer.parseInt(num);

       // int a=10; -> these are not class and object.
        //Integer -> Collection Framework(You can use class and object only)

    }
}
