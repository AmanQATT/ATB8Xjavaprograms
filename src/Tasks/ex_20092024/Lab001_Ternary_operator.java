package Tasks.ex_20092024;

public class Lab001_Ternary_operator {
    public static void main(String[] args) {
        //By using Ternary Operators max between 3 numbers.
        // Input int - a,b,c - a = 10, b = 20, c = 45
        // Max → a,b,c → c

        int a = 10;
        int b = 23;
        int c= 45;
        // int max1= (a > b)? a : b;
        // int max2=  (max1 > c)? max1 : c;
        int max= ((a>b ? a:b))>c ? ((a>b ? a:b)) : c ;
        System.out.println(max);
    }
}
