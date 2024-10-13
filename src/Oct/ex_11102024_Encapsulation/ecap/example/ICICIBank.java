package Oct.ex_11102024_Encapsulation.ecap.example;

public class ICICIBank {
    // Encapsulation
   private String name;
   private long bal;

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName(boolean isAdmin) {
        if(isAdmin){
            return name;
        }
        else
            return "Null";
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isAdmin) {
        if(isAdmin) {
            this.bal = bal;
            System.out.println("Allowed");
        }else{
            System.out.println("Not Allowed!");


        }
    }
}
