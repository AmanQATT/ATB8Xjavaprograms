package Oct.ex_16102024;

public class Lab152 {
    public static void main(String[] args) {


        //  (Q)  Book class which has an abstract method getDetails(),name, author, price.
//
//    PrintMyBook class that inherits from the Book class.
//
//    abstract
//
//    Book myBook = new PrintMyBook("Harry Potter", "J.k. Rowling", "120");
//
//// Output
//
//"Harry Potter, J.k. Rowling 100"

//         Book book = new Book();  // not possible -> object can't be created for the abstract class.
//         Book book = new PrintMyBook("pramod", "PD", 123);  // also use this.

        PrintMyBook book = new PrintMyBook("pramod", "PD", 123);
        book.getDetails();
    }
}
