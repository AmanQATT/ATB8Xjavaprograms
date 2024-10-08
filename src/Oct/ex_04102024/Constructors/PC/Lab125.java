package Oct.ex_04102024.Constructors.PC;

public class Lab125 {
    public static void main(String[] args) {
        // Creating new planet

        AHuman amit = new AHuman();
        AHuman pramod = new AHuman("Pramod");
        AHuman vijay = new AHuman("Vijay");
        new AHuman();

        System.out.println(amit.planet);  // AHuman
        System.out.println(pramod.planet);  // AHuman

     //   amit.name = "Amit";       // Wrong method
     //   pramod.name = "Pramod";

        System.out.println(amit.name);  // null
        System.out.println(pramod.name); // Pramod
        System.out.println(vijay.name); // Vijay
    }
}
