package Oct.ex_11102024_Encapsulation.superkeyword;

public class Lab141 {
    public static void main(String[] args) {
        BaseClass t2 = new BaseClass();
        TestCase1 t3 = new TestCase1();
        BaseClass t1 = new TestCase1(); //Dynamic Dispatch
       // TestCase1 t1 = new BaseClass();  // not possible



        t1.openBrowser("edge");
        t1.closeBrowser();
    }
}
