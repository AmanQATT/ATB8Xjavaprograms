package sept.ex_23092024_Conditions_Loops;

public class Lab078 {
    public static void main(String[] args) {
        // Switch condition
        // Days - 1 to 7 ->  1-mon, 2-tue, 7-sun...
        int day = 5;
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
            case 6:
                System.out.println("Sat");
            case 7:
                System.out.println("Sun");
        }
        System.out.println("End of the loop");
    }
}
