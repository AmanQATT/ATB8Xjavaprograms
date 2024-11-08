package Oct.ex_28102024_Collection_Framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab204_Vector {
    public static void main(String[] args) {

        List mylist=new ArrayList(5); // FR - CO
        mylist.add("Pramod");
        mylist.add("Aman");
        mylist.add("Suraj");
        mylist.add("Kiran");
        mylist.add("Neetu");
        mylist.add("Akash");
        System.out.println(mylist);

        Vector v = new Vector();
        v.add("pramod");
        v.add("aman");
        v.add("singh");
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.isEmpty());
        System.out.println(v.indexOf("Kiran"));
        System.out.println(v.contains("Kiran"));
        System.out.println(v.lastIndexOf("Kiran"));
       // System.out.println(v.replaceAll("Kiran"));

        // only problem with the vector
        // it is thread safe, synchronized
        // it will be time consumming
        // one by one - usage
        // slower


    }
}
