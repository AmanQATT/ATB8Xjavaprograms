package Oct.ex_28102024_Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab203_ArrayList_Iterate {
    public static void main(String[] args) {

        List<String> mylist = new ArrayList();
        mylist.add("Pramod");
        mylist.add("Amit");
        mylist.add("Suraj");


        System.out.println("---------default for loop");

        for (int i = 0; i < mylist.size() ; i++) {
            System.out.println(mylist.get(i));

        }

        System.out.println("--------- for each loop");

        for(String str: mylist){
            System.out.println(str);
        }

        System.out.println("--------iterator ");
        //iterator
        Iterator<String> iterator = mylist.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
