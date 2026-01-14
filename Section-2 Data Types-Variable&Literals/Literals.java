public class Literals {
    public static void main(String[] args) {
        int decimalLiteral = 10;          // Decimal literal
        int hexadecimalLiteral = 0xA;     // Hexadecimal literal
        int octalLiteral = 012;           // Octal literal
        int binaryLiteral = 0b1010;     // Binary literal

        System.out.println("Decimal Literal: " + decimalLiteral);
        System.out.println("Hexadecimal Literal: " + hexadecimalLiteral);
        System.out.println("Octal Literal: " + octalLiteral);
        System.out.println("Binary Literal: " + binaryLiteral);

        long longLiteral = 999999999999L; // so like we can assign the long interger value but if the value is out of range of int then we have to use L or l at the end of the value.
        System.out.println("Long Literal: " + longLiteral);
    }
}

// Purpose: Demonstrates different types of integer literals in Java
// Key Concepts:
// Decimal, Hexadecimal, Octal, and Binary literals 
// All literals represent the same integer value (100 in decimal)
// Important Methods Used: None
// Output:
// Decimal Literal: 10
// Hexadecimal Literal: 10
// Octal Literal: 10
// Binary Literal: 10
