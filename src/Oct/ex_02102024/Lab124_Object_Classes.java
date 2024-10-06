package Oct.ex_02102024;

import sept.person;

public class Lab124_Object_Classes {
    public static void main(String[] args) {
      //pending

        // object class - oops
        // String class - reference type
        // Arrays
          //for each
           // 2nd nested for loop

        // Class -> Blueprint to create something(objects)
        // objects - instance of the class - created from the class.

            ATBStudent amit = new ATBStudent();
            amit.age=35;

        ATBStudent abhishek = new ATBStudent();
        abhishek.age=65;

        //abhishek or amit - reference variable - byte 8 , bit 64 ,null default

        System.out.println(amit); // identity -> Oct.ex_02102024.ATBStudent@6acbcfc0
        System.out.println(abhishek); // identity -> Oct.ex_02102024.ATBStudent@5f184fc6
         // belongs to same class but always identity is different.

      // scanner sc = new scanner();
        person aman=new person();

        person pramod; // reference of object

        new person();  // object with no reference
        new person(); // After this line garbage collector will come.
        // Garbage collector will delete all of them.



    }
}
