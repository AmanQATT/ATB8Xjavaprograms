package Tasks.ex_14102024;

abstract class Book {

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

    String name;
    String author;
    int price;

    abstract void getDetails();
}
