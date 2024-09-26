package Tasks.ex_23092024_Switch;

public class Lab003_Print_month {
    public static void main(String[] args) {
        //(2)Write a program that takes an integer input (1-12) and prints the name of the corresponding month using a switch statement.
           //     Input  - 12
       // Out - Dec
        int month=12;
        switch (month) {

            case 1 :
                System.out.println("It is January month");
                break;
            case 2 :
                System.out.println("It is February month");
                break;
            case 3 :
                System.out.println("It is March month");
                break;
            case 4 :
                System.out.println("It is April month");
                break;
            case 5 :
                System.out.println("It is May month");
                break;
            case 6 :
                System.out.println("It is June month");
                break;
            case 7 :
                System.out.println("It is July month");
                break;
            case 8 :
                System.out.println("It is August month");
                break;
            case 9 :
                System.out.println("It is September month");
                break;
            case 10 :
                System.out.println("It is October month");
                break;
            case 11 :
                System.out.println("It is November month");
                break;
            case 12 :
                System.out.println("It is December month");
                break;
            default:
                System.out.println("No idea which month it is");
                break;
        }
        System.out.println("Out of switch statement");
    }
}
