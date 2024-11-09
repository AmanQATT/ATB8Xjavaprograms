package Oct.ex_30102024_Collection_Framework_Part2;

import java.util.Stack;

public class Lab207_Stack {
    public static void main(String[] args) {

        //vector,stack - legacy classes
        // 95% of time we are not going to use it in automation

        //ArrayList -> 95% time we are going to use.
        Stack s1=new Stack();
        s1.add("aman");
        s1.add("singh");
        System.out.println(s1);  // LIFO -> Last in first out

        Stack books = new Stack();
        books.push("python");
        books.push("java");
        books.push("c#");
        System.out.println(books);
     //   System.out.println(books.pop()); // c#
        System.out.println(books.peek());
        System.out.println(books);
        System.out.println(books.pop());
        System.out.println(books);

        System.out.println("---------");

        Stack s = new Stack();
        s.push("pramod");
        s.push("dutta");
        s.push("amit");
        s.add("Amit2");  // push and add or same.
        System.out.println(s.size()); // 4
        System.out.println(s);
        System.out.println(s.peek()); //  last element -> Amit2
        System.out.println(s);
        System.out.println(s.pop()); // remove Amit2
        System.out.println(s);
        System.out.println(s.size()); // 3
        System.out.println(s.empty()); // false
        System.out.println(s.add("dutta"));// add in end -> similar to push.
        System.out.println(s);
        s.add(0,"lucky"); // add with index
        System.out.println(s);
        System.out.println(s.remove("pramod")); // for delete or remove
        System.out.println(s);
        System.out.println(s.get(0)); // lucky-> 0 index

    }
}
