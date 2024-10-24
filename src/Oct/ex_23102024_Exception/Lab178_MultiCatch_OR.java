package Oct.ex_23102024_Exception;

public class Lab178_MultiCatch_OR {
    public static void main(String[] args) {

        try {
            String ip = args[0]; //ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // NumberFormatException
            int b = 1000 / a;
        } catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
//        catch (Throwable e){ // use also in place of Exception.
//            System.out.println(e.getMessage());
//        }
//        catch (Object e){  // Not use
//            System.out.println(e.getMessage());
//        }
    }
}
