package Oct.ex_25102024_Arrays;

public class Lab189_Arrays_String {
    public static void main(String[] args) {

        // using strings
        String[] names = new String[3];
        // 3 length , 2 index
        names[0] = "Pramod";
        names[1] = "Aman";
        names[2] = "Suraj";
        System.out.println(names.length);  // 3
        //  Accessing and Modifying Elements
        System.out.println(names[1]);  // Aman
     //   System.out.println(names[4]); // ArrayIndexOutOfBoundsException -> because index are 0,1,2

    }
}
