package Oct.ex_14102024_Abstraction;

public class BaseClass extends GrandBaseClass {
    // web Automation
    //Single
    // Hide the functionality of the open and close browser.
    void openBrowser(String browser){}
    void closeBrowser(String browser){}


    @Override
    void takeScreenshot() {
        System.out.println("Taking Screenshot");
    }
}
