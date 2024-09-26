package Tasks.ex_23092024_Switch;

public class Lab004_Convert_units {
    public static void main(String[] args) {
       //(3) Write a program that converts between different units (e.g., kilometers to miles, Celsius to Fahrenheit) based on user selection using a switch statement.
       //         Input. -
       //         choice - 1 - km → m, km → 1km
       // choice - 2 - f → c, f → c

        double num = 5;
        int choice = 1;
        switch (choice) {
            case 1:
                System.out.println("converting KM to miles");
                System.out.println(num + "  KM is equal to ");
                num = num * 0.621371;
                System.out.println(num + " miles");
                break;
            case 2:
                System.out.println("converting Celsius to Fahrenheit");
                System.out.println(num + "  Celsius is equal to ");
                num = (num * 9 / 5) + 32;
                System.out.println(num + " Fahrenheit");
                break;
            default:
                System.out.println(" invalid input");
                break;
        }
    }
}
