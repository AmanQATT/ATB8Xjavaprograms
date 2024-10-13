package Oct.ex_11102024_Encapsulation.superkeyword;

public class TestCase1 extends BaseClass {

    // TestCase is a type of BaseClass -> Single Inheritance

    TestCase1(){
        super();//DC of parent
        this.setBrowser("edge",true);
    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {
       // System.out.println("Own Logic"); (OR)
        super.setBrowser(browser, isAuth);
    }
}
