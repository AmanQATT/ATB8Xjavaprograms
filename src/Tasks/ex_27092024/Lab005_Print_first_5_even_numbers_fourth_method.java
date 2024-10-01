package Tasks.ex_27092024;

public class Lab005_Print_first_5_even_numbers_fourth_method {
    public static void main(String[] args) {
        //(2)Create a Java program that prints the first 5 even numbers using a while loop
// By while


//        int count = 0;
//        int number = 2;
//        while (count < 5) {
//            if (number % 2 == 0) {
//                System.out.println(number);
//                count++;
//            }
//            number++;
//        }

        // By do_while
        int count=0;
        int number=2;

        do{
            if(number%2==0){
                System.out.println(number);
                count++;
            }
            number++;
        }while(count<5);
    }
}
