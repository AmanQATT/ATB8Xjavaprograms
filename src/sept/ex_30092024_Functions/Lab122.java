package sept.ex_30092024_Functions;

public class Lab122 {
    public static void main(String[] args) {

        //1. without parameters and without return type
        function_type1();
        //2.  without parameters but with return type
        int age = function_type2();
        System.out.println(age);
        //3.  with parameters and without return type
        function_type3("Aman"); // gray part name is written automatically by intelliJ
        //4.  with parameters and with return type
        double result = function_type4(3,4); // gray part a and b is written automatically by intelliJ
        System.out.println(result);


    }

    //1. without parameters and without return type
    public static void function_type1() {
        System.out.println("1. without parameters and without return type");
    }

    //2.  without parameters but with return type
    public static int function_type2() {
        System.out.println("2. without parameters but with return type");
        return 65;
    }

    //3.  with parameters and without return type
    public static void function_type3(String name) {
        System.out.println("3.  with parameters and without return type");
        System.out.println("You have shared -> " + name);
    }

    //4.  with parameters and with return type
    public static double function_type4(int a, double b) {
        System.out.println("4.  with parameters and with return type");
        return a+b;
    }
}

//<----Output----->
//        1. without parameters and without return type
//2. without parameters but with return type
//65
//        3.  with parameters and without return type
//You have shared -> Aman
//4.  with parameters and with return type
//7.0
