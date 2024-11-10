package Tasks.ex_04112024;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
    public static void main(String[] args) {

//   (Q)     Duplicate Elements of an Array
//
//        int[] numbers = {1, 2, 3, 4, 5, 1, 2};  o/p →  1,2

        int[] numbers = {1, 2, 3, 4, 5, 1, 2};

        // Create a HashMap to store the frequencies of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Calculate the frequencies
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print duplicate elements
        System.out.print("Duplicate elements: ");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
