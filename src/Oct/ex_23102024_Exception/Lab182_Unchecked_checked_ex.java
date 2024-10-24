package Oct.ex_23102024_Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab182_Unchecked_checked_ex {
    public static void main(String[] args) {

        //Unchecked
        try {
            int a=10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Unchecked");
        }

        //Checked
        try {
            FileReader f = new FileReader(new File("C://abc.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally Checked exception");
        }

    }
}
