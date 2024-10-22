package Oct.ex_16102024;

public class PrintMyBook extends Book{


    // add parametrised constructor
    public PrintMyBook(String name, String author, double price) {
        super(name, author, price);
    }

    // implement methods
    @Override
    void getDetails() {
        System.out.println(name);
        System.out.println(author);
        System.out.println(price);
    }
}
