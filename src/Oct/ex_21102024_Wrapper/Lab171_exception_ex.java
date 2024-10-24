package Oct.ex_21102024_Wrapper;

public class Lab171_exception_ex {
    public static void main(String[] args) {
        System.out.println("Start of the program");
        String ip=args[0]; //10 //ArrayIndexOutOfBoundsException
        int a = Integer.parseInt(ip); // 10 //NumberFormatException
        int b=1000/a; // 100 //ArithmeticException
        System.out.println(b);  // output -> 100
        System.out.println("End of the program");

        // JVM will be initialized (From RAM)
        // Creates and Starts the main Thread - main called
        // 1)Collects the command Line argument(CLI) - 10
        //String[] args={10}
        //2)Lab171_Exception.main()
        //Now control will be transferred from main thread to main method

        //when problem comes in main -> JVm
        //If you don't handle the exception JVM will handle it
        //Always terminate the program if any exception come

    }
}
