import java.util.*;

public class Priority_queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(5);
        pq.add(40);

        System.out.println(pq.peek()); // prints the head of the queue (smallest element)

        pq.forEach((x)->System.out.print(x+" "));// prints all elements (order not guaranteed)

        pq.poll(); // removes the head of the queue
        System.out.println("\nAfter polling:");
        pq.forEach((x)->System.out.print(x+" "));
    }
}
