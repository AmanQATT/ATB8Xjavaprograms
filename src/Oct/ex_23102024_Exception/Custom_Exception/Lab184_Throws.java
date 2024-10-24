package Oct.ex_23102024_Exception.Custom_Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab184_Throws {
    public static void main(String[] args) throws FileNotFoundException {

        extracted();
    }

//Throws -> Announcing it can give you error.
    private static void extracted() throws FileNotFoundException {

        // select below line -> extract -> Method and throws FileNotFoundException in main()
            FileInputStream fileInputStream = new FileInputStream("dasda.txt");

        }
    }




