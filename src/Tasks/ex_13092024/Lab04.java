package Tasks.ex_13092024;

public class Lab04 {
    public static void main(String[] args) {

        //Write a program to print the table of number which user will give( int num 10)
        //output will be like this (by using the printf()
                //10 × 1 = 10
                //10 × 2 = 20
                //10 × 3 = 30….
        //10 × 10 = 100.

        int num = 10;
        int i;
        System.out.printf("Multiplication of %d", num);
        for(i = 0; i < 10; i++)
        {
            System.out.println();
            System.out.printf("%d * %d = %d",num,i+1,num*(i+1));

        }
    }
}
