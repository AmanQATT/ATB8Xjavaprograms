package Tasks.ex_20092024;

public class Lab005_Leap_year {
    public static void main(String[] args) {

        //Leap Year Program -find 2024

        int year = 2023;
        if ((year % 400 == 0)) {
            System.out.println("Leap year");
        } else if ((year % 100 == 0)) {
            System.out.println("Not a Leap year");
        }
        else if ((year % 4 == 0)) {
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not a Leap year");
        }
    }
}
