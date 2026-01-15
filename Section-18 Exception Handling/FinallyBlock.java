public class FinallyBlock {
    public static void main(String[] args) throws Exception {

        try {
            System.out.println(10/0);
        } finally {
            System.out.println("final message");// this final block is excuted compulsory even the program crashes
        }        
    }
}


