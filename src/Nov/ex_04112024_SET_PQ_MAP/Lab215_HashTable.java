package Nov.ex_04112024_SET_PQ_MAP;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Lab215_HashTable {
    public static void main(String[] args) {

        // Map -> 1 null key allowed,null value also allowed(many)

        //Hashtable -> Synchronized,slow,Legacy class , null key and null value not allowed.

        Hashtable<Integer,String> ht1 = new Hashtable<>();
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
        //  ht1.put(4,null); // NullPointerException -> not allow null value and null keys.
        System.out.println(ht1);

//        HashMap<Integer,String> ht = new HashMap<>();
//        ht.put(1, "one");
//        ht.put(2, "two");
//        ht.put(3, "three");
//        ht.put(4,null); // allow null value and null key.
//        ht.put(100,null); //null key -> only one
//        System.out.println(ht);

        System.out.println(("---------"));
        // iterate over Hashtable
        // using enumeration
        Enumeration<Integer> e = ht1.keys();
        while(e.hasMoreElements()){
           // System.out.println(e.nextElement()); // print keys
            System.out.println(ht1.get(e.nextElement())); // print values
        }
    }
}
