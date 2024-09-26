package sept.ex_23092024_Conditions_Loops;

public class Lab089 {
    public static void main(String[] args) {
        char c='C'; // 67 ASCII
        switch(c){
            case 'A'+1:  // 66
                System.out.println("B");
                break;
            case 'A': //65
                System.out.println("A");
                break;
            case 'A'+2: // 67
                System.out.println("C");
                break;
        }

    }
}
