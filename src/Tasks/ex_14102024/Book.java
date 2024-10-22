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


        protected String name;   // we can use private also in place of protected.
        protected String author;
        protected double price;

        // constructor
        public Book(String name, String author, double price) {
            this.name = name;
            this.author = author;
            this.price = price;
        }

        abstract void getDetails();
    }
