package Oct.ex_09102024_Polymorphism.methodoverloading;

public class Lab132 {
    public static void main(String[] args) {
        MathOperations m = new MathOperations();

        int result = m.add(3,4);
        System.out.println(result); // normal + operator

        String name = m.add("pramod","dutta");
        System.out.println(name); // Concatenation

        double result2 = m.add(3,2);
        System.out.println(result2);

    }
}
