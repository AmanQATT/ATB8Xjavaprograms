package Oct.ex_30102024_Collection_Framework_Part2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab00_Set {
    public static void main(String[] args) {

        // List -> Duplicate Allows
       // Set -> Doesn't allow Duplicate

        Set hs = new HashSet();
        Set lhs =  new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("suraj");
        hs.add("aman");
        hs.add("pramod");
        hs.add("pramod"); // duplicates not allowed , it will one time print.
        hs.add("dramod");
        System.out.println(hs);

    }
}
