package Tasks.ex_25092024_30092024_loops;

public class Lab002_Factorial {
    public static void main(String[] args) {
       // (2)Factorial Program - n = 5 , Output = 120 //  n = 5 ->  Fact = 5*4*3*2*1 = 120
        // n = 1 ->  Fact = 1*1 -> 1
        // n = 3 -> Fact = 3*2*1 -> 6


        //write a program to find fact of 5
        //5!= 5*4*3*2*1 = 120

        int num= 5;
        int fact =1;
        for(int i=1; i<=num; i++)
        {
            fact =fact*i;
        }
        System.out.println(fact);


/*
        int num= 5;
        int fact =1;
        int i=1;
        while (i<=num)
        {
            fact =fact*i;
            i++;
        }
        System.out.println(fact);
        *
 */
    }
}


