import java.util.*;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "One");
        ht.put(2, "Two");
        ht.put(3, "Three");

        System.out.println("Hashtable: " + ht);

    }
}
//Notes in Hinglish:
//1. Hashtable ek synchronized class hai jo key-value pairs ko store karti hai.
//2. Isme null keys ya null values allow nahi hoti hain.
//3. Hashtable ki performance thodi slow hoti hai compared to HashMap due to synchronization.
//4. Hashtable internally hashing technique ka use karta hai, isliye iska performance
//   fast hota hai, especially search, add, aur remove operations ke liye.
//5. Hashtable iterable hai, isliye aap for-each loop ka use karke iske elements ko traverse kar sakte hain.
//6. Hashtable ka size dynamically grow hota hai jab aap naye elements add karte hain,
//   lekin aap initial capacity aur load factor specify kar sakte hain performance optimize kar
//   karne ke liye.
//7. Hashtable ke common methods hain: put(), get(), remove(), containsKey(), containsValue(),
//   size(), isEmpty(), clear(), aur keys().
//8. Hashtable ko aap kisi bhi object type ke elements store karne ke liye use kar sakte hain,
//   lekin ensure karein ki wo objects properly hashCode() aur equals() methods ko override karte hain.
//9. Hashtable ka use tab hota hai jab aapko thread-safe collection ki zarurat ho,
//   jaise ki multi-threaded applications mein shared data ko manage karne ke liye.
//10. Agar aapko non-synchronized version chahiye to aap HashMap ka use kar sakte hain.