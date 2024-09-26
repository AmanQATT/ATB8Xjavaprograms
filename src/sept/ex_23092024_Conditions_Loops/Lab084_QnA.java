package sept.ex_23092024_Conditions_Loops;

public class Lab084_QnA {
    public static void main(String[] args) {
         int itemcode = 001; //JDK>13
         switch(itemcode){
             case 001 -> System.out.println("It is a laptop");
             case 002 -> System.out.println("It is a desktop");
             case 003,004 -> System.out.println("It is a mobile");
             default -> System.out.println("Heloo!");
         }
    }
}
