package Tasks.ex_20092024;

public class Lab003_Triangle_Classifier {
    public static void main(String[] args) {

       // Triangle Classifier ( If)

// Write a program that classifies a triangle based on its side lengths.

// Given three input values representing the lengths of the sides, determine

// if the triangle is equilateral (all sides are equal),

// isosceles (exactly two sides are equal), or

// scalene (no sides are equal).

// Use an if-else statement to classify the triangle.

// side1, side2, side3 ->

        int sidea=5;
        int sideb=5;
        int sidec=3;
        if((sidea==sideb) && (sideb==sidec) && (sidec==sidea)) {
            System.out.println("Equilatral Triangle");
        }
        else if((sidea==sideb) || (sideb==sidec) || (sidec==sidea)){
            System.out.println("Isosceles Triangle(two sides are equal) ");
        }
        else if((sidea!=sideb) && (sideb!=sidec) && (sidec!=sidea)){
            System.out.println("scalene (sides not equal) ");
        }
    }
}
