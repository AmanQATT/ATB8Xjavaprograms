package Oct.ex_30102024_Collection_Framework_Part2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab205_LinkedList {
    public static void main(String[] args) {

        //LinkedList
        LinkedList mylist = new LinkedList();
      //  List mylist = new LinkedList(); // use dynamic dispatch also because LinkedList is complete class.
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        mylist.add(4); //duplicates are allowed
        System.out.println(mylist);

        //declaration of array
        Integer[] a=new Integer[5];
        String[] names=new String[5];

        List mylist1 = new ArrayList();
        mylist1.add("aman");
        mylist1.add("singh");

        // selenium  -> store and insertion and deletion - DS - LinkedList
        // API -> store, access -> ArrayList
    }
}
