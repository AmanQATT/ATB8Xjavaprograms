package sept.ex_23092024_Conditions_Loops;

public class Lab083 {
    public static void main(String[] args) {
        // JDK > 13
        int itemcode = 006;
        switch (itemcode){
            case 001,002,005:
                System.out.println("All of them are electronic gadget");
                break;
            case 004,006,007:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");
                break;
        }
    }
}
