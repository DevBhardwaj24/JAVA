import java.util.*;

public class Bitset {
    public static void main(String[] args) {
        BitSet bs1 = new BitSet();
        bs1.set(0);
        bs1.set(1);
        bs1.set(2);

        BitSet bs2 = new BitSet();
        bs2.set(2);
        bs2.set(3); 
        bs2.set(4);

        bs1.or(bs2); //bs1 = bs1 OR bs2
        System.out.println(bs1);
    }
}
//Notes in Hinglish:
//1. BitSet ek aisa class hai jo bits ko manage karta hai, jisme hum bits ko set, clear, aur manipulate kar sakte hain.
//2. Hum do BitSet objects bana rahe hain: bs1 aur bs2.     
//3. bs1 mein humne pehle 3 bits (0, 1, 2) ko set kiya hai, aur bs2 mein humne bits (2, 3, 4) ko set kiya hai.
//4. bs1.or(bs2) operation se hum bs1 ke bits ko bs2    
//   ke bits ke saath logical OR operation kar rahe hain.
//5. Logical OR operation mein agar kisi bhi BitSet mein bit set hai to result mein wo bit set ho jata hai.
//6. Is example mein, final bs1 BitSet mein bits (0, 1, 2, 3, 4) set honge kyunki bit 2 dono BitSets mein set hai.
//7. BitSet class ke common methods hain: set(), clear(), get(), and(), or(), and(), xor(), size(), length().
//8. BitSet ka use tab hota hai jab humein memory-efficient way mein bits ko manage karna ho,
//   jaise ki flags, permissions, ya large boolean arrays ke liye.  
//9. BitSet dynamically grow hota hai jab aap naye bits set karte hain jo current size se
//   bade hote hain.    
//10. BitSet iterable nahi hai, isliye aap for-each loop ka use nahi kar sakte;
//    instead aapko specific methods ka use karna hota hai bits ko access karne ke liye.    