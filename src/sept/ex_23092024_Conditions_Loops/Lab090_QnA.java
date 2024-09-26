package sept.ex_23092024_Conditions_Loops;

public class Lab090_QnA {
    public static void main(String[] args) {
        char c='A'; // 65 ASCII
        switch(c){
            case'A':
                System.out.println("A");
                break;
            //case 65:
             //   System.out.println("65");  // invalid
             //   break;
                // in this 'A' value is 65(in JDk) so the cases are same that's not allowed in switch.
        }

    }
}
