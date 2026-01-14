public class  Check_size_range {
    public static void main(String[] args){
        //short s = 10;
        System.out.println(Integer.BYTES);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.TYPE);
        System.out.println(Integer.SIZE);

    }
}

// Purpose: Demonstrates Java's Integer class properties and constants

// Key Methods Used:

// Integer.BYTES - Shows number of bytes used (4 bytes for int)
// Integer.MAX_VALUE - Shows maximum value an int can hold
// Integer.SIZE - Shows bit size of int (32 bits)

// Important Concepts:

// Integer is a wrapper class for primitive type int
// Java integers are 32-bit signed numbers
// Memory allocation is fixed (4 bytes)
// Range: -2^31 to (2^31 - 1)