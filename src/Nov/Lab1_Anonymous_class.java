package Nov;

public class Lab1_Anonymous_class {
    public static void main(String[] args) {
        I1 i= new I1(){
            @Override
            public void display(){
                System.out.println("AC Display Function");
            }
        };
    }
}
interface I1{
    void display();

}
