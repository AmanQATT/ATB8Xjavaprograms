package sept.ex_23092024_Conditions_Loops;

public class Lab079 {
    public static void main(String[] args) {
       //Web automation
       // I will ask user which browser you want me to run the code.
       //chrome -> execute chrome
       //firefox -> execute of firefox
       //edge -> edge cases

       String browser = "chrome";

       switch(browser){
           case "chrome":
               System.out.println("Starting the chrome browser");
               //Further code to start the chrome.
               //Future: Webdriver driver = new chrome(); // Selenium Code
               break;
           case "firefox":
               System.out.println("Starting the firefox browser");
               //Further code to start the firefox.
               //Future: Webdriver driver = new firefox(); // Selenium Code
               break;
           case "edge":
               System.out.println("Execute the edge code");
               break;
           default:
               System.out.println("I have not idea which browser is this");
               break;
       }
    }
}
