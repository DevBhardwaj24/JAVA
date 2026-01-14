public class FinalKeywords {

    static final int X; // if not going with the in place initialization of the variable we can make a instance for it 

    //X=10; this is not a good practice
    static
    {
        X=10;// this is a instance block which help us to initialise the varible afterwards
    }

    // another way is build a constructor for it
    //public FinalKeywords{
    // X=10;
    // }
    
    public static void main(String[] args) {
        System.out.println(X);

    }
}


// if u make a method final we cannot override it in there subclass
// final class cannot be inherited
