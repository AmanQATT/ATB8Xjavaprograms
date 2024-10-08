package Oct.ex_04102024.Constructors.PC;

public class AHuman {
    String eyes_color;
    String planet = "AHuman";
    String name;
    long aadhaar_card_number;

    // Default Constructor
    AHuman(){
        System.out.println("I will be called, object is created");
       // Write a code here which will automatically called when object is created.
        // Read a file txt(future)
        // Read a CSV file,Excel here...(future)
    }

    //Parameterised constructor
    AHuman(String name){
        System.out.println("Hi, I am parameterised constructor");
        this.name = name;
    }

    // Return - void, data_type
    void walk(){
        System.out.println("NRNA");
    }

    int talk(){
        System.out.println("RTNA");
        return 10;
    }

    String sleep(String name){
        System.out.println("Sleeping");
        System.out.println("RTWA");
        return "I am Sleeping";
    }

    void eat(String name){
        System.out.println("NRWA");
        System.out.println("Eating");

    }

}
