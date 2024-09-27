package Tasks.ex_27092024;

public class Lab003_Calculate_sum_numbers {
    public static void main(String[] args) {

        //Write a Java program that calculates the sum of numbers from 1 to 100 using a while loop.

        int i=0,sum=0;
        while(i<=100)
        {
            sum =sum+i;
            i++;
        }System.out.println(sum);    // 5050
    }
}
