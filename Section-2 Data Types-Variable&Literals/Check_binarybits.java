

public class Check_binarybits {
    public static void main(String[] args) {
        int x =-5;
        System.out.println(Integer.toBinaryString(x));
    }
}

// Purpose: Demonstrates binary representation of negative integers in Java
// Key Concepts:    
// Two's Complement Representation
// Integer.toBinaryString() method
// Important Methods Used:
// Integer.toBinaryString(int i) - Converts an integer to its binary string representation
// Output:
// 11111111111111111111111111111011
// Explanation:
// In Java, negative integers are represented using two's complement.
// For -5, the binary representation is obtained by inverting the bits of 5 (00000000000000000000000000000101) and adding 1, resulting in 11111111111111111111111111111011. 
// the answer is displayed in 32 bits as Java uses 32-bit signed integers.

