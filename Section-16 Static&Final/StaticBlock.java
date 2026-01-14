public class StaticBlock {

    static {
        System.out.println("Block 1");
    }

    public static void main(String[] args) {
        System.out.println("Main");
        
    }

    static {
        System.out.println("Block 2");
    }
}


// as you can see that the static block runs first even there is nothing in the main method and the order is based on the initialisiation 
// same as if there is a print statment in the main method it will be executed after the static block