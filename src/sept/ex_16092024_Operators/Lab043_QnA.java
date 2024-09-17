package sept.ex_16092024_Operators;

public class Lab043_QnA {
    public static void main(String[] args) {
        int a=12;
        boolean b= !(a > 10 || a < 5); // !(true); -> output false
        // BODMAS -> bracket,of,division,multiplication,Addition and Subtraction
        System.out.println(b);
    }
}
