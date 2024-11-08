package Oct.ex_28102024_Collection_Framework;

import java.util.List;
public class Lab198_List {
    public static void main(String[] args) {

        // List list = new List();  // interface object not possible.
        List list = List.of("banana","apple","grapes","orange");
        // of is static method in Interface that can contain the full definition.

        System.out.println(list);
        System.out.println(list.size());
       // list.add("mango"); // UnsupportedOperationException



    }
}
