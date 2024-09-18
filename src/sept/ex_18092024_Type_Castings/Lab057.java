package sept.ex_18092024_Type_Castings;

public class Lab057 {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a++ + ++a);
        System.out.println(a);
        //A -> a++ ->10 -> a=11
        //+
        //B -> ++a -> a=12 -> b=12

        //Line No.|a |exp
        //5  |10 | NA
        //6  |10 | 10+12=22
    }
}
