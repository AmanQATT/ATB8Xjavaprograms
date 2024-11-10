package Tasks.ex_04112024;

import java.util.HashMap;
import java.util.Map;

public class MapIterationExample {
    public static void main(String[] args) {

       //(Q) How do you iterate over a Map in Java?

        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Banana", 2);
        map.put("Orange", 5);

        // Iterating using entrySet
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());

        }
    }
}