package Nov.ex_04112024_SET_PQ_MAP;

import java.util.PriorityQueue;

public class Lab211_Queue {
    public static void main(String[] args) {

        //Queue -> 0.01% used in automation.
        PriorityQueue pq= new PriorityQueue();
        pq.offer("1");  // instead of add in this use offer.
        pq.offer("3");
        pq.offer("2");
        pq.offer("4");
        System.out.println(pq);
        System.out.println(pq.peek()); // see the first element, no change
        System.out.println(pq);
        System.out.println(pq.poll()); // remove the first element
        System.out.println(pq);

    }
}
