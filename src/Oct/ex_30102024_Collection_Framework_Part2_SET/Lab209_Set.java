package Oct.ex_30102024_Collection_Framework_Part2_SET;

import java.util.*;

public class Lab209_Set {
    public static void main(String[] args) {

        // List -> duplicate allowed
        // Set -> Doesn't allow duplicate

        Set hs = new HashSet(); // Hashing mechanism to store the element, no order.
        hs.add("Apple");
        hs.add("Orange");
        hs.add("WaterMelon");
        hs.add("WaterMelon"); // duplicates are not allowed so one will not print.
        hs.add(null);
        System.out.println(hs);

        Set lhs = new LinkedHashSet(); // LinkedList mechanism to store the element, order will maintain.
        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("WaterMelon"); // duplicates are not allowed so one will not print.
        lhs.add(null);
        System.out.println(lhs);

        Set ts = new TreeSet(); // Black and red mechanism to store the element.
        //order will maintain, natural sorting is done.
        ts.add("Dapple");
        ts.add("Apple");
        ts.add("Orange");
        //ts.add(123); //ClassCastException
        ts.add("WaterMelon");
        ts.add("WaterMelon"); // duplicates are not allowed so one will not print.
       // ts.add(null); // NullPointerException
        System.out.println(ts);

        // for each loop
        for(Object o:ts){
            System.out.println(o);
        }

        System.out.println("-------");

        // iterator
        Iterator it = ts.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
