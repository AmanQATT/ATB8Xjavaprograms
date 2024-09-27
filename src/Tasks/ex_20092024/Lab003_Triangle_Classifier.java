package Tasks.ex_20092024;

import java.util.Scanner;

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


        //Step 1-
        // slides - double
        //o/p - String

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of side1: ");
        double side1 = sc.nextDouble();

        System.out.println("Enter the length of side2: ");
        double side2 = sc.nextDouble();

        System.out.println("Enter the length of side3: ");
        double side3 = sc.nextDouble();


       // int side1=5;
        //int side2=5;   // without scanner class then this use.
       // int side3=3;

     if(side1>=1 && side2 >=1 && side3>=1) {

         if ((side1 == side2) && (side2 == side3) && (side3 == side1)) {
             System.out.println("Equilateral Triangle");
         } else if ((side1 == side2) || (side2 == side3) || (side3 == side1)) {
             System.out.println("Isosceles Triangle(two sides are equal) ");
         } else {
             System.out.println("scalene (sides not equal) ");
         }
     }else{
         System.out.println("Are you mad?, Negative sides" );
     }
     // Always talk to your interviewer and give them extra.
        // Edge you need to give them and if you can handle them.
   // ask them then handle
        // Test validation -> special character,negative value.
    }
}
