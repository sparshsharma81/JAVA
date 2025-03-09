// package Collection_interface;

import java.util.PriorityQueue;
import java.util.Queue;

public class priority_queue {
    public static void main(String[] args) {
        //now we are implementing priority queue
        Queue<Integer>pq = new PriorityQueue<>();
        pq.offer(2);
        pq.offer(33);
        pq.offer(3);
        pq.offer(20);
        pq.offer(21);
        pq.offer(32);
        pq.offer(33);
        pq.offer(1);

        System.out.print(pq);


    }
}
