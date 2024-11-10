package Nov.ex_04112024_SET_PQ_MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab212_Map {
    public static void main(String[] args) {

        // name:pramod, roll: 31,phone: 234566789
        Map m1= new HashMap();
       // Map m2 = new LinkedHashMap();
      //  Map m3 = new TreeMap();

        m1.put("name","pramod"); // in map, place of add we use put() -> same as add but it is add the value.
        m1.put("rollNo",123);
        m1.put("phone",987654345);
        System.out.println(m1);
    }
}
