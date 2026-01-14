import java.util.Scanner;

public class reading_from_keyboard {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        // int n=scn.nextInt();
        // float f=scn.nextFloat();
        // String s=scn.next();//it will print the string upto next space

        // byte b=scn.nextByte();
        boolean bb=scn.hasNextInt();

        // System.out.println(n);
        // System.out.println(f);
        // System.out.println(s);
        System.out.println(bb);

       
        scn.close();
    }
}

//class Scanner is used to take input from the keyboard
// we need to import java.util.Scanner package to use Scanner class
// Some of the methods of Scanner class are:
// nextInt() - to take integer input    
// nextFloat() - to take float input
// nextDouble() - to take double input

// next() - to take string input upto next space
// nextLine() - to take string input including spaces

// nextByte() - to take byte input
// nextLong() - to take long input
// nextBoolean() - to take boolean input
// nextShort() - to take short input

//hasNextInt() - to check if the next input is an integer
//hasNextFloat() - to check if the next input is a float    


