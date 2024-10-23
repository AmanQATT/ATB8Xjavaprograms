package Oct.ex_18102024_Strings;

public class Lab159 {
    public static void main(String[] args) {

        char c='A';
        String name = "Pramod"; // Contains multiple chars.
        name ="Amit";
        name = "Dutta";  // String constant pool -> SCP

        String s1 = new String("Pramod"); //object/heap area
        String s2 = new String("Dutta"); //object/heap area

    }
}
