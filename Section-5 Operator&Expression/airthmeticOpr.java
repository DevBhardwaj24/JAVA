public class airthmeticOpr{
    public static void main(String[] args) {
        //+ - / % * --> this can be applied on every datatype except boolean
        int a=10;
        int b=3;
        System.out.println(a%b);//gives remainder
        System.out.println(10/3);//gives quotient
        System.out.println(10*3);

        System.out.println(a+b/2);
        //byte c=1;
        //short s=14;
        float f=2;
        System.out.println(a+f);//automatically adds up the decimal after the digit
    }
}

// operator and Expressions--
//Increment and Decrement operator--> post++ , pre++ , post-- , pre---
//Assignment operator --> = , += , -= , *= , /= , %=
//Relational operator --> > , < , >= , <= , == , !=
//Logical operator --> && , || , !
//Bitwise operator --> & , | , ^ , ~ , << , >>
//Ternary operator --> ? :
//Type casting --> converting one datatype to another datatype
//Expression --> combination of variables , constants , operators
//Operator --> special symbols that perform specific operations on one , two or more operands
//Operand --> variables or constants on which operators perform operations
//Precedence --> which operator is executed first in an expression
//Associativity --> order in which operators of same precedence are executed
//Hierarchy of operators -->
//1. Postfix --> expr++ , expr--
//2. Prefix --> ++expr , --expr , +expr , -expr , ~ , !
//3. Multiplicative --> * , / , %
//4. Additive --> + , -
//5. Shift --> << , >> , >>>
//6. Relational --> < , > , <= , >= , instanceof
//7. Equality --> == , !=
//8. Bitwise AND --> &
//9. Bitwise XOR --> ^
//10. Bitwise OR --> |
//11. Logical AND --> &&
//12. Logical OR --> ||
//13. Ternary --> ? :
//14. Assignment --> = , += , -= , *= , /= , %= , &= , ^= , |= , <<= , >>= , >>>=
//15. Comma --> ,
//Note --> higher the operator in the hierarchy , higher is its precedence