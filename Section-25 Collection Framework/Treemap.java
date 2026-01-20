

import java.util.*;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>(Map.of(0, "a", 1, "b", 2, "c", 3, "d"));

        System.out.println(tm);

        tm.put(4, "e");
        tm.put(6,"g");

        System.out.println(tm.ceilingEntry(5).getValue());//g

        tm.get(3);//d
        System.out.println(tm.floorKey(5));//4
    }
}
