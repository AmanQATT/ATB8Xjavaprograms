package Oct.ex_23102024_Exception.Custom_Exception;

public class Lab183 {
    public static void main(String[] args) throws Exception {

        //Custom exception
        Bank sbi = new Bank("INR",100);
        Bank icici = new Bank("INR",123);
        Bank jp_chase = new Bank("USD",100);
        System.out.println(sbi.add(icici)); //223
        System.out.println(sbi.add(jp_chase)); // CustomException -> Currency Mismatch, Can't give total
    }
}
