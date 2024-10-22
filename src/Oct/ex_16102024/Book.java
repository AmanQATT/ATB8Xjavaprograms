package Oct.ex_16102024;

abstract class Book {
    protected String name;   // we can use private also in place of protected.
    protected String author;
    protected double price;

    //constructor
    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    abstract void getDetails();
}
