package Oct.ex_28102024_Collection_Framework;

import java.util.ArrayList;

public class Lab197_Array_ArrayList {
    public static void main(String[] args) {

        // collection - Interface - 10
        // List - Interface - 15(25)
        // ArrayList, LinkedList, Stack and Vector - class

        // shopping - bread,milk,curd,butter
        // Collection of items - with same or different data type.

        // Collection of students

        ArrayList studentList = new ArrayList();
        studentList.add("Pramod");
        studentList.add("Dutta");
        studentList.add("Dutta"); // Duplicate is allowed.
        studentList.add("Anil");
        studentList.add("Amit");
        studentList.add(true); // different data type is allowed.
        studentList.add(123);
        studentList.add(null);

        System.out.println(studentList);

       // Integer[] names = new Integer[5]; //  array not allowed - fixed size, same data types.
    }
}
