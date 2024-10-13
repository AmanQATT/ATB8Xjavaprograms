package Oct.ex_11102024_Encapsulation.ecap;

public class Lab136 {
    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("admin","password123");
        System.out.println(vwoLogin.password);
        vwoLogin.password = "hacker";
        System.out.println(vwoLogin.password);


        GoodVWOLogin vwoLogin1= new GoodVWOLogin("goodadmin","goodadmin123");
        //System.out.println(vwoLogin1.password); // now we can't access pwd
       //  because they are encapsulated.

        // vwoLogin1.password = "pass123"; > ?
        System.out.println(vwoLogin1.getPassword());// for access pwd

        // Checking Admin
        boolean isAdmin = false;

        // vwoLogin1.setYourKey("admin");

        vwoLogin1.setPassword("newpassword",isAdmin); // for set pwd
        System.out.println(vwoLogin1.getPassword());
    }
}
