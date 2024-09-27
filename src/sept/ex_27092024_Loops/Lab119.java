package sept.ex_27092024_Loops;

public class Lab119 {
    public static void main(String[] args) {
        int age = 18;
        //  do{
        //   System.out.println("Can Vote");
        //  age++;                                    // wrong by do_while
        // }while(age<=18); // can vote(once run)


        while (age <= 18) {  // while(age<=17){  // blank
            System.out.println("Can vote");                      //right by while
            age++;  // can vote
        }
    }
}

