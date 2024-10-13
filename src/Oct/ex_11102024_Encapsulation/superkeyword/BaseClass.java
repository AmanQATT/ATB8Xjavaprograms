package Oct.ex_11102024_Encapsulation.superkeyword;

public class BaseClass {

    // encapsulation
    private String browser;

    //Default Constructor
    BaseClass(){
        System.out.println("DC - BaseClass");
    }
    //parameterised constructor
    BaseClass(String b){
        System.out.println("CC - BaseClass");
    }

    // getter and setter
    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if(isAuth) {
            this.browser = browser;
        }else{
            System.out.println("Not Allowed!");
        }
    }

    // three more open functions
    //Method Overloading
    void openBrowser(){
        System.out.println("Open  Browser!!");
    }

    // method overloaded function
    void openBrowser(String browserName){
        System.out.println("Open Browser!! ->" + browserName);
    }

    void closeBrowser(){
        System.out.println("Close Browser!!");
    }
}
