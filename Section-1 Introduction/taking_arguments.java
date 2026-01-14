public class taking_arguments {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}
// as you can see the firts we need to locate to the diectory where the file is located
// then we need to compile the file using javac taking_arguments.java
// after that we can run the file using java taking_arguments arg1 arg2
// where arg1 and arg2 are the arguments we want to pass to the program
