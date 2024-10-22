package Oct.ex_16102024.Static;

public class Lab153 {
    public static void main(String[] args) {

        //Static keyword
        Student s1 = new Student(23);
        Student s2 = new Student(33);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(Student.school_name);
        Student.school_name="XYZ";
        System.out.println(Student.school_name);
        System.out.println(s1.school_name); //possible but try to avoid -> call static method with object
    }
}

class Student{
    int age; // instance variable(non-static)
    static String school_name="ABC";// static variable


    {
        System.out.println("IIB");
        System.out.println("Here ypu can write a code what you want to do when object is created");
        System.out.println("Read a MySQL db()");
    }

    static {
        System.out.println("SIB");
        System.out.println("Loaded once when the class is loaded");
    }

    // constructor
    public Student(int age){
        this.age=age;
    }
}


