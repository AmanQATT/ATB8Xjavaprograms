package Tasks.ex_27092024;

public class Lab004_Print_first_5_even_numbers_third_method {
    public static void main(String[] args) {
        //(2)Create a Java program that prints the first 5 even numbers using a do-while loop.

        int count=1;
        int number=2;
        do{
            System.out.println(number);
            number +=2;
            count++;
        }while(count<=5);
    }
}
