import java.util.*;
public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);        
        set.add(10); // Duplicate, will not be added

        System.out.println("HashSet: " + set);// Output may be in any order due to hashing
        System.out.println("Contains 20: " + set.contains(20));
        set.remove(10);
        System.out.println("After removing 10: " + set);
        System.out.println("Size of HashSet: " + set.size());

    }
}
//Notes in Hinglish:
//1.HashSet ek collection hai jo unique elements ko store karta hai bina kisi specific order ke.
//2.Isme duplicate elements allowed nahi hote, agar aap same element ko dobara
//  add karte hain to wo ignore kar diya jata hai.
//3.HashSet internally hashing technique ka use karta hai, isliye iska performance
//  bahut fast hota hai, especially search, add, aur remove operations ke liye.
//4.HashSet null values ko bhi allow karta hai, lekin sirf ek hi null value.
//5.HashSet iterable hai, isliye aap for-each loop ka use karke iske elements ko traverse kar sakte hain.
//6.HashSet synchronized nahi hota, isliye agar multiple threads se access karna ho
//  to aapko external synchronization ka use karna padega.
//7.HashSet ka size dynamically grow hota hai jab aap naye elements add karte hain,
//  lekin aap initial capacity aur load factor specify kar sakte hain performance optimize karne ke liye.
//8.HashSet ke common methods hain: add(), remove(), contains(), size(), isEmpty(), clear(), aur iterator().
//9.HashSet ko aap kisi bhi object type ke elements store karne ke liye use kar sakte hain,
//  lekin ensure karein ki wo objects properly hashCode() aur equals() methods ko override karte hain.
//10.HashSet ka use tab hota hai jab aapko unique items ki zarurat ho bina kisi order ke,
//   jaise ki user IDs, product codes, etc.