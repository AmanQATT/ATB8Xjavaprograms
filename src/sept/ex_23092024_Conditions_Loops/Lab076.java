package sept.ex_23092024_Conditions_Loops;

public class Lab076 {
    public static void main(String[] args) {
        // Switch condition
        // Days - 1 to 7 ->  1-mon, 2-tue, 7-sun...
        int day = 1;
        switch (day){
            case 1:
                System.out.println("Mon");
            case 2:
                System.out.println("Tue");
            case 3:
                System.out.println("Wed");
            case 4:
                System.out.println("Thu");
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
        }
        System.out.println("End of the loop");
    }
}