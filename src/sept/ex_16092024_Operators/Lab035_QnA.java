package sept.ex_16092024_Operators;

public class Lab035_QnA {
    public static void main(String[] args) {
        String first_name= "Aman";
        String last_name= "Singh";
        int a=10;
        int b=10;
        System.out.println(first_name + last_name + a + b);
        // concatenation will open mathematics is not done in this case output is AmanSingh1010
        System.out.println(a + b + first_name + last_name);
        // first one is int so mathematics will done first then concatenation output is 20AmanSingh
        System.out.println(first_name + last_name + (a+b));
        // for AmanSingh20 use brackets
    }
}
