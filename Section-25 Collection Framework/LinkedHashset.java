import java.util.*;

public class LinkedHashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(10);

        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        lhs.add(20); // duplicate, will be ignored
        lhs.add(null); // adding null value
        System.out.println("LinkedHashSet: " + lhs);

        Iterator<Integer> it = lhs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
//Notes in Hinglish:
//1. LinkedHashSet ek aisa collection hai jo unique elements ko store karta hai aur insertion order ko maintain karta hai.
//2. Isme elements ko add karne par agar wo pehle se exist karte
//   hain to wo duplicate elements ignore kar diye jate hain.
//3. LinkedHashSet internally ek hash table aur linked list ka combination use karta hai,
//   jisse elements ko fast access milta hai aur order bhi maintain hota hai.
//4. Isme null values ko bhi allow kiya jata hai, lekin sir
//   f ek hi null value store ki ja sakti hai.
//5. LinkedHashSet iterable hai, isliye aap for-each loop ka use
//   karke iske elements ko traverse kar sakte hain.
//6. LinkedHashSet synchronized nahi hota, isliye agar multiple threads se access karna ho
//   to aapko external synchronization ka use karna padega.
//7. LinkedHashSet ka size dynamically grow hota hai jab aap naye elements add karte hain,
//   lekin aap initial capacity aur load factor specify kar sakte hain performance optimize karne ke liye.
//8. LinkedHashSet ke common methods hain: add(), remove(), contains(), size(), isEmpty(), clear(), aur iterator().
//9. LinkedHashSet ko aap kisi bhi object type ke elements store karne ke liye use kar sakte hain,
//   lekin ensure karein ki wo objects properly hashCode() aur equals() methods ko override karte hain.
//10. LinkedHashSet ka use tab hota hai jab aapko unique items ki zarurat ho with predictable iteration order,
//    jaise ki caching, maintaining a list of unique items in order of their addition, etc.