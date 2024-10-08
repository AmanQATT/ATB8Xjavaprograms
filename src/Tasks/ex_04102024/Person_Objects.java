package Tasks.ex_04102024;

public class Person_Objects {
    public static void main(String[] args) {
        //(Q)Create a Person Class with 10 A, 5 Behaviour( All types of Methods) and use the DC and PC to set the values, Create 5 Objects.

        Person p1=new Person();
        Person p2=new Person("thanu",20,"female");
        Person p3=new Person();
        Person p4=new Person();
        Person p5=new Person();

        new Person();

        System.out.println(p1.behaviour());
        p1.hw(4,50);
        System.out.println(p1.profession("engineer"));
        p1.details("black","blue","black");

        System.out.println(p2.behaviour());
        p1.hw(5,45);
        System.out.println(p1.profession("teacher"));
        p1.details("black","white","brown");

        System.out.println(p3.behaviour());
        p1.hw(5,55);
        System.out.println(p1.profession("driver"));
        p1.details("brown","black","black");

        System.out.println(p4.behaviour());
        p1.hw(4.2f,54);
        System.out.println(p1.profession("enterprenur"));
        p1.details("white","blue","grey");

        System.out.println(p5.behaviour());
        p1.hw(6,50);
        System.out.println(p1.profession("Police"));
        p1.details("skin","black","black");
    }
}


