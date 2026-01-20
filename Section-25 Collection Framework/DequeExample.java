import java.util.*;

public class DequeExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        // All methods of Deque interface can be used with ArrayDeque
        
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(5);
        dq.offerLast(30);

        dq.pollLast();// removes 30 from the end
        dq.pollFirst();// removes 10 from the front

        dq.forEach((x)->System.out.println(x));

       
    }
}
