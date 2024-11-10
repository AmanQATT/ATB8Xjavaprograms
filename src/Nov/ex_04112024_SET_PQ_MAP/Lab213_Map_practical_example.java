package Nov.ex_04112024_SET_PQ_MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab213_Map_practical_example {
    public static void main(String[] args) {

        //      Map<String,Integer> map = new HashMap<String,Integer>();
        //      Map<String,Integer> map = new HashMap<>();
        //      Map<String,Integer> map = new HashMap();
        // All are same use anyone of them.

        Map<String,Integer> map = new HashMap();  // unsorted, unordered
        map.put("id",1);// in map, place of add we use put() -> same as add but it is used to add the value.
        map.put("id2",2);
        map.put("id3",34);
        map.put("id4",null);  // null value will be store, many times.
        map.put("id5",null);  // in TreeMap null value is not allowed.
        map.put(null,100);  // we can put null key but only one is allowed.
        //map.put(null,102);


        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(34));
        System.out.println(map.containsValue(99));


        System.out.println(map.keySet()); // give all the keys.
        System.out.println(map.values()); // give all the values.

        System.out.println(map.get("id3")); // get a value.

        System.out.println("-------");
        // iterate map
        // for each loop

        for(Map.Entry<String,Integer> item: map.entrySet()){
            System.out.println(item.getKey() + " -> "+ item.getValue());
        }


    }
}
