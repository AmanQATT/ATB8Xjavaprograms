package Oct.ex_09102024_Polymorphism.methodoverriding.real;

public class Lab134 {
    public static void main(String[] args) {
        Pramod p= new Pramod();
        p.home();

        Father f= new Father();
        f.home();

        // Dynamic Dispatch
        Father object = new Pramod();
        object.home();

        // when son created ,father see it.
        //WebDriver driver = new ChromeDriver();

        // Pramod object = new Father();   // not possible
        // when father is created, son don't see it.
    }
}
