package Tasks.ex_14102024;


public class Lab001 {
    public static void main(String[] args) {



//         Book book = new Book();  // not possible -> object can't be created for the abstract class.
//         Book book = new PrintMyBook("pramod", "PD", 123);  // also use this.

        PrintMyBook book = new PrintMyBook("pramod", "PD", 123);
        book.getDetails();
    }
}
