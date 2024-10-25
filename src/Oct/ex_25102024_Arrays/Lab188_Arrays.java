package Oct.ex_25102024_Arrays;

public class Lab188_Arrays {
    public static void main(String[] args) {

        //first way
         int[] marks = {51, 100, 91, 87, 90};
        System.out.println(marks.length); // length stat from 1  // 5
       //  Accessing and Modifying Elements
        System.out.println(marks[0]); // index start from 0  // 51
        System.out.println(marks[1]); // 100
      //  System.out.println(marks[5]); // ArrayIndexOutOfBoundsException -> because index are 0,1,2,3,4


        // second way
        int[] marks2 = new int[5];
        // 5 length , 4 index
        marks2[0] = 11;
        marks2[1] = 12;
        marks2[2] = 13;
        marks2[3] = 14;
        marks2[4] = 15;
        System.out.println(marks2.length); //5
        // Accessing and Modifying Elements
        System.out.println(marks2[0]);  // 11
        System.out.println(marks2[1]); // 12
        System.out.println(marks2[4]); // 15
      //  System.out.println(marks2[5]); // ArrayIndexOutOfBoundsException -> because index are 0,1,2,3,4

    }
}
