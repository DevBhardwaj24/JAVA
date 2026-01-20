import java.util.*;

public class Treeset {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(List.of(50, 20, 30, 10, 40));// list.of() method is used to create an immutable list like i can give initilial values to the treeset

        ts.add(25);
        ts.add(5);

        System.out.println(ts.ceiling(55) );// returns the least element greater than or equal to the given element, or null if there is no such element.
        System.out.println(ts.floor(25) );// returns the greatest element less than or equal to the given element, or null if there is no such element.
        System.out.println(ts.pollFirst() );// retrieves and removes the first (lowest) element, or returns null if this set is empty.
        System.out.println(ts.pollLast() );// retrieves and removes the last (highest) element, or returns null if   this set is empty.  


        System.out.println(ts);

        
    }
}
