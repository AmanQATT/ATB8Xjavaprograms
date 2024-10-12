package Oct.ex_09102024_Polymorphism.methodoverriding;

public class Hound extends Dog {

    @Override  // optional in intelliJ
    void bark() {
        System.out.println("I am Hound, i will Bark!!");
    }
}

