package sept.ex_25092024_Loops;

public class Lab108_Print_even_odd_continue {
    public static void main(String[] args) {
        // print the values of even and odd numbers from 0 to 50.
        for (int i = 0; i <=50 ; i++) {
            if(i%2==0){
                System.out.println("Even ->" + i);
                continue;
            }
            System.out.println("Odd ->" + i);

        }
    }
}
