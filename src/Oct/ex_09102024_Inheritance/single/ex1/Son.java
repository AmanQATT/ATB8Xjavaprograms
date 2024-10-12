package Oct.ex_09102024_Inheritance.single.ex1;

public class Son extends Father{  // extends Father is use for access father attributes and behaviour.
    //Son -> Father



    void bhk3(){
        System.out.println("3BHK");
        //Attribute Father
        System.out.println(gold_f);
        //Behaviour
        bhk2();

    }
}
