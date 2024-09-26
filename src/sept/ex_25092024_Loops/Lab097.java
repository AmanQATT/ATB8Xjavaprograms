package sept.ex_25092024_Loops;

public class Lab097 {
    public static void main(String[] args) {
        final boolean b1 = true;
        //b1 = false; // final, this is the fixed one.

        // for (int i = 0; b1 ; i++) {
        //   System.out.println("Hello");  // infinite loop
        //  }


        //     for (int j = 0;  ; ) {
        //       System.out.println("Hello"); // infinite loop
   // }

        for( ; ; ){
            System.out.println("Hello"); // infinite loop
        }
    }
}
