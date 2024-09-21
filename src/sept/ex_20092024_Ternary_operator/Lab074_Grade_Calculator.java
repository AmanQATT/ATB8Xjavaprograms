package sept.ex_20092024_Ternary_operator;

public class Lab074_Grade_Calculator {
    public static void main(String[] args) {
        // Grade calculator
       /* Write a program that calculates and displays the letter grade for a given numerical score
        (e.g., A, B, C, D, or F) based on the following grading scale:
        A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69
        F: 0-59 */

        // 90 -> A
        // 87 -> B
        // 23 -> F

        // Logic Building

        //1. Find the user inputs
        // score -> int score =89; // data type ask from interviewer.
        //return -> data - type - grade -> char

        //2. Basic Logic
        // if (score >= 90 && score <= 100) -> return or print grade - A
        // else if (score <=89 && score >= 80) -> return or print grade - B
        // else if (score <= 79 && score >= 70) -> return or print grade - C
        // D,E
        // else -> grade -> F

        //3.Write the code

        char grade = 'F';
        int score = 89; // in the future we will get this from the users ,input.

        if(score >= 90 && score <= 100){
            grade = 'A';
        }else if(score >= 80 && score <= 89){
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
        }else if (score <= 0 || score > 100) {
            System.out.println("LOL!! , Are you God?");
            grade = 'O';
        } else {
            grade = 'F';
        }
        System.out.println("Your Grade is -> " + grade);

    }
}
