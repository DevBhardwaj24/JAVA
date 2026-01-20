import java.util.*;

public class String_tokenizer {
    public static void main(String[] args) {
        String str = "Hello,how are you ? I hope you're doing well.";
        StringTokenizer stk = new StringTokenizer(str, " ,?.");

        
        String s;
        while (stk.hasMoreTokens()) {
            s = stk.nextToken();
            System.out.println(s);
        }
    }
}
//Notes in Hinglish:
//1.StringTokenizer class ka use string ko tokens mein todne ke liye hota hai, jahan tokens specific delimiters se alag kiye jaate hain.
//2.Isme hum ek string aur delimiters specify karte hain, aur yeh class
//  us string ko tokens mein tod deti hai.
//3.StringTokenizer ke common methods hain: hasMoreTokens(), nextToken(), countTokens()
//4.StringTokenizer ko use karna simple hai, lekin yeh thoda purana hai;
//  aajkal String.split() method ya Scanner class zyada prefer kiye jaate
//  hain string tokenization ke liye
//5.StringTokenizer by default whitespace characters (space, tab, newline) ko delimiters
//  ke roop mein treat karta hai, lekin aap custom delimiters bhi specify
//  kar sakte hain constructor mein.
//6.StringTokenizer iterable nahi hai, isliye aap for-each loop ka use nahi kar sakte;
//  instead aapko while loop ke saath hasMoreTokens() aur nextToken() methods ka use karna hota hai.
//7.StringTokenizer case-sensitive hota hai, matlab "Hello" aur "hello" ko alag tokens
//  mana jata hai.      
//8.StringTokenizer ka use tab hota hai jab aapko simple aur quick tokenization karni ho,
//  jaise ki CSV parsing, user input processing, etc.   
//9.StringTokenizer ke alawa, Java mein string tokenization ke liye aur bhi options hain,
//  jaise ki String.split() method, Scanner class, aur regular expressions.
//10.StringTokenizer ko use karte waqt dhyan rakhein ki yeh thread-safe nahi hai,
//   isliye agar multiple threads se access karna ho to aapko external synchronization ka use karna padega.