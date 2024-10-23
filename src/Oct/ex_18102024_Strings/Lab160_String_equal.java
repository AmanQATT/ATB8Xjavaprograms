package Oct.ex_18102024_Strings;

public class Lab160_String_equal {
    public static void main(String[] args) {
        String s1 = "Hello"; // SCP
        String s4 = "Hello"; // SCP
        String  s2 = new String("Hello");  //object area
        String  s3 = new String("Hello");  //object area
        String  s5 = new String("hello");  //object area


        System.out.println(s1 == s2); // false
        System.out.println(s2 == s3);  // false
        System.out.println(s1 == s4);  // true // because it is already present in SCP.
        // == this is checking the memory locations

        // How can i check the values?
        System.out.println(s1.equals(s2));  //true
        System.out.println(s2.equals(s3));  //true
        System.out.println(s3.equals(s5));  // false
        System.out.println(s3.equalsIgnoreCase(s5));  //true

    }
}



