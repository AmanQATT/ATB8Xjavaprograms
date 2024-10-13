package Oct.ex_11102024_Encapsulation.superkeyword;



public class Lab139 {
    public static void main(String[] args) {
        // super keyword -> call parent(Vehicle)
       // this keyword -> call my own function(display,maxSpeed like)
        Car c = new Car();

    }
}



class Car extends Vehicle{   // Vehicle class is a parent
    private int maxSpeed =281;

    void display(){
        System.out.println("Child");
    }

    Car(){
        super();// call parent
        // constructor chaining
        //super(10);   // output-> PC Vehicle
        System.out.println("DC Car");
        System.out.println(this.maxSpeed);  // this keyword use to call my own function.
        this.display(); // my own display

        super.display();  // parent display
        System.out.println(super.maxSpeed);
    }

}

class Vehicle{
    public int maxSpeed=180;

    void display(){
        System.out.println("Parent");
    }

    Vehicle(){
        System.out.println("DC Vehicle");
    }

    Vehicle(int a){
        System.out.println("PC Vehicle");
    }

    void message(){
        System.out.println("Hello Vehicle");
    }

    void message(int a){
        System.out.println("Hello Vehicle");
    }

}
