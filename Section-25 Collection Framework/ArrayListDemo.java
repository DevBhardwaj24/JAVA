import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<>(20);
        
        ArrayList<Integer> arr2=new ArrayList<>(List.of(50,60,70,80,90));

        arr1.add(10);
        arr2.add(1, 20);

        arr1.addAll(arr2);

        System.out.println(arr1.contains(20));

        System.out.println(arr1.get(4));

        System.out.println(arr1.indexOf(90));

        System.out.println(arr1.set(6, 100));

        System.out.println(arr1); 


    }
}
