package Oct.ex_11102024_Encapsulation.ecap;

public class GoodVWOLogin {
    private String username;
    private String password;


    public GoodVWOLogin(String username, String password) {
        this.username = username;
        this.password = password;

    }

    public String getUsername() {  // public String setYourKey(){
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if(isAdmin) {
            this.password = password;
        }else {
            System.out.println("Not Allowed");
        }
    }
}