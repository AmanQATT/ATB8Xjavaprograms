package Tasks.ex_20092024;

public class Lab002_Ternary_multiple_conditions {
    public static void main(String[] args) {
        // Ternary Operators to handle multiple conditions.
       // Input → int score = 85
       // String grade →
      //  score >= 90 → A
     //  score >= 80 → B
    //  score >= 70 → C

        int score=85;
        if (score>=90){
            System.out.println("A");
        }
        else if(score>=80 && score<=89){
            System.out.println("B");
        }
        else if(score>=70 && score<=79){
            System.out.println("C");
        }
    }
}
