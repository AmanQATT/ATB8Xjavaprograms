package Tasks.ex_18092024;

public class Lab002 {
    public static void main(String[] args) {
        //Q(2)
        int a = 10;
        System.out.println(  --a + a --  + a--);  // 26
        System.out.println(a); // 7

        //Q(3)
        int b = 10;
        System.out.println(  --b + b++ + b--); //28
        System.out.println(b); // 9

        //Q(4)
        int c = 10;
        System.out.println(  c-- + c--  + c--); // 27
        System.out.println(c); // 7
    }
}
