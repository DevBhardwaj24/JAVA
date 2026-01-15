public class TryCatchBlock {
    public static void main(String[] args) {
        try {
            int a,b,c;
            a=10;
            b=0;
            c=a/b;
            System.out.println("result is:"+ c);
        } 
        catch (ArithmeticException e) {
            System.out.println("division by zero "+ e);
        } 
        System.out.println("end of the program");
    }
}


//1. we can have multiple catch block for a single try block based on number of exception in a program

