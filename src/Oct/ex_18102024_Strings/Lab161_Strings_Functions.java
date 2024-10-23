package Oct.ex_18102024_Strings;

public class Lab161_Strings_Functions {
    public static void main(String[] args) {

        String str = " Hello World " ;
        //Length of the string
        System.out.println("Length: " + str.length()); //Output: 13

        // Substring
        System.out.println("Substring: " + str.substring(1, 5)); //Output: Hell

        //Trim
        System.out.println("Trimmed: '" + str.trim() + "'"); //Output: 'Hello World'

        // Convert to uppercase and lowercase
        System.out.println("Uppercase: " + str.toUpperCase()); //Output: HELLO WORLD
        System.out.println("Lowercase: " + str.toLowerCase());  //Output: hello world

        System.out.println(str.charAt(2));  // output: e

        System.out.println(str.equals("Hello"));  // false
        System.out.println(str.indexOf("H"));   // 1
        System.out.println(str.contains("l"));  // true
        System.out.println(str.contains("p"));  // false
        System.out.println(str.isEmpty());  // false
        System.out.println(str.split(" "));// but not now -> array


        String name=" Pramod ";
        String name2=" PramoD ";
        System.out.println(name.compareTo(name2)); // 32 ,  when both same then 0.
        //CompareTo -> 0 -> when both of them are same
        // Return number -> ASCII value difference -> between the strings
        // d -> D -> lexicographically comparison
        // 100 - 68 = 32

        System.out.println(name.strip()); //Pramod(same as trim)


    }


}
