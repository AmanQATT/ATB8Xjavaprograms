package Oct.ex_23102024_Exception;

public class Lab177_MultiCatch {
    public static void main(String[] args) {

        try {
            String ip = args[0]; //ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // NumberFormatException
            int b = 100 / a; // ArithmeticException
            System.out.println(b);
        } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("End");
        }
    }
}
